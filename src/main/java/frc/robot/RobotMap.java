/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

public enum RobotMap {

  //Drivebase mappings
  TAL_LF(1),
  VIC_LM(0),
  VIC_LB(7),
  TAL_RF(2),
  VIC_RM(2),
  VIC_RB(3);


  public final int value;

  RobotMap(int value){
    this.value = value;
  }
}
