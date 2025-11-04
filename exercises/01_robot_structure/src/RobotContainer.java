// The RobotContainer connects the subsystems and IO.
// In a real robot, this is where commands and button bindings would be set up.
import subsystems.ArmSubsystem;



public class RobotContainer {
    // TODO: declare a private ArmSubsystem variable GOOD

    private final ArmSubsystem Arm;

    public RobotContainer() {

        Arm = new ArmSubsystem();

        System.out.println("Setting up RobotContainer...");

        // TODO: print "Setting up RobotContainer..." GOOD
        // TODO: create an instance of ArmSubsystem GOOD
    }

    public void initialize() {
        
        System.out.println("Initializing subsystems..");
        Arm.test();

        // TODO: print "Initializing subsystems...GOOD
        // TODO: call test() on ArmSubsystem GOOD
    }
}
