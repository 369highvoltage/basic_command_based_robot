// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package frc.robot;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Relay;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    // Shooter Components
    static DoubleSolenoid frisbeePusher;
    static DoubleSolenoid heightChanger;
    static Victor frontShootMotor;
    static Talon backShootMotor;
    static Relay reloader;

    public static void init() {
        frisbeePusher = new DoubleSolenoid(5, 6);
        frontShootMotor = new Victor(7);
        backShootMotor = new Talon(5);
        heightChanger = new DoubleSolenoid(2, 3);
        reloader = new Relay(0);
    }
}