package org.usfirst.frc.team2035.robot.commands;

import org.usfirst.frc.team2035.robot.Robot;
import org.usfirst.frc.team2035.robot.subsystems.Crane;
import org.usfirst.frc.team2035.robot.subsystems.SpikeODeath;

public class SpikeActivate extends CommandBase{
	private SpikeODeath spike;
	  public SpikeActivate() {
	        super();
	        spike = new SpikeODeath();
	        requires(spike);
	    }

	    // Called just before this Command runs the first time
	    protected void initialize() {
	    	spike.activate();
	    }

	    // Called repeatedly when this Command is scheduled to run
	    protected void execute() {
	    	spike.activate();
	    }

	    // Make this return true when this Command no longer needs to run execute()
	    protected boolean isFinished() {
	        return false;
	    }

	    // Called once after isFinished returns true
	    protected void end() {
	    }

	    // Called when another command which requires one or more of the same
	    // subsystems is scheduled to run
	    protected void interrupted() {
	    }
}