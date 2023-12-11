package frc.robot;

import edu.wpi.first.networktables.NetworkTableInstance;

public final class Simulation {
    
    public static void addData(Object caller, String name, double value) {
        System.out.println(caller + " added simulation data: " + name + " = " + value);
        NetworkTableInstance.getDefault().getTable("Simulation").getEntry(name).setDouble(value);
    }
}
