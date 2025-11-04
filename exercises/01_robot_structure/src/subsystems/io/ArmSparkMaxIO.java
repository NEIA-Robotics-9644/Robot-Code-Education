package subsystems.io;

// Represents a specific type of motor controller (like a SparkMax).
public class ArmSparkMaxIO implements ArmMotorIO {

    
    public ArmSparkMaxIO() {
        System.out.println("ArmSparkMaxIO initialized.");
        // TODO: print "ArmSparkMaxIO initialized."GOOD
    }

    @Override
    public void moveArm(double speed){
        System.out.print("Arm motor (SparkMax) moving...");
    }
        // TODO: print "Arm motor (SparkMax) moving..."GOD
    //}
}
