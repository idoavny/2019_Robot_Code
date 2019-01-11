/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
//                SpeedControllers Ports
  public static int rightRearMotor = 2;
  public static int rightFrontMotor = 3;
  public static int leftRearMotor = 1;
  public static int leftFrontMotor = 0;

//                Joysticks
  public static int RIGHT_JOY = 1;
  public static int LEFT_JOY = 0;

//                Sensors
 public static int Right_Encoder_SourceA = 0;
 public static int Right_Encoder_SourceB = 1;
 public static int Left_Encoder_SourceA = 3;
 public static int Left_Encoder_SourceB = 4;
}
