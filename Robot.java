/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        
 Open Source Software - may be modified and shared by FRC teams. The code   
 must be accompanied by the FIRST BSD license file in the root directory of 
 the project.                                                               */

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.VisionTracking;
import frc.robot.subsystems.Drivebase;
import frc.robot.subsystems.TrackingBase;
import frc.robot.subsystems.WinchBase;;

public class Robot extends TimedRobot {
  public static Drivebase m_drivebase = new Drivebase();
  public static OI m_oi;
  public static TrackingBase m_trackingBase = new TrackingBase();
  public static VisionTracking m_vision = new VisionTracking();
  public static WinchBase m_winchBase = new WinchBase();

  Command m_autonomousCommand;
  SendableChooser<Command> m_chooser = new SendableChooser<>();

  @Override
  public void robotInit() {
    m_oi = new OI();
    // chooser.addOption("My Auto", new MyAutoCommand());
    SmartDashboard.putData("Auto mode", m_chooser);
  }

  @Override
  public void robotPeriodic() {
  }

  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void autonomousInit() {
    m_autonomousCommand = m_chooser.getSelected();

    /*
     * String autoSelected = SmartDashboard.getString("Auto Selector",
     * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
     * = new MyAutoCommand(); break; case "Default Auto": default:
     * autonomousCommand = new ExampleCommand(); break; }
     */

    // schedule the autonomous command (example)
    if (m_autonomousCommand != null) {
      m_autonomousCommand.start();
    }
  }

  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
    // This makes sure that the autonomous stops running when
    // teleop starts running. If you want the autonomous to
    // continue until interrupted by another command, remove
    // this line or comment it out.
    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }
  }

  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
    if(m_oi.driveCon.getXButton()){
      m_vision.track();
    }else{
      m_drivebase.m_drive.curvatureDrive(m_oi.getDriveCXL(), m_oi.getDriveCXR(), m_oi.driveCon.getAButton());
    }
    if(m_oi.driveCon.getBumperPressed(Hand.kRight)){
      m_winchBase.Activate();
    }
  }

  @Override
  public void testPeriodic() {
  }
}
