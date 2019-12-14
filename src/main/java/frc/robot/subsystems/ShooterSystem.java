package robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import robot.RobotMap;
import DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Relay;

public class ShooterSystem extends Subsystem {
  
  DoubleSolenoid frisbeePusher;
  DoubleSolenoid heightChanger;
  Victor frontShootMotor;
  Talon backShootMotor;
  Relay reloader;

  public void initDefaultCommand() {}

  public void enableShooter() {
    frontShootMotor.set(1);
    backShootMotor.set(.75);
  }

  boolean isReady() {
    DoubleSolenoid.Value pusherValue = frisbeePusher.get();
    boolean pusherIsDown = (pusherValue == DoubleSolenoid.Value.kForward);
  }

  void pullPusher() {
    frisbeePusher.set(DoubleSolenoid.Value.kForward);
  }

}