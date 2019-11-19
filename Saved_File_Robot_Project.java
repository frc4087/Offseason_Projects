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
  
public final XboxController xboxC = new XboxController(0);

public double getXboxCXL() {
  double raw = xboxC.getRawAxis(0);
  return Math.abs(raw) < DEADZONE ? 0.0 : raw;
}

public double getXboxCXR() {
  double raw = xboxC.getRawAxis(0);
  return Math.abs(raw) < DEADZONE ? 0.0 : raw;
}

public double getXboxCYR() {
  double raw = xboxC.getRawAxis(0);
  return Math.abs(raw) < DEADZONE ? 0.0 : raw;
}

public double getXboxCYL() {
  double raw = xboxC.getRawAxis(0);
  return Math.abs(raw) < DEADZONE ? 0.0 : raw;
}

}
