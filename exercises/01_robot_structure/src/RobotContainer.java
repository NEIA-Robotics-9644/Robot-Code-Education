// The RobotContainer connects the subsystems and IO.
// In a real robot, this is where commands and button bindings would be set up.
import subsystems.ArmSubsystem;

public class RobotContainer {

    private final ArmSubsystem ArmSubsystem;


    public RobotContainer() {

        System.out.println("Setting up RobotContainer...");
        
        ArmSubsystem = new ArmSubsystem();

        
    }

    public void initialize() {

        System.out.println("Initializing subsystems...");
        ArmSubsystem.test();

        
    }
}
