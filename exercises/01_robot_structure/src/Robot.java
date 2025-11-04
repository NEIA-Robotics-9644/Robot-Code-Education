// The Robot class represents your robot.
// It owns a RobotContainer that creates all subsystems.
public class Robot {
    private RobotContainer m_Container;
    // TODO: declare a RobotContainer variable GOOD

    public Robot() {

       m_Container = new RobotContainer();
       System.out.println("Constructing Robot...");

        // TODO: print "Constructing Robot..." GOOD
        // TODO: initialize the RobotContainer GOOD
    }

    public void start() {
        System.out.println( "Robot started.");
        m_Container.initialize();


        // TODO: print "Robot started." GOOD
        // TODO: call initialize() on the RobotContainer GOOD
    }
}
