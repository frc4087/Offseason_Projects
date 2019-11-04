/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.Joystick;

public class OI {

public static final double DEADZONE = 0.1;

public final XboxController driveC = new XboxController(0);
public final Joystick driveCTwo = new Joystick(1);

//Regular "throttle" joystick
public double getDriveCX() {
  double raw = driveCTwo.getX();
  return Math.abs(raw) < DEADZONE ? 0.0 : raw;
}

//XboxController
public double getDriveCXL() {
  double raw = driveC.getRawAxis(0);
  return Math.abs(raw) < DEADZONE ? 0.0 : raw;
}




}
