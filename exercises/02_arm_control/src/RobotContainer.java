// RobotContainer.java
// This is where subsystems are created and connected.
//
// TODOs:
//  1. Create an ArmSubsystem instance.
//  2. Pass in a mock I/O implementation (ArmMockIO).
//  3. Add a getArmSubsystem() method so Robot can access it.
//
// 🔍 Java references:
//   - Constructors
//   - Returning objects from methods

import subsystems.ArmSubsystem;
import subsystems.io.ArmMockIO;

public class RobotContainer {

    private final ArmSubsystem arm;

    // TODO: declare ArmSubsystem field

    public RobotContainer() {

        System.out.println("Setting up RobotContainer");
        arm = new ArmSubsystem(new ArmMockIO());
        
       


        // TODO: initialize ArmSubsystem with new ArmMockIO()
    }

    public void initialize(){
        System.out.println("Intailzing subsystem...");
    }

    public ArmSubsystem getArmSubsystem(){
        return arm;
    }

    // TODO: create getArmSubsystem() method
}
