package subsystems.io;

// Represents a specific type of motor controller (like a SparkMax).
public class ArmSparkMaxIO implements ArmMotorIO {
    public ArmSparkMaxIO() {

        System.out.println("ArmSparkMaxIO initialized.");

        
    }

    @Override
    public void moveArm() {
        System.out.println("Arm motor (SparkMax) moving...");
        
    }
}
