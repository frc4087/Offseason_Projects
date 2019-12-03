/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class visiontracking extends Command {

  double previousGO = 0;

  public visiontracking() {
    requires(Robot.m_trackingBase);

  }

  public double goBIG(){
    if(getTarget() == 0) {
      return previousGO;
    } else {
      double lmin = 0.5;
      double kP = 0.1;
      double currentta = Robot.m_trackingBase.get("ta");
      double idealta = 0.7;
      double error = idealta - currentta;
      return previousGO = Math.max(error, lmin);



    }
  }
  
  public double pidX () {
    double kP = -0.04;
    double tx = Robot.m_trackingBase.get("tx");
    double error = -tx;
    double min = 0.05;

    if(tx > 0.0) {
      return kP * error - min;
    } else {
      return kP * error + min;
    }
  }

  public void track (){
    Robot.m_drivebase.m_drive.tankDrive(goBIG(), Robot.m_trackingBase.getTarget() * pidX());
  }




  


  private int getTarget() {
    return 0;
  }

  @Override
  protected void initialize() {
  }

  
  @Override
  protected void execute() {
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
  }
}
