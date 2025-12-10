// The Robot class represents your robot.
// It owns a RobotContainer that creates all subsystems.


public class Robot {

    private final RobotContainer robotContainer;

    // declare a RobotContainer variable

    public Robot() {

        System.out.println("Constructing Robot...");
        robotContainer = new RobotContainer();

        // print "Constructing Robot..."
        // initialize the RobotContainer
    }

    public void start() {

        System.out.println("Robot started.");
        robotContainer.initialize();

        //print "Robot started."
        // call initialize() on the RobotContainer
    }
}
