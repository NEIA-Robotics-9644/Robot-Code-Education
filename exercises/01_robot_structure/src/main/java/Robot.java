// The Robot class represents your robot.
// It owns a RobotContainer that creates all subsystems.
public class Robot {
    // TODO: declare a RobotContainer variable
    private RobotContainer RobotContainer;
    public Robot() {
        // TODO: print "Constructing Robot..."
        System.out.println("Constructing Robot");
        // TODO: initialize the RobotContainer
        RobotContainer = new RobotContainer();

    }

    public void start() {
        // TODO: print "Robot started."
        System.out.println("Robot Started");
        // TODO: call initialize() on the RobotContainer
        RobotContainer.initialize();

    }
}
