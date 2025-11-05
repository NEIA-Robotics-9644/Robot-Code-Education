// The Robot class represents your robot.
// It owns a RobotContainer that creates all subsystems.
public class Robot {

    private final RobotContainer RobotContainer;
    

    public Robot() {
        System.out.println("Constructing Robot...");
        RobotContainer = new RobotContainer();

       
    }

    public void start() {

        System.out.println("Robot started.");
        RobotContainer.initialize();
        
    }
}
