/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


 
public enum RobotMap {

  //Drivebase mappings
  TAL_L(1),
  TAL_R(2),
  V_L1(0),
  V_R1(2),
  V_L2(1),
  V_R2(3);




  final public int value;


    RobotMap(int value) {
      this.value = value;
    }
}
