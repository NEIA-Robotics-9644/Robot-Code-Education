package subsystems;

import subsystems.io.ArmMotorIO;
import subsystems.io.ArmSparkMaxIO;

// Represents the robot’s arm mechanism.
public class ArmSubsystem {

        private final ArmMotorIO ArmMotorIO; 


    public ArmSubsystem() {

        System.out.println("Constructing ArmSubsystem...");
        ArmMotorIO  = new ArmSparkMaxIO();

        
    }

    public void test() {


        System.out.println("Testing ArmSubsystem...");
        ArmMotorIO.moveArm();

        
    }
}
