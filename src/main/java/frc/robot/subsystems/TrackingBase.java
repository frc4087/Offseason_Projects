/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */

//Bruh

package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.command.Subsystem;


public class TrackingBase extends Subsystem {
  
  NetworkTable m_limelightTable = NetworkTableInstance.getDefault().getTable("limelight");

  public double get(String brug){
    return m_limelightTable.getEntry(brug).getDouble(0.0);
}

  public void setTracking(boolean tracking){

    m_limelightTable.getEntry("camMode").setNumber(0);
    m_limelightTable.getEntry("ledMode").setNumber(0);
  }
 
  public double getTarget(){
    double minRatio = 38/17;
    double maxRatio = 195/65;
    double ratio = get("thor")/ get("tvert");

//if statement
    if (get("tv") == 1){
      if (minRatio < ratio && ratio < maxRatio) {
        return 1.0;
      } else{
        return 0;
      }
    } else {
      return 0.0;
    }
  }




  @Override
  public void initDefaultCommand() {
    
//minrange=38/17
//maxrange=195/65
//ratio=thor/tvert

  }
}
