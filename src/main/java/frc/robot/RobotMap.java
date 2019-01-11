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
//               SpeedControllers Ports
      /*    DriveTrain    */
      public static int DRIVE_RIGHT_REAR_MOTOR = 2;
      public static int DRIVE_RIGHT_FRONT_MOTOR = 3;
      public static int DRIVE_LEFT_REAR_MOTOR = 1;
      public static int DRIVE_LEFT_FRONT_MOTOR = 0;
      /*    Elevator    */
      public static int ELEVATOR_MOTOR1_ID = 0;
      public static int ELEVATOR_MOTOR2_ID = 0;
      /*    Maglol      */
      public static int MAGLOL_MOTOR_ID = 0;

//                Joysticks
      public static int RIGHT_JOY = 1;
      public static int LEFT_JOY = 0;

//                Sensors
      public static int DRIVE_RIGHT_ENCODER_SOURCE_A = 0;
      public static int DRIVE_RIGHT_ENCODER_SOURCE_B = 1;
      public static int DRIVE_LEFT_ENCODER_SOURCE_A = 3;
      public static int DRIVE_LEFT_ENCODER_SOURCE_B = 4;
}
