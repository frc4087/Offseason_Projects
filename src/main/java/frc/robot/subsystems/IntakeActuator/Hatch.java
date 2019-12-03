/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */

package frc.robot.subsystems.IntakeActuator;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.RobotMap;

public class Hatch extends Subsystem {
  
public static DoubleSolenoid Hatch = new DoubleSolenoid(RobotMap.Hatch_1.value,RobotMap.Hatch_2.value);

@Override
public void initDefaultCommand() {
   
  }
}
