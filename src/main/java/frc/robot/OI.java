/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


public class OI {
  //                JoySticks
  Joystick RightStick = new Joystick(RobotMap.RIGHT_JOY);
  Joystick LeftStick = new Joystick(RobotMap.LEFT_JOY);
  //                Buttons
  Button button = new JoystickButton(RightStick , 0);
  //                Methods

  public double getRightY(){
    return RightStick.getY();
  }
  public double getLeftY(){
    return LeftStick.getY();
  }
  //                Buttons Consturctor
  public OI(){
    
  }

}
