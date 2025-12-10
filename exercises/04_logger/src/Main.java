import java.io.File;
/*
    Entry point for the odometry simulator.

    This is NOT a WPILib project — it simply mimics the FRC structure.

    The robot is a motor that follows a movement pattern from a JSON
    and log their estimated position to csv files.

    Units:
        Position: meters
    
    TODOS:
        1. Instantiate the Robot Object
        2. Select a movement pattern JSON for the motor to follow
            using the Scanner class (java.util.Scanner)
        3. Pass the selected json to the OdometrySubsystem
 */

public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot();
        RobotContainer robotContainer = new RobotContainer(); 
        robot.init();
        String file_name = "motorMovementPattern1";
        File file = new File(file_name);
        //file.isFile();
        boolean realFile = file.exists();
        if(realFile == false){
            System.out.println("This file does not exist");
        }else{
            System.out.println("File exists!");
            runSequence(file);
        }

    }
}
