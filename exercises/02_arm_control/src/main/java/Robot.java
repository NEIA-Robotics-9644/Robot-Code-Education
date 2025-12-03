package main.java;
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

import main.java.RobotContainer;

public class Robot {
    public RobotContainer robotContainer;

        // TODO: add RobotContainer field
        


        // TODO: implement init() to create RobotContainer
        public void init(){
            this.robotContainer = new RobotContainer();
            this.robotContainer.initialize();
        }
        // TODO: add liftArm(), lowerArm(), stopArm(), shutdown() methods
        public void liftArm(){
            if(robotContainer != null){
                liftArm();
            }else{
                System.out.println("Not Initialized");
            }
        }
        public void lowerArm(){
            if(robotContainer != null){
                lowerArm();
            }else{
                System.out.println("Not Initialized");
            }
        }
        public void stopArm(){
            if(robotContainer != null){
                stopArm();
            }else{
                System.out.println("Not Initialized");
            }
        }
        public void shutdown(){
            if(robotContainer==null){
                System.out.println("Not Initialized");
            }
        }
        
}
