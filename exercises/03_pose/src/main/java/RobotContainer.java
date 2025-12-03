
package main.java;

import main.java.subsystems.PoseSubsystem;

/**
 * The RobotContainer serves as the central wiring point.
 * Here you instantiate subsystems, constants, and create the Robot.
 */
public class RobotContainer {

    // TODO: Define constants like field size and accelerations
    //   - double FIELD_WIDTH_M
    //   - double FIELD_HEIGHT_M
    //   - double LINEAR_ACCEL_MPS2
    //   - double ROT_ACCEL_DPS2
    double headingDeg=0;
    double fieldWidth=20;
    double fieldHeight=20;
    double linearAccel=2;
    double rotAccel=2;

    // TODO: Instantiate the PoseSubsystem and Robot
    //PoseSubsystem poseSubsystem = new PoseSubsystem(...);
    //Robot robot = new Robot(poseSubsystem);
    //oseSubsystem  posesubsystem = new pos

    PoseSubsystem poseSubsystem = new PoseSubsystem(fieldWidth, fieldHeight, linearAccel, rotAccel);
    Robot robot = new Robot(poseSubsystem);
    
    public Robot getRobot() {
        // TODO: Return the robot instance
        return null;
    }
    public PoseSubsystem getposeSubsystem() {
        // TODO: Return the robot instance
        return poseSubsystem;
    }
}
