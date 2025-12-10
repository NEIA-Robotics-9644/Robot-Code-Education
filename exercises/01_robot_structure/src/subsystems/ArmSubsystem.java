package subsystems;

import subsystems.io.ArmMotorIO;
import subsystems.io.ArmSparkMaxIO;

// Represents the robot’s arm mechanism.
public class ArmSubsystem {
    private final ArmMotorIO aMotorIO;
  
    // TODO: declare a private ArmMotorIO variable

    public ArmSubsystem() {
        System.out.println("Constructing ArmSubsystem..");
        aMotorIO = new ArmSparkMaxIO();

        // TODO: print "Constructing ArmSubsystem..."
        // TODO: assign ArmMotorIO variable to a new ArmSparkMaxIO
    }

    public void test() {
        System.out.println("Testing ArmSubsystem...");
        armMotorIO.moveArm();
        

        // TODO: print "Testing ArmSubsystem..."
        // TODO: call a method on the ArmMotorIO (e.g., moveArm())
    }
}
