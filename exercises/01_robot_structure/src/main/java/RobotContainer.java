// The RobotContainer connects the subsystems and IO.
// In a real robot, this is where commands and button bindings would be set up.
import subsystems.ArmSubsystem;
import subsystems.io.ArmMotorIO;
import subsystems.io.ArmSparkMaxIO;

public class RobotContainer {
    // TODO: declare a private ArmSubsystem variable
    private final ArmSubsystem armSubsystem;
    public RobotContainer() {
        // TODO: print "Setting up RobotContainer..."
        System.out.println("Setting up RobotContainer...");
        // TODO: create an instance of ArmSubsystem
        armSubsystem= new ArmSubsystem(new ArmSparkMaxIO());
    }
    public void initialize() {
        // TODO: print "Initializing subsystems..."
        System.out.println("Initializing subsystems...");
        // TODO: call test() on ArmSubsystem
        armSubsystem.test();
    }
}
