// The RobotContainer connects the subsystems and IO.
// In a real robot, this is where commands and button bindings would be set up.
import subsystems.ArmSubsystem;

public class RobotContainer {
    private final ArmSubsystem armSubsystem;

    // TODO: declare a private ArmSubsystem variable

    public RobotContainer() {

        System.out.println("Setting up RobotContainer...");
        armSubsystem = new ArmSubsystem();

        //print "Setting up RobotContainer..."
        //create an instance of ArmSubsystem
    }

    public void initialize() {
        Systme.out.println("Initializing subsystems...");
        armSubsystem.test();

        //print "Initializing subsystems..."
        // call test() on ArmSubsystem
    }
}
