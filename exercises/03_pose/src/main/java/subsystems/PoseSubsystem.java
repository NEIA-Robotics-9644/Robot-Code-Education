package main.java.subsystems;
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
   // double x;
    //double y;
    //double headingDeg;
    //double fieldWidth;
    //double fieldHeight;
    //double linearAccel;
    //double rotAccel;
    // TODO: Define pose state variables (x, y, headingDeg)
    // TODO: Define constants for field width, height, accelerations
    // can pick random constants, as long as they aren't crazy - refer to swervedrive.com MK4i product spec sheet for reasonable values

    public PoseSubsystem(double fieldWidth, double fieldHeight,
                         double linearAccel, double rotAccel) {
        // TODO: Store constants
        // TODO: Initialize x, y, headingDeg (e.g., 0, 0, 0)
        this.x= 0;
        this.y= 0;
        this.headingDeg= 0;
        this.fieldWidth= 10;
        this.fieldHeight= 10;
        this.linearAccel= 2;
        this.rotAccel= 2;
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
        if(action== "forward" || action== "backward"){
            x= x+0.5*linearAccel*durationS*durationS;
            y= y+0.5*linearAccel*durationS*durationS;
            if(action=="backward"){
                x= x+(0.5*linearAccel*durationS*durationS*(-1));
                y= y+(0.5*linearAccel*durationS*durationS*(-1));
            }
        }
        if(action== "rotate_left" || action== "rotate_right"){
            headingDeg= headingDeg+(0.5* rotAccel *durationS * durationS);
            if(action=="rotation_right"){
                headingDeg= headingDeg+(0.5* rotAccel *durationS * durationS*(-1));
            }
        }
    }

    public void clampToField() {
        // TODO: Keep x, y within 0..fieldWidth and 0..fieldHeight
        if(x<0.0){
            x=0.0;
        }
        if(x>fieldWidth){
            x= fieldWidth;
        }
        if(y<0.0){
            y=0.0;
        }
        if(y>fieldHeight){
            y= fieldHeight;
        }

    }

    public void wrapHeading() {
        // TODO: Keep headingDeg within [-180, 180)
        if(headingDeg<-180){
            headingDeg=-180;
        }
        if(headingDeg>180){
            headingDeg=180;
        }
    }

    public void printPose() {
        // TODO: Print formatted (x, y, heading) with 3 decimals
        System.out.printf("Rounded value: %.3f%n",x+", "+"Rounded value: %.3f%n", y+", "+"Rounded value: %.3f%n", headingDeg);
    }
}
