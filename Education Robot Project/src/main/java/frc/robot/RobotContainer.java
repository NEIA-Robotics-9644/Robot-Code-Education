// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import frc.robot.Constants.OIConstants;
import frc.robot.commands.SwerveJoystickCmd;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.SwerveSubsystem;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  private final Joystick driverJoystick = new Joystick(OIConstants.kDriverControllerPort); //whole controller
  private final SwerveSubsystem swerveSubsystem = new SwerveSubsystem();

  public RobotContainer() {
    swerveSubsystem.setDefaultCommand(new SwerveJoystickCmd(swerveSubsystem,
        () -> driverJoystick.getRawAxis(OIConstants.kDriveXAxisIdx),
        () -> driverJoystick.getRawAxis(OIConstants.kDriveYAxisIdx),
        () -> driverJoystick.getRawAxis(OIConstants.kTurnAxisIdx),
        () -> !driverJoystick.getRawButton(OIConstants.kFieldOrientedButtonIdx)
    ));

    configureButtonBindings();
  }

  private void configureButtonBindings() {
    new JoystickButton(driverJoystick, OIConstants.kZeroHeadingButtonIdx)
        .onTrue(() -> swerveSubsystem.zeroHeading());
    new JoystickButton(driverJoystick, OIConstants.kTurn360ButtonIdx)
        .onTrue(() -> swerveSubsystem.turn360());
  }

  public Command getAutonomousCommand() {
    System.out.println("No auto commands yet");
    return null;
  }


}
