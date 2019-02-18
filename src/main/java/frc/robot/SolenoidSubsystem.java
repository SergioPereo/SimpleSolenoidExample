/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class SolenoidSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  
  Solenoid solenoid;
  DoubleSolenoid doubleSolenoid;

  public SolenoidSubsystem(){
    solenoid = new Solenoid(0);

    doubleSolenoid = new DoubleSolenoid(1, 2);
  }

  public void setSolenoidOn(){
    solenoid.set(true);
  }

  public void setSolenoidOff(){
    solenoid.set(false);
  }

  public void setDoubleSolenoidOn(){
    doubleSolenoid.set(Value.kForward);
  }

  public void setDoubleSolenoidReverse(){
    doubleSolenoid.set(Value.kReverse);
  }

  public void setDoubleSolenoidOff(){
    doubleSolenoid.set(Value.kOff);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
