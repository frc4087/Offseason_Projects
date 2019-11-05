/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public enum RobotMap {
    
    //Drivebase mappings
    DRIVE_T_FR(1), 
    DRIVE_T_FL(2), 
    DRIVE_V_MR(0), 
    DRIVE_V_ML(1), 
    DRIVE_V_BR(2), 
    DRIVE_V_BL(3);

    final public int value;
    
    RobotMap(int value){
        this.value = value;
    }
}
