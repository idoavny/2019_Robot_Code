/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class AutonomusCommand extends Command {
  public AutonomusCommand() {
    setTimeout(0.5);
    
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    Robot.drive.diff.tankDrive(0.6, 0.6);
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
    Robot.drive.diff.tankDrive(0.3, 0.3);
  }
}
