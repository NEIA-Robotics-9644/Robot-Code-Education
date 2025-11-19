package subsystems;

import subsystems.io.OdometryMotorIO;
import utils.MovementStep;
import java.util.List;

import org.json.JSON;

public class OdometrySubsystem {
    // TODO 1: Add a field for the OdometryMotorIO

    // TODO 2: Add a constructor that takes a OdometryMotorIO and stores it
    public OdometrySubsystem(OdometryMotorIO io) {
        // TODO: Store io
    }

    // TODO 3: Add a getter for the OdometryMotorIO

    // TODO 4: Add a method to load movement steps from JSON
    public void loadFromJson(String json) {
        // TODO: parse JSON into a List<MovementStep>
        // TODO: iterate through steps and pass them into OdometryMotorIO
        // TODO: Generate or clear a csv file to collect data in the /data folder
    }
}
