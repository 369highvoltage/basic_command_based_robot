package robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import robot.RobotMap;

public class ShooterSystem extends Subsystem {
  
  DoubleSolenoid frisbeePusher;
  DoubleSolenoid heightChanger;
  Victor frontShootMotor;
  Talon backShootMotor;
  Relay reloader;

  void enableShooter() {
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