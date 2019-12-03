/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */

package frc.robot;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.visiontracking;
import frc.robot.subsystems.Drivebase;
import frc.robot.subsystems.TrackingBase;
import frc.robot.subsystems.IntakeActuator.Hatch;
import frc.robot.subsystems.IntakeActuator.Intake;
import edu.wpi.first.wpilibj.DoubleSolenoid;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  public static OI m_oi;
  public static Drivebase m_drivebase = new Drivebase();
  public static TrackingBase m_trackingBase = new TrackingBase();
  public static visiontracking m_vision = new visiontracking();
  public static Hatch Hatch_1 = new Hatch();
  public static Intake Intake_1 = new Intake();

  Command m_autonomousCommand;
  SendableChooser<Command> m_chooser = new SendableChooser<>();

  @Override
  public void robotInit() {
    m_oi = new OI();
    
    SmartDashboard.putData("Auto mode", m_chooser);
  }

  /**
   * This function is called every robot packet, no matter the mode. Use
   * this for items like diagnostics that you want ran during disabled,
   * autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before
   * LiveWindow and SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
  }

  /**
   * This function is called once each time the robot enters Disabled mode.
   * You can use it to reset any subsystem information you want to clear when
   * the robot is disabled.
   */
  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  /**
   * This autonomous (along with the chooser code above) shows how to select
   * between different autonomous modes using the dashboard. The sendable
   * chooser code works with the Java SmartDashboard. If you prefer the
   * LabVIEW Dashboard, remove all of the chooser code and uncomment the
   * getString code to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional commands to the
   * chooser code above (like the commented example) or additional comparisons
   * to the switch structure below with additional strings & commands.
   */
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

  /**
   * This function is called periodically during autonomous.
   */
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

  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  
    if (m_oi.bruh_1.getRawButton(1)){
      m_vision.track();
    } else {
    m_drivebase.m_drive.tankDrive(m_oi.getbruh_1Y(), m_oi.getbruh_2Y());
    }
    if (m_oi.bruh_1.getRawButton(3)){
      Hatch_1.Hatch.set(DoubleSolenoid.Value.kForward);
    }
    if (m_oi.bruh_1.getRawButton(2)){
      Hatch_1.Hatch.set(DoubleSolenoid.Value.kReverse);
    }
    if (m_oi.bruh_1.getRawButton(4)){
      Intake_1.Intake.set(DoubleSolenoid.Value.kForward);
    }
    if (m_oi.bruh_1.getRawButton(5)){
      Intake_1.Intake.set(DoubleSolenoid.Value.kReverse);
    }
  }
  @Override
  public void testPeriodic() {
  }
}
