package subsystems.io;

import utils.MovementStep;

/*
    Simulated implementation of OdometryMotorIO.

    This class should emulate a motor's behavior for odometry.

    TODOS:
        1. Add simulation state fields:
            - double position
            - double currentRuntime
        2. Implement constructor:
            - initialize all simulation variables
        3. Implement executeStep(MovementStep step):
            - Read action ("forward"/"backward")
            - Read power and duration
            - Apply simulated motion changes
 */
public class OdometryMotorIOSim implements OdometryMotorIO {

    // TODO: Define field here

    public OdometryMotorIOSim() {
        // TODO: Initialize all simulation variables
    }

    // TODO: executeStep implementation that reads the MovementStep, then calls simulateMovement

    // TODO: helper for simulating position changes
    private void simulateMovement(double power, double durationS) { 
        // TODO: calculate the position and runtime (runtime based on the durations, not program time)
        
        // TODO: adds the position with the current runtime to a new line in the csv file
    }
}
