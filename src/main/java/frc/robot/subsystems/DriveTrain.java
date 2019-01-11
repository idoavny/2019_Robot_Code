/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Robot;
import frc.robot.commands.JoystickDrive;


public class DriveTrain extends Subsystem {
  public DriveTrain(){
  //              Right Encoder Initialization
  rightEncoder.setMaxPeriod(0.1);
  rightEncoder.setDistancePerPulse(Robot.cal.DistancePerEncoderRotation(4, 200));
  rightEncoder.setReverseDirection(false);

    //              Left Encoder Initialization
  leftEncoder.setMaxPeriod(0.1);
  leftEncoder.setDistancePerPulse(Robot.cal.DistancePerEncoderRotation(4, 200));
  leftEncoder.setReverseDirection(true);
  }
  
//                Sensors
  ADXRS450_Gyro gyro = new ADXRS450_Gyro();
  Encoder rightEncoder = new Encoder(1, 2, false, EncodingType.k1X);
  Encoder leftEncoder = new Encoder(3, 4, false, EncodingType.k1X);

//                SpeedControllers
  Talon RightRear = new Talon(2);
  Talon RightFront = new Talon(3);
  Talon LeftRear = new Talon(1);
  Talon LeftFront = new Talon(0);

  SpeedControllerGroup Rights = new SpeedControllerGroup(RightFront, RightRear);
  SpeedControllerGroup Lefts = new SpeedControllerGroup(LeftFront, LeftRear);
  public DifferentialDrive diff = new DifferentialDrive(Lefts, Rights);

  
//                Methods
public double getAngle(){
  return gyro.getAngle();
}

public void  Reset(){
   gyro.reset();
}

public void  Calibrate(){
  gyro.calibrate();
}

public double getEncoderDistance(int Encoder){
  double distance = 0;
  switch(Encoder){
    case 1: distance = rightEncoder.getDistance();
    break;
    case 2: distance = leftEncoder.getDistance();
    break;
  }
  return distance;
}

public double getEncoderCount(int Encoder){
  double Count = 0;
  switch(Encoder){
    case 1: Count = rightEncoder.get();
    break;
    case 2: Count = leftEncoder.get();
    break;
  }
  return Count;
}

public void EncoderReset(){
  gyro.reset();
}
  

//                DefaultCommand
  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new JoystickDrive());
  }
}
