package main.java;
// Main.java
// Entry point for your simulated robot program.
//
// TODOs:
//  1. Create a Robot object and call its init() method.
//  2. Use a Scanner to read user input from the console.
//  3. In a loop, let the user type "up", "down", "stop", or "exit".
//  4. Call the appropriate robot methods based on the command.
//
// 🔍 Java references:
//   - java.util.Scanner (for reading user input)
//   - switch statements (control flow)

import java.util.Scanner;

import main.java.Robot;

public class Main {
    public static void main(String[] args) {
        // TODO: create and initialize the robot
        Robot robot = new Robot();
        robot.init();
        // TODO: set up Scanner (look up this object type) and command loop
        boolean scanner_close;
        scanner_close= false;
        Scanner scanner = new Scanner(System.in);
        while(scanner_close!=true){
            String command = scanner.nextLine();
            switch(command){
                case "lift" : System.out.println("lift is working");
                    robot.robotContainer.getArmSubsystem().liftArm();
                    break;
                case "lower" : System.out.println("lower is working");
                    robot.robotContainer.getArmSubsystem().lowerArm();
                    break;
                case "stop" : System.out.println("stop is working");
                    robot.robotContainer.getArmSubsystem().stopArm();
                    break;
                case "exit" : System.out.println("exit is working") ;
                    scanner.close();
                    scanner_close = true;
                    break;
                default: System.out.println("nothing happend");
                    break;
                    
            }       
        }
    }
}
