// Robot.java
// Represents the overall robot — connects high-level actions to subsystems.
//
// TODOs:
//  1. Hold a reference to a RobotContainer.
//  2. Create an init() method to construct the RobotContainer.
//  3. Add methods liftArm(), lowerArm(), stopArm(), and shutdown()
//     that call into the RobotContainer.
//
// 🔍 Java references:
//   - Object composition ("has-a" relationships)
//   - Method calls between objects

import subsystems.ArmSubsystem;

public class Robot {

    private RobotContainer robotContainer;

    public void init(){
        System.out.println("Robot initializing...");
        this.robotContainer = new RobotContainer();
        this.robotContainer.initialize();
        }

        public void liftArm(){
            if (robotContainer != null){
                robotContainer.getArmSubsystem().liftArm();
            } else {
                System.out.println("Robot not initialized");
            }
        }

        public void lowerArm(){
            if (robotContainer != null){
                robotContainer.getArmSubsystem().lowerArm();
            } else {
                System.out.println("Robot not initialized");
            }
        }
        public void stopArm(){
            if (robotContainer != null){
                robotContainer.getArmSubsystem().stopArm();

            } else {
                System.out.println("Robot not initialized");
            }
        }
        public void shutdown(){
            if (robotContainer != null){
                robotContainer.getArmSubsystem().shutdown();

            } else {
                System.out.println("Robot not initialized");
            }
        }


    }
    
    // TODO: add RobotContainer field

    // TODO: implement init() to create RobotContainer

    // TODO: add liftArm(), lowerArm(), stopArm(), shutdown() methods

