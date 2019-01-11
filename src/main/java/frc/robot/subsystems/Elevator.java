/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Elevator extends Subsystem {
private DigitalInput limitSwitch;
 private Encoder encoder = new Encoder(9, 8, false, EncodingType.k1X);
 private TalonSRX motor1 = new TalonSRX(RobotMap.ELEVATOR_MOTOR1_ID);
 private TalonSRX motor2 = new TalonSRX(RobotMap.ELEVATOR_MOTOR2_ID);

  public Elevator(){
  encoder.setDistancePerPulse(0);
  encoder.setMaxPeriod(0);
  encoder.setReverseDirection(false);
  }
  public void encoderReset(){
    encoder.reset();
  }
  public void encoderGet(){
    encoder.get();
  }
  public void ElevatorUp(double speed){
    motor1.set(ControlMode.Current, speed);
    motor2.set(ControlMode.Current, speed);
    
  }
  public void ElevatorDown(double speed){
    motor1.set(ControlMode.Current, -speed);
    motor2.set(ControlMode.Current, -speed);
  }
  public boolean limitSwitchValue(){
    return limitSwitch.get();
  }

  @Override
  public void initDefaultCommand() {
   
  }
}
