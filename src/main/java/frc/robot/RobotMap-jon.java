/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

public enum RobotMap {
  
  //DRIVEBASE MAPPINGS
  FLDRIVE(1),
  FRDRIVE(2),
  MLDRIVE(0),
  MRDRIVE(1),
  BRDRIVE(2),
  BLDRIVE(3);


  public final int value;


  RobotMap(int value){
    this.value = value;
  }
}
