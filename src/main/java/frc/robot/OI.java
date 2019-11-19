/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {

  public static final double DEADZONE = 0.1; //nani?
 
  public final Joystick driveA = new Joystick(0);
  public final Joystick driveB =  new Joystick(1);
  public final Joystick driveC = new Joystick(2);
  
  public double getDriveAX() 
  {
    double raw = driveA.getX();
    return Math.abs(raw) < DEADZONE ? 0.0: raw;
  }
  public double getDrivBX()
  {
    double raw = driveB.getX();
    return Math.abs(raw) < DEADZONE ? 0.0: raw;
  }
  public double getDriveCX()
  {
    double raw = driveC.getX();
    return Math.abs(raw) < DEADZONE ? 0.0: raw;
  }

  
}
