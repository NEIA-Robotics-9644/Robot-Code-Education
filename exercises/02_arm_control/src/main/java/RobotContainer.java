package main.java;
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
    // TODO: declare ArmSubsystem field
    private final ArmSubsystem armSubsystem;

    public RobotContainer() {
        // TODO: initialize ArmSubsystem with new ArmMockIO()

        armSubsystem = new ArmSubsystem(new ArmMockIO());


    }
    public void initialize(){
        System.out.println("Initializing...");
    } 
    // TODO: create getArmSubsystem() method
    public ArmSubsystem getArmSubsystem() {
        return armSubsystem;
    }
}
