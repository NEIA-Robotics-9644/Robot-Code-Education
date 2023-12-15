package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.math.filter.SlewRateLimiter;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.math.kinematics.SwerveModuleState;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.OIConstants;
import frc.robot.Constants.SwerveDriveConstants;
import frc.robot.subsystems.SwerveSubsystem;

public class SwerveJoystickCmd extends CommandBase {
    private final SwerveSubsystem swerveSubsystem;
    private final Supplier<Double> xSpdFunction, ySpdFunction, turningSpdFunction;
    private final Supplier<Boolean> fieldOrientedFunction;
    private final SlewRateLimiter xLimiter, yLimiter, turningLimiter;

    public SwerveJoystickCmd(SwerveSubsystem swerveSubsystem,
                Supplier<Double> xSpdFunction, Supplier<Double> ySpdFunction,
                Supplier<Double> turningSpdFunction, Supplier<Boolean> fieldOrientedFunction) {
        this.swerveSubsystem = swerveSubsystem;
        this.xSpdFunction = xSpdFunction;
        this.ySpdFunction = ySpdFunction;
        this.turningSpdFunction = turningSpdFunction;
        this.fieldOrientedFunction = fieldOrientedFunction;

        this.xLimiter = new SlewRateLimiter(SwerveDriveConstants.kTeleDriveMaxAccelerationUnitsPerSec);
        this.yLimiter = new SlewRateLimiter(SwerveDriveConstants.kTeleDriveMaxAccelerationUnitsPerSec);
        this.turningLimiter = new SlewRateLimiter(SwerveDriveConstants.kTeleDriveMaxAccelerationUnitsPerSec);
        addRequirements(swerveSubsystem);


    }

    @Override
    public void execute() {
        // 1. Get the joystick values
        double xSpeed = xSpdFunction.get();
        double ySpeed = ySpdFunction.get();

        // Invert turning by default
        double turningSpeed = -turningSpdFunction.get();

        // 2. Apply a deadband to the joystick values
        xSpeed = Math.abs(xSpeed) > OIConstants.kDeadband ? xSpeed : 0;
        ySpeed = Math.abs(ySpeed) > OIConstants.kDeadband ? ySpeed : 0;
        turningSpeed = Math.abs(turningSpeed) > OIConstants.kDeadband ? turningSpeed : 0;

        // 3. Apply a slew rate limiter to the joystick values
        xSpeed = xLimiter.calculate(xSpeed) * SwerveDriveConstants.kTeleDriveMaxSpeedMetersPerSec;
        ySpeed = yLimiter.calculate(ySpeed) * SwerveDriveConstants.kTeleDriveMaxSpeedMetersPerSec;
        turningSpeed = turningLimiter.calculate(turningSpeed)
                * SwerveDriveConstants.kTeleDriveMaxAngularSpeedRadiansPerSec;

        // 4. Construct desired chassis speeds
        ChassisSpeeds chassisSpeeds;
        if (fieldOrientedFunction.get()) {
            chassisSpeeds = ChassisSpeeds.fromFieldRelativeSpeeds(xSpeed, ySpeed, turningSpeed,
                    swerveSubsystem.getRotation2d());
        } else {
            chassisSpeeds = new ChassisSpeeds(xSpeed, ySpeed, turningSpeed);
        }

        // 5. Calculate the desired module states
        SwerveModuleState[] moduleStates = SwerveDriveConstants.kDriveKinematics.toSwerveModuleStates(chassisSpeeds);
        
        // 6. Set the desired speeds on the drive motors
        swerveSubsystem.setModuleStates(moduleStates);
    }

    @Override
    public void end(boolean interrupted) {
        swerveSubsystem.stopModules();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
