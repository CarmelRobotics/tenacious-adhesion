package org.usfirst.frc.team2035.robot.commands;

import org.usfirst.frc.team2035.robot.Robot;
import org.usfirst.frc.team2035.robot.subsystems.Crane;
import org.usfirst.frc.team2035.robot.subsystems.SpikeODeath;

public class SpikeUp extends CommandBase{
	private SpikeODeath spike;
	  public SpikeUp() {
	        super();
	        spike = new SpikeODeath();
	        requires(spike);
	    }

	    // Called just before this Command runs the first time
	    protected void initialize() {
	    	spike.setSpikeUp();
	    }

	    // Called repeatedly when this Command is scheduled to run
	    protected void execute() {
	    	spike.setSpikeUp();
	    }

	    // Make this return true when this Command no longer needs to run execute()
	    protected boolean isFinished() {
	        return false;
	    }

	    // Called once after isFinished returns true
	    protected void end() {
	    }
//
	    // Called when another command which requires one or more of the same
	    // subsystems is scheduled to run
	    protected void interrupted() {
	    }
}
