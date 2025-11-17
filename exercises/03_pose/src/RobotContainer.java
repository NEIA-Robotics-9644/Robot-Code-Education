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

    double FIELD_WIDTH_M = 8.23;
    double FIELD_HEIGHT_M = 16.46;
    double LINEAR_ACCEL_MPS2 = 1;
    double ROT_ACCEL_DPS2 = 1;
    
    // TODO: Instantiate the PoseSubsystem and Robot
    // PoseSubsystem poseSubsystem = new PoseSubsystem(...);
    // Robot robot = new Robot(poseSubsystem);

        private final PoseSubsystem poseSubsystem = new PoseSubsystem(ROT_ACCEL_DPS2, FIELD_WIDTH_M, FIELD_HEIGHT_M, LINEAR_ACCEL_MPS2);
        private final Robot robot = new Robot(poseSubsystem);
        
    public Robot getRobot() {

        // TODO: Return the robot instance
        return robot;
    }
}
