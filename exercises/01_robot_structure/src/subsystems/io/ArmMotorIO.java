package subsystems.io;

// Interface that defines how any arm motor should behave.
public interface ArmMotorIO {
    

    void moveArm(double speed);

    // TODO: define a method signature called moveArm() that returns nothing GOOD
}
