/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/



/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

public class OI {
  

  public static final double DEADZONE = 0.1;

  public final XboxController XboxDrive = new XboxController(0);

  //X axis Left Stick
  public double getXboxDriveXL() {
    double raw = XboxDrive.getRawAxis(0);
    return Math.abs(raw) < DEADZONE ? 0.0 : raw;
  }

  //Y axis Left Stick
  public double getXboxDriveYL() {
  double raw = XboxDrive.getRawAxis(1);
   return Math.abs(raw) < DEADZONE ? 0.0 : raw;
  }

  //X axis Right Stick
  public double getXboxDriveXR() {
   double raw = XboxDrive.getRawAxis(0);
   return Math.abs(raw) < DEADZONE ? 0.0 : raw;
  }

  //Y axis Right stick
  public double getXboxDriveYR() {
    double raw = XboxDrive.getRawAxis(5);
    return Math.abs(raw) < DEADZONE ? 0.0 : raw;
   }
}