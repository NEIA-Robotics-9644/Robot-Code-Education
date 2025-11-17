
import java.io.File;

/**
 * Entry point for the pose estimation simulator.
 *
 * This is NOT a WPILib project — it simply mimics the FRC structure.
 * The robot reads a JSON file describing motion steps and prints
 * its position after each step.
 *
 * Units:
 *
 *   Position: meters
 *   Heading: degrees (north = 0, clockwise positive)
 */
public class Main {
    RobotContainer RobotContainer = new RobotContainer();
    Robot robot = new Robot();
    

    public static void main(String[] args) {

        String filename = "sample";
        File file = new File(filename);
        file.isFile();
        boolean ThefileReal = file.exists(); 

        if (ThefileReal == false){
            System.out.println("THIS file is not real");
        }else{
            System.out.println("THIS file is not real");

        }



        // TODO: Create RobotContainer and Robot objects
        // TODO: Choose one JSON file from the /sequences folder (e.g., "basic_path.json")
        // TODO: Load the sequence steps from JSON
        // TODO: Run the robot through each movement step
        // TODO: After each step, print robot pose to console
    }
}
