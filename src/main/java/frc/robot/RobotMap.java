/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

public enum RobotMap {

  //Drivebase mappings
  FR_TAL_DRIVE(1),
  FL_TAL_DRIVE(2),
  MR_VIC_DRIVE(0),
  ML_VIC_DRIVE(1),
  BR_VIC_DRIVE(2),
  BL_VIC_DRIVE(3);


  final public int value;
  
  RobotMap(int value){
    this.value = value;
  }
}
