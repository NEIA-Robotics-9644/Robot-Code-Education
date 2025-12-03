package subsystems;

import subsystems.io.ArmMotorIO;
import subsystems.io.ArmSparkMaxIO;

// Represents the robot’s arm mechanism.
public class ArmSubsystem {
    // TODO: declare a private ArmMotorIO variable
    private final ArmMotorIO arm;

    public ArmSubsystem(ArmMotorIO arm) {
        // TODO: print "Constructing ArmSubsystem..."
        System.out.println("Constructing ArmSubsystem...");
        // TODO: assign ArmMotorIO variable to a new ArmSparkMaxIO
        this.arm = arm;
    }

    public void test() {
        // TODO: print "Testing ArmSubsystem..."
        System.out.println("Testing ArmSubsystem");
        // TODO: call a method on the ArmMotorIO (e.g., moveArm())
        arm.moveArm();
    }
}
