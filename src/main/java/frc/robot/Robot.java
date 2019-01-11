/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.AutonomusCommand;
import frc.robot.commands.Encoder;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Elevator;

public class Robot extends TimedRobot {
  public static Calculations cal;
  public static DriveTrain drive;
  public static OI m_oi;
  public static Elevator elevator;

  Command m_autonomousCommand;
  SendableChooser<Command> m_chooser = new SendableChooser<>();

  @Override
  public void robotInit() {
    elevator = new Elevator();
    cal = new Calculations();
    drive = new DriveTrain();
    m_oi = new OI();
    m_chooser.setDefaultOption("Default Auto", new AutonomusCommand());
    // chooser.addOption("My Auto", new MyAutoCommand());
    SmartDashboard.putData("Auto mode", m_chooser);
    drive.Reset();
    drive.Calibrate();
    

    
  }

  @Override
  public void robotPeriodic() {
  SmartDashboard.putData("Encoder Reset", new Encoder());
  SmartDashboard.putNumber("Gyro Angle", drive.getAngle());
  SmartDashboard.putNumber("RightEncoder Count",drive.getEncoderCount(1));
  SmartDashboard.putNumber("LeftEncoder Count",drive.getEncoderCount(2));
  SmartDashboard.putNumber("RightEncoder Value",drive.getEncoderDistance(1));
  SmartDashboard.putNumber("LeftEncoder Value",drive.getEncoderDistance(2));
  Shuffleboard.update();
}
  

  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void autonomousInit() {
    m_autonomousCommand = m_chooser.getSelected();

    /*
     * String autoSelected = SmartDashboard.getString("Auto Selector",
     * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
     * = new MyAutoCommand(); break; case "Default Auto": default:
     * autonomousCommand = new ExampleCommand(); break; }
     */

    // schedule the autonomous command (example)
    if (m_autonomousCommand != null) {
      m_autonomousCommand.start();
    }
  }

  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }
  }

  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void testPeriodic() {
  }
}
