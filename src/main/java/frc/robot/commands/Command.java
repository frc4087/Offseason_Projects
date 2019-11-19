package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class Command extends Command {
    public Command(){
        requires(Robot.m_subsystem);
    }

    @Override 
    protected void inotialize() {
    }

    @Override
    protected void execute() {
    }

    @Override 
    protected boolean isFinished() {
        return false;
    }

    @Overrideprotected void interrupted() {
        
    }
}