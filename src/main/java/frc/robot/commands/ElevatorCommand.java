/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ElevatorCommand extends Command {
  private int position;
  private int correntPosition;
  private double position1;
  private double position2;
  private double position3;

  public ElevatorCommand() {
  requires(Robot.elevator);
  }
    public ElevatorCommand(int position){
      this.position = position;
    }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    position1 = 0;
    position2 = 0;
    position3 = 0;
    
    }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if(Robot.elevator.limitSwitchValue() == true){
      Robot.elevator.encoderReset();
      Robot.elevator.ElevatorUp(0);
    }
    if(position == 0 && correntPosition > position1 ){
      Robot.elevator.ElevatorDown(0.5);
    }
    if(position == 1 && correntPosition > position2 ){
      Robot.elevator.ElevatorDown(0.5);
    }
    if(position == 0 && correntPosition > position1 ){
      Robot.elevator.ElevatorDown(0.5);
    }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
