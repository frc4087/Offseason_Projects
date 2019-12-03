/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.WinchBase;

public class Winch extends Command {

  private boolean status = false;

  public Winch() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  public void Activate(){
    WinchBase.MotorL.set(1);
    WinchBase.MotorR.set(1);
    WinchBase.WinchPiston1.set(Value.kForward);
    status = true;
  }
  public void Deactivate(){
    WinchBase.MotorL.set(0);
    WinchBase.MotorR.set(0);
    WinchBase.WinchPiston1.set(Value.kOff);
    status = false;
  }

  public boolean isOn(){
    return status;
  }
  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
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
