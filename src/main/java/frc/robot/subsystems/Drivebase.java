/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;

public class Drivebase extends Subsystem {

//Talons
public static WPI_TalonSRX frTalDrive = new WPI_TalonSRX(RobotMap.DRIVE_T_FR.value);
public static WPI_TalonSRX flTalDrive = new WPI_TalonSRX(RobotMap.DRIVE_T_FL.value);

//Victors
public static VictorSP mrVicDrive = new VictorSP(RobotMap.DRIVE_V_MR.value);
public static VictorSP mlVicDrive = new VictorSP(RobotMap.DRIVE_V_ML.value);
public static VictorSP brVicDrive = new VictorSP(RobotMap.DRIVE_V_BR.value);
public static VictorSP blVicDrive = new VictorSP(RobotMap.DRIVE_V_BL.value);

//Speed Controller Group
public SpeedControllerGroup m_right = new SpeedControllerGroup(frTalDrive, mrVicDrive, brVicDrive);
public SpeedControllerGroup m_left = new SpeedControllerGroup(flTalDrive, mlVicDrive, blVicDrive);

public DifferentialDrive m_drive = new DifferentialDrive(m_left, m_right);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
