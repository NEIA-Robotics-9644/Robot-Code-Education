// ArmSubsystem.java
// Represents a simulated robot arm.
//
// TODOs:
//  1. Store a reference to an ArmMotorIO object.
//  2. Implement methods liftArm(), lowerArm(), and stopArm()
//     that call motor.setPower() with positive, negative, or zero values.
//  3. Print messages describing what the arm is doing.
//
// 🔍 Java references:
//   - Interfaces
//   - Object fields and constructors

package subsystems;

import subsystems.io.ArmMotorIO;

public class ArmSubsystem {
    // TODO: add private ArmMotorIO field
    private final ArmMotorIO armMotorIO;

    public ArmSubsystem(ArmMotorIO armMotorIO){
        System.out.println("Arm Subsystem is Initialized: ");
        this.armMotorIO= armMotorIO;

    }
    // TODO: constructor that accepts ArmMotorIO
    
    // TODO: implement liftArm(), lowerArm(), stopArm()
    public void liftArm(){
        armMotorIO.setPower(0.1);
    }
    public void lowerArm(){
        armMotorIO.setPower(-0.1);
    }
    public void stopArm(){
        armMotorIO.setPower(0.0);
    }
}
