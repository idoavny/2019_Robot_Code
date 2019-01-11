/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Add your docs here.
 */
public class Pneomatics extends Subsystem {
  
//                Objects
  Compressor compressor = new Compressor();
  Solenoid solenoid0 = new Solenoid(0);
  Solenoid solenoid1 = new Solenoid(1);
  Solenoid solenoid2 = new Solenoid(2);
  Solenoid solenoid3 = new Solenoid(3);

  public Pneomatics(){
    compressor.setClosedLoopControl(true);
    SmartDashboard.putBoolean("Compressor Enabled?", compressor.enabled());
    SmartDashboard.putBoolean("PressureSwitch Low?", compressor.getPressureSwitchValue());
    SmartDashboard.putNumber("Compressor Current", compressor.getCompressorCurrent());
  }
//                Methods
  public void OpenSolenoids(int num){
    switch(num){
      case 0: solenoid0.set(true);
      break;
      case 1: solenoid1.set(true);
      break;
      case 2: solenoid2.set(true);
      break;
      case 3: solenoid3.set(true);
      break;
    }
  }

  public void CloseSolenoids(int num){
    switch(num){
      case 0: solenoid0.set(false);
      break;
      case 1: solenoid1.set(false);
      break;
      case 2: solenoid2.set(false);
      break;
      case 3: solenoid3.set(false);
      break;
    }
  }


  @Override
  public void initDefaultCommand() {
    
  }
}
