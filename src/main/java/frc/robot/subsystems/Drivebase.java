/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;


public class Drivebase extends Subsystem {

//Talons
public static WPI_TalonSRX frTalDrive = new WPI_TalonSRX(RobotMap.TAL_R.value);
public static WPI_TalonSRX flTalDrive = new WPI_TalonSRX(RobotMap.TAL_L.value);

//Victors
public static VictorSP L1VicDrive = new VictorSP(RobotMap.V_L1.value);
public static VictorSP R1VicDrive = new VictorSP(RobotMap.V_R1.value);
public static VictorSP L2VicDrive = new VictorSP(RobotMap.V_L2.value);
public static VictorSP R2VicDrive = new VictorSP(RobotMap.V_R2.value);

//Speed Controller Group
public SpeedControllerGroup m_right = new SpeedControllerGroup(frTalDrive, R1VicDrive, R2VicDrive);
public SpeedControllerGroup m_left  = new SpeedControllerGroup(flTalDrive, L1VicDrive, L2VicDrive);

public DifferentialDrive m_drive = new DifferentialDrive(m_left, m_right);
 
@Override
public void initDefaultCommand() {

  }
}

