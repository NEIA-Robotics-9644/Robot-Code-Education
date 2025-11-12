/**
 * Subsystem responsible for maintaining and updating robot pose.
 * Tracks position (x, y) and heading (degrees).
 *
 * Students will implement:
 *   - updatePose(): applies a movement step based on acceleration & time
 *   - clampToField(): keeps the pose within field boundaries - imagine robot pushing up against the boundary if it reaches it
 *   - wrapHeading(): keeps heading in [-180, 180)
 */
public class PoseSubsystem {

    // TODO: Define pose state variables (x, y, headingDeg)
    // TODO: Define constants for field width, height, accelerations
    // can pick random constants, as long as they aren't crazy - refer to swervedrive.com MK4i product spec sheet for reasonable values

    public PoseSubsystem(double fieldWidth, double fieldHeight,
                         double linearAccel, double rotAccel) {
        // TODO: Store constants
        // TODO: Initialize x, y, headingDeg (e.g., 0, 0, 0)
    }

    public void updatePose(String action, double durationS) {
        // TODO: Implement kinematic formulas
        // Linear motion:
        //   s = 0.5 * a * t^2
        // Rotation:
        //   Δθ = 0.5 * α * t^2
        // Apply based on action type:
        //   forward, backward, rotate_left, rotate_right
        // Update x, y, headingDeg accordingly
    }

    public void clampToField() {
        // TODO: Keep x, y within 0..fieldWidth and 0..fieldHeight
    }

    public void wrapHeading() {
        // TODO: Keep headingDeg within [-180, 180)
    }

    public void printPose() {
        // TODO: Print formatted (x, y, heading) with 3 decimals
    }
}
