package subsystems.io;

// Represents a specific type of motor controller (like a SparkMax).
public class ArmSparkMaxIO implements ArmMotorIO {
    public ArmSparkMaxIO() {
        // TODO: print "ArmSparkMaxIO initialized."
        System.out.println("ArmSparkMaxIP initialized");
    }

    @Override
    public void moveArm() {
        // TODO: print "Arm motor (SparkMax) moving..."
        System.out.println("Arm moter (Spark Max) is moving");
    }
}
