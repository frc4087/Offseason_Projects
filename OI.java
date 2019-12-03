
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        
   Open Source Software - may be modified and shared by FRC teams. The code   
   must be accompanied by the FIRST BSD license file in the root directory of 
   the project.*/

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

public class OI {
  public static final double DEAD_ZONE = 0.1;

  public final XboxController driveCon = new XboxController(0);
  public final XboxController opCon = new XboxController(1);

  public double getDriveCXL(){
    double raw = driveCon.getRawAxis(0);
    return Math.abs(raw) < DEAD_ZONE ? 0.0 : raw;
  }
  public double getDriveCYL(){
    double raw = driveCon.getRawAxis(1);
    return Math.abs(raw) < DEAD_ZONE ? 0.0 : raw;
  }

  public double getDriveCXR(){
    double raw = driveCon.getRawAxis(2);
    return Math.abs(raw) < DEAD_ZONE ? 0.0 : raw;
  }
  public double getDriveCYR(){
    double raw = driveCon.getRawAxis(3);
    return Math.abs(raw) < DEAD_ZONE ? 0.0 : raw;
  }

  public double getOPCXL(){
    double raw = opCon.getRawAxis(0);
    return Math.abs(raw) < DEAD_ZONE ? 0.0 : raw;
  }
  public double getOPCYL(){
    double raw = opCon.getRawAxis(1);
    return Math.abs(raw) < DEAD_ZONE ? 0.0 : raw;
  }

  public double getOPCXR(){
    double raw = opCon.getRawAxis(2);
    return Math.abs(raw) < DEAD_ZONE ? 0.0 : raw;
  }
  public double getOPCYR(){
    double raw = opCon.getRawAxis(3);
    return Math.abs(raw) < DEAD_ZONE ? 0.0 : raw;
  }
  
}
