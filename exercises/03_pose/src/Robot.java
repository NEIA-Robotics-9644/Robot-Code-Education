/**
 * Represents the overall robot system.
 *
 * Responsible for managing the robot's lifecycle and coordinating subsystems.
 */
public class Robot {

    RobotContainer RobotContainer = new RobotContainer();
    Robot robot = new Robot();
    

    // TODO: Constructor should accept a PoseSubsystem (dependency injection)

    public void runSequence(String jsonPath) {

        // TODO: Parse movement steps from JSON file
        // TODO: Loop through each MovementStep
        //   - Update pose using subsystem logic
        //   - Clamp to field borders
        //   - Print new pose
    }
}
