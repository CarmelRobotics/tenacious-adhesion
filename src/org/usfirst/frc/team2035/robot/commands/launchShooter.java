package org.usfirst.frc.team2035.robot.commands;

import org.usfirst.frc.team2035.robot.Robot;
import org.usfirst.frc.team2035.robot.subsystems.Shooter;
public class launchShooter extends CommandBase{
	private Shooter shoot;
	 public launchShooter() {
	        // Use requires() here to declare subsystem dependencies
		 	super();
		 	shoot = new Shooter();
	        requires(shoot);
	        
	 }

	    // Called just before this Command runs the first time
	 
	    protected void initialize() 
	    {
	    	shoot.launchShooter();
	    	
	    }//dontevenask

	    // Called repeatedly when this Command is scheduled to run
	    protected void execute() {
	    	shoot.launchShooter();
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
