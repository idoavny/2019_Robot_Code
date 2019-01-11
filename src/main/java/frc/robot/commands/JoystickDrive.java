/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

/*
Tank drive with Joysticks
*/
public class JoystickDrive extends Command {

  public JoystickDrive() {
    requires(Robot.drive);
  }

  
  @Override
  protected void initialize() {
  }

  
  @Override
  protected void execute() {
    Robot.drive.diff.tankDrive(-Robot.m_oi.getLeftY(), -Robot.m_oi.getRightY());

  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
  }

  @Override
  protected void interrupted() {
    Robot.drive.diff.tankDrive(0, 0);

  }
}
