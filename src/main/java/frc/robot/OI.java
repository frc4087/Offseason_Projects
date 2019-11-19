/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

public class OI {
 


 public static final double DEADZONE = 0.1;

 public final XboxController xboidrive = new XboxController(0);

public double getxboidriveXL(){
  double raw = xboidrive.getRawAxis(0);
  return Math.abs(raw) < DEADZONE ? 0.0 : raw;
}
}
