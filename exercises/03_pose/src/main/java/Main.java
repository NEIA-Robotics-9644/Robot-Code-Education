package main.java.utils;
import java.io.File;

/**
 * Entry point for the pose estimation simulator.
 *
 * This is NOT a WPILib project — it simply mimics the FRC structure.
 * The robot reads a JSON file describing motion steps and prints
 * its position after each step.
 *
 * Units:
 *   Position: meters
 *   Heading: degrees (north = 0, clockwise positive)
 */
public class Main {

    

    public static void Main(String[] args) {
        RobotContainer robotContainer= new RobotContainer();
        Robot robot = new Robot();
        String file_name = "movepattern1";
        File file = new File(file_name);
        file.isFile();
        boolean realFile= file.exists();
        if(realFile== false){
            System.out.println("This file does not exist");
        }else{
            System.out.println("File exists!");
            runSequence(file);
        }
        
        // TODO: Create RobotContainer and Robot objects
        // TODO: Choose one JSON file from the /sequences folder (e.g., "basic_path.json")
        // TODO: Load the sequence steps from JSON

        // TODO: Run the robot through each movement step
        // TODO: After each step, print robot pose to console
        

    }
}
