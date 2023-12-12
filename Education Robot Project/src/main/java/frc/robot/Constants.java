// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.util.Units;

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

    // TODO: Set these constants to the correct physical values for our robot
    // Distance betweeen the left and right wheels on the robot
    public static final double kTrackWidth = Units.inchesToMeters(21);

    // Distance between the front and back wheels on the robot
    public static final double kWheelBase = Units.inchesToMeters(25.5);
    
    public static final SwerveDriveKinematics kDriveKinematics = new SwerveDriveKinematics(
        new Translation2d(kTrackWidth / 2, kWheelBase / 2),
        new Translation2d(kTrackWidth / 2, -kWheelBase / 2),
        new Translation2d(-kTrackWidth / 2, kWheelBase / 2),
        new Translation2d(-kTrackWidth / 2, -kWheelBase / 2));
    
    
    public static final double kPhysicalMaxSpeedMetersPerSecond = 5;

    public static final double kTeleDriveMaxAccelerationUnitsPerSec = 1.5;
    public static final double kTeleDriveMaxSpeedMetersPerSec = 3;
    public static final double kTeleDriveMaxAngularSpeedRadiansPerSec = 3 * Math.PI;

    public static final int kPigeonIMUCanId = 0;

    // Constants for SwerveSubsystem frontLeft, frontRight, backLeft, backRight SwerveModules

    public static final int kFrontLeftDriveMotorPort = 0;
    public static final int kFrontLeftTurningMotorPort = 1;
    public static final boolean kFrontLeftDriveEncoderReversed = false;
    public static final boolean kFrontLeftTurningEncoderReversed = false;
    public static final int kFrontLeftDriveAbsoluteEncoderPort = 0;
    public static final double kFrontLeftDriveAbsoluteEncoderOffsetRad = 0;
    public static final boolean kFrontLeftDriveAbsoluteEncoderReversed = false;

    public static final int kFrontRightDriveMotorPort = 2;
    public static final int kFrontRightTurningMotorPort = 3;
    public static final boolean kFrontRightDriveEncoderReversed = false;
    public static final boolean kFrontRightTurningEncoderReversed = false;
    public static final int kFrontRightDriveAbsoluteEncoderPort = 1;
    public static final double kFrontRightDriveAbsoluteEncoderOffsetRad = 0;
    public static final boolean kFrontRightDriveAbsoluteEncoderReversed = false;

    public static final int kBackLeftDriveMotorPort = 4;
    public static final int kBackLeftTurningMotorPort = 5;
    public static final boolean kBackLeftDriveEncoderReversed = false;
    public static final boolean kBackLeftTurningEncoderReversed = false;
    public static final int kBackLeftDriveAbsoluteEncoderPort = 2;
    public static final double kBackLeftDriveAbsoluteEncoderOffsetRad = 0;
    public static final boolean kBackLeftDriveAbsoluteEncoderReversed = false;

    public static final int kBackRightDriveMotorPort = 6;
    public static final int kBackRightTurningMotorPort = 7;
    public static final boolean kBackRightDriveEncoderReversed = false;
    public static final boolean kBackRightTurningEncoderReversed = false;
    public static final int kBackRightDriveAbsoluteEncoderPort = 3;
    public static final double kBackRightDriveAbsoluteEncoderOffsetRad = 0;
    public static final boolean kBackRightDriveAbsoluteEncoderReversed = false;
  }

  public static class ModuleConstants {
    // TODO: Measure these values on the actual robot
    public static final double kWheelDiameterMeters = Units.inchesToMeters(4);
    public static final double kDriveMotorGearRatio = 1 / 6.75;
    public static final double kTurningMotorGearRatio = 1 / (double)(150.0/7.0);
    public static final double kDriveEncoderRot2Meter = kDriveMotorGearRatio * Math.PI * kWheelDiameterMeters;
    public static final double kTurningEncoderRot2Rad = kDriveMotorGearRatio * 2 * Math.PI;
    public static final double kDriveEncoderRPM2MeterPerSec = kDriveEncoderRot2Meter / 60;
    public static final double kTurningEncoderRPM2RadPerSec = kTurningEncoderRot2Rad / 60;
    public static final double kPTurning = 0.5;
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
