/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                        

 // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;*/
  /**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
/*----------------------------------------------------------------------------*/

package frc.robot;


public enum RobotMap {
 
  //Drivebase mappings
  FL_DRIVE(1),
  FR_DRIVE(2),
  ML_DRIVE(0),
  BL_DRIVE(1),
  MR_DRIVE(2),
  BR_DRIVE(3);


  public final int value;

  RobotMap(int value){
  this.value = value; 
}
}
