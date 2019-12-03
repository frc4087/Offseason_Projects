/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class VisionTracking extends Command {
    double previousZoom = 0;

  public VisionTracking() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.m_trackingBase);
  }

  public double zoomForward() {
    if(Robot.m_trackingBase.getTarget() == 0){
      return previousZoom;

    } else {
     double lmin = 0.5;
     double kP = 0.1;
     double currentta = Robot.m_trackingBase.get("ta");
     double idealta = 0.7;
     double error = idealta - currentta;
     return previousZoom = Math.max(kP * error, lmin);
    }
  }

  public double pidX() {
    double kP = -0.04;
    double tx = Robot.m_trackingBase.get("tx");
    double error = -tx;
    double min = 0.05;

    if (tx > 0.0){
      return kP * error - min;
    } else {
      return kP * error + min;
    }
  }

  public void track(){
    Robot.m_drivebase.m_drive.arcadeDrive(zoomForward(), Robot.m_trackingBase.getTarget() * pidX());

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
