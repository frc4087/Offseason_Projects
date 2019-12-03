
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        
   Open Source Software - may be modified and shared by FRC teams. The code   
   must be accompanied by the FIRST BSD license file in the root directory of 
   the project.                                                               */

package frc.robot;


public enum RobotMap {

  FL(1),
  FR(2),
  ML(1),
  MR(2),
  BL(1),
  BR(2);

  final public int value;

  RobotMap(int value){
    this.value = value;
  }
}
