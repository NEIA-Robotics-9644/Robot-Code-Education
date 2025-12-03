package main.java;
import java.io.File;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//import PoseSubsystem;
import java.io.FileReader;
import java.io.IOException;
import main.java.subsystems.PoseSubsystem;
/**
 * Represents the overall robot system.
 *
 * Responsible for managing the robot's lifecycle and coordinating subsystems.
 */
public class Robot {

    // TODO: Declare a reference to PoseSubsystem
    
    private PoseSubsystem poseSubsystem;
        // TODO: Constructor should accept a PoseSubsystem (dependency injection)
        public Robot(PoseSubsystem poseSubsystem){
            this.poseSubsystem = poseSubsystem;
   }
    public void runSequence(File file) {
        // TODO: Parse movement steps from JSON file
        // TODO: Loop through each MovementStep
        //   - Update pose using subsystem logic
        //   - Clamp to field borders
        //   - Print new pose
        public JSONArray steps = obj.getJSONArray("steps");
        for(int i=0; i<10; i++){
            JSONObject step = steps.getJSONObject(i);
            MovementStep();
        }
        /* 
        for(int i=0; i<10; i++){
            JSONParser parser = new JSONParser();
            try (FileReader reader = new FileReader(file)) {
                Object obj = parser.parse(reader);
                JSONObject jsonObject = (JSONObject) obj;
                MovementStep();
                String action = (String) jsonObject.get("action");
                double durationS = (double) jsonObject.get("duration_s"); 
                poseSubsystem();

            } catch (IOException | ParseException e) {
                e.printStackTrace();
            }
        }
        */
    }
}
