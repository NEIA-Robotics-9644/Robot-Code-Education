package subsystems;

import subsystems.io.ArmMotorIO;
import subsystems.io.ArmSparkMaxIO;

// Represents the robot’s arm mechanism.



public class ArmSubsystem {

    private final ArmMotorIO ArmMotorIO ;


    // TODO: declare a private ArmMotorIO variable GOOD

    public ArmSubsystem() {

        ArmMotorIO = new ArmSparkMaxIO();
        System.out.println("Constructing ArmSubsystem");



        // TODO: print "Constructing ArmSubsystem..." GOOD
        // TODO: assign ArmMotorIO variable to a new ArmSparkMaxIO GOOD
    }

    public void test() {

        System.out.println("Testing ArmSubsystem...");
        ArmMotorIO.moveArm(0);

        // TODO: print "Testing ArmSubsystem..." GOOD
        // TODO: call a method on the ArmMotorIO (e.g., moveArm()) GOOD
    }
}
