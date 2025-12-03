
package main.java.utils;
/**
 * Represents a single movement instruction loaded from JSON.
 *
 * Example JSON step:
 * {
 *   "action": "forward",
 *   "duration_s": 2.0
 * }
 */
public class MovementStep {
    // TODO: Define fields: String action; double durationS;
    String action;
    double durationS;
    // TODO: Add constructor, getters, and toString() method
    public MovementStep(){
        //public String getaction() { return action; }
        //public double getdurations() { return durationS; }
        action = step.getString("action");
        durationS = step.getDouble("duration_s");
        poseSubsystem(fieldWidth, fieldHeight, rotAccel, linearAccel);
        updatePose(action, durationS);
        clampToField();
        wrapHeading();
        printPose();
    }
}
