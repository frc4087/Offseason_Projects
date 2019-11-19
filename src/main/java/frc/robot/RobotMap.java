/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


public enum RobotMap {
  //LEEEEEEEEEDEDEDDEDDEDDEDDLELEL
  misterTALON(1),
  missesTALON(2),
  lMidVic(0),
  lHindVic(1),
  rMidVic(2),
  rHindVic(3);

  final public int value;

  RobotMap(int value) {
    this.value = value;
  }
}
