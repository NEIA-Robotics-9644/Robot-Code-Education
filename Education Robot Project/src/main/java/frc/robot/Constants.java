// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {


  public static class SwerveDriveConstants {

    // Distance betweeen the left and right wheels on the robot
    public static final double kTrackWidth = Units.inchesToMeters(26.5);

    // Distance between the front and back wheels on the robot
    public static final double kWheelBase = Units.inchesToMeters(26.5);
    

    public static final SwerveDriveKinematics kDriveKinematics = new SwerveDriveKinematics(
        new Translation2d(kTrackWidth / 2, kWheelBase / 2),
        new Translation2d(-kTrackWidth / 2, kWheelBase / 2),
        new Translation2d(kTrackWidth / 2, -kWheelBase / 2),
        new Translation2d(-kTrackWidth / 2, -kWheelBase / 2));
    
    
    public static final double kPhysicalMaxSpeedMetersPerSecond = 5;

    public static final double kTeleDriveMaxAccelerationUnitsPerSec = 1.5;
    public static final double kTeleDriveMaxSpeedMetersPerSec = 3;
    public static final double kTeleDriveMaxAngularSpeedRadiansPerSec = 3 * Math.PI;

    
    public static final int kPigeonIMUCanId = 14;

    // Constants for SwerveSubsystem frontLeft, frontRight, backLeft, backRight SwerveModules

    public static final int kFrontLeftDriveMotorPort = 1;
    public static final int kFrontLeftTurningMotorPort = 2;
    public static final boolean kFrontLeftDriveEncoderReversed = false;
    public static final boolean kFrontLeftTurningEncoderReversed = false;
    public static final int kFrontLeftDriveAbsoluteEncoderPort = 9;
    public static final double kFrontLeftDriveAbsoluteEncoderOffsetRad = Math.PI/2.0;
    public static final boolean kFrontLeftDriveAbsoluteEncoderReversed = false;

    public static final int kFrontRightDriveMotorPort = 3;
    public static final int kFrontRightTurningMotorPort = 4;
    public static final boolean kFrontRightDriveEncoderReversed = false;
    public static final boolean kFrontRightTurningEncoderReversed = false;
    public static final int kFrontRightDriveAbsoluteEncoderPort = 10;
    public static final double kFrontRightDriveAbsoluteEncoderOffsetRad = Math.PI/2.0;
    public static final boolean kFrontRightDriveAbsoluteEncoderReversed = false;

    public static final int kBackRightDriveMotorPort = 5;
    public static final int kBackRightTurningMotorPort = 6;
    public static final boolean kBackRightDriveEncoderReversed = false;
    public static final boolean kBackRightTurningEncoderReversed = false;
    public static final int kBackRightDriveAbsoluteEncoderPort = 11;
    public static final double kBackRightDriveAbsoluteEncoderOffsetRad = Math.PI/2.0;
    public static final boolean kBackRightDriveAbsoluteEncoderReversed = false;

    public static final int kBackLeftDriveMotorPort = 7;
    public static final int kBackLeftTurningMotorPort = 8;
    public static final boolean kBackLeftDriveEncoderReversed = false;
    public static final boolean kBackLeftTurningEncoderReversed = false;
    public static final int kBackLeftDriveAbsoluteEncoderPort = 12;
    public static final double kBackLeftDriveAbsoluteEncoderOffsetRad = Math.PI/2.0;
    public static final boolean kBackLeftDriveAbsoluteEncoderReversed = false;

 
  }

  public static class ModuleConstants {
    public static final double kWheelDiameterMeters = Units.inchesToMeters(4);
    public static final double kDriveMotorGearRatio = 1 / 6.75;
    public static final double kTurningMotorGearRatio = 1 / (double)(150.0/7.0);
    public static final double kDriveEncoderRot2Meter = kDriveMotorGearRatio * Math.PI * kWheelDiameterMeters;
    public static final double kTurningEncoderRot2Rad = kTurningMotorGearRatio * 2 * Math.PI;
    public static final double kDriveEncoderRPM2MeterPerSec = kDriveEncoderRot2Meter / 60;
    public static final double kTurningEncoderRPM2RadPerSec = kTurningEncoderRot2Rad / 60;
    public static final double kPTurning = 0.6;
    public static final double kITurning = 0.003;
    public static final double kDTurning = 0.001;


    public static double kPTurning() {
      return SmartDashboard.getNumber("Swerve Module kPTurning", 0.0);
    }

    public static double kITurning() {
      return SmartDashboard.getNumber("Swerve Module kITurning", 0.0);
    }

    public static double kDTurning() {
      return SmartDashboard.getNumber("Swerve Module kDTurning", 0.0);
    }
  }

  public static class OIConstants {
    public static final int kDriverControllerPort = 0;
    public static final int kOperatorControllerPort = 1;

    public static final double kDeadband = 0.05;

    public static final int kDriveXAxisIdx = 0;
    public static final int kDriveYAxisIdx = 1;
    public static final int kTurnAxisIdx = 4;

    public static final int kFieldOrientedButtonIdx = 1;
    public static final int kZeroHeadingButtonIdx = 2;
  }
}
