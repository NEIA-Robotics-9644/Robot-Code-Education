// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Subsystem;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.SwerveDriveConstants;

import java.util.Set;

import com.ctre.phoenixpro.hardware.Pigeon2;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.kinematics.SwerveModuleState;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class SwerveSubsystem extends SubsystemBase {
    private final SwerveModule frontLeft = new SwerveModule(
            "Front Left",
            SwerveDriveConstants.kFrontLeftDriveMotorPort,
            SwerveDriveConstants.kFrontLeftTurningMotorPort,
            SwerveDriveConstants.kFrontLeftDriveEncoderReversed,
            SwerveDriveConstants.kFrontLeftTurningEncoderReversed,
            SwerveDriveConstants.kFrontLeftDriveAbsoluteEncoderPort,
            SwerveDriveConstants.kFrontLeftDriveAbsoluteEncoderOffsetRad,
            SwerveDriveConstants.kFrontLeftDriveAbsoluteEncoderReversed
    );

    private final SwerveModule frontRight = new SwerveModule(
            "Front Right",
            SwerveDriveConstants.kFrontRightDriveMotorPort,
            SwerveDriveConstants.kFrontRightTurningMotorPort,
            SwerveDriveConstants.kFrontRightDriveEncoderReversed,
            SwerveDriveConstants.kFrontRightTurningEncoderReversed,
            SwerveDriveConstants.kFrontRightDriveAbsoluteEncoderPort,
            SwerveDriveConstants.kFrontRightDriveAbsoluteEncoderOffsetRad,
            SwerveDriveConstants.kFrontRightDriveAbsoluteEncoderReversed
    );

    private final SwerveModule backLeft = new SwerveModule(
            "Back Left",
            SwerveDriveConstants.kBackLeftDriveMotorPort,
            SwerveDriveConstants.kBackLeftTurningMotorPort,
            SwerveDriveConstants.kBackLeftDriveEncoderReversed,
            SwerveDriveConstants.kBackLeftTurningEncoderReversed,
            SwerveDriveConstants.kBackLeftDriveAbsoluteEncoderPort,
            SwerveDriveConstants.kBackLeftDriveAbsoluteEncoderOffsetRad,
            SwerveDriveConstants.kBackLeftDriveAbsoluteEncoderReversed
    );

    private final SwerveModule backRight = new SwerveModule(
            "Back Right",
            SwerveDriveConstants.kBackRightDriveMotorPort,
            SwerveDriveConstants.kBackRightTurningMotorPort,
            SwerveDriveConstants.kBackRightDriveEncoderReversed,
            SwerveDriveConstants.kBackRightTurningEncoderReversed,
            SwerveDriveConstants.kBackRightDriveAbsoluteEncoderPort,
            SwerveDriveConstants.kBackRightDriveAbsoluteEncoderOffsetRad,
            SwerveDriveConstants.kBackRightDriveAbsoluteEncoderReversed
    );

    private final Pigeon2  gyro = new Pigeon2(SwerveDriveConstants.kPigeonIMUCanId);

    private int timer;

    public SwerveSubsystem() {
        //Put the call to reset on another thread and wait for 1 sec to let the gyro recalibrate
        timer = 0;
        new Thread(() -> {
            try {
                Thread.sleep(1000);
                zeroHeading();
            } catch (Exception e) {             
            }
        }).start();
    }
    
    public Set<Subsystem> zeroHeading() {
        gyro.reset();
        return null;
    }

    public double getHeading() {
        return Math.IEEEremainder(gyro.getAngle(), 360);
    }

    public Rotation2d getRotation2d() {
        return Rotation2d.fromDegrees(getHeading());
    }

    @Override
    public void periodic() {
        

        if (timer >= 10) {
            SmartDashboard.putNumber("Robot Heading", getHeading());
            SmartDashboard.putNumber("Front Left Abs Encoder", frontLeft.getTurningPosition());
            SmartDashboard.putNumber("Front Right Abs Encoder", frontRight.getTurningPosition());
            SmartDashboard.putNumber("Back Left Abs Encoder", backLeft.getTurningPosition());
            SmartDashboard.putNumber("Back Right Abs Encoder", backRight.getTurningPosition());
            timer = 0;
        } else {
            timer++;
        }
    }

    public void stopModules() {
        frontLeft.stop();
        frontRight.stop();
        backLeft.stop();
        backRight.stop();
    }

    public void setModuleStates(SwerveModuleState[] desiredStates) {
        // TODO: check if this does what it is supposed to
        SwerveDriveKinematics.desaturateWheelSpeeds(desiredStates, SwerveDriveConstants.kPhysicalMaxSpeedMetersPerSecond);
        frontLeft.setDesiredState(desiredStates[0]);
        frontRight.setDesiredState(desiredStates[1]);
        backLeft.setDesiredState(desiredStates[2]);
        backRight.setDesiredState(desiredStates[3]);

    }
};
