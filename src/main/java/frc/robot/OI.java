/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;


public class OI {

public static final double DEADZONE = 0.1;
public final Joystick bruh_1 = new Joystick(0);
public final Joystick bruh_2 = new Joystick(1);

public double getbruh_1X() {
    double raw = bruh_1.getX();
    return Math.abs(raw) < DEADZONE ? 0.0 : raw;
}
  public double getbruh_2X() {
    double raw = bruh_2.getX();
    return Math.abs(raw) < DEADZONE ? 0.0 : raw;
 }
  public double getbruh_1Y() {
    double raw = bruh_1.getY();
    return Math.abs(raw) < DEADZONE ? 0.0 : raw;
 }
  public double getbruh_2Y() {
    double raw = bruh_2.getY();
    return Math.abs(raw) < DEADZONE ? 0.0 : raw;
 }


}