package org.usfirst.frc.team2035.robot.commands;

import org.usfirst.frc.team2035.robot.Robot;

import org.usfirst.frc.team2035.robot.OI;
import org.usfirst.frc.team2035.robot.subsystems.Shooter;
public class LaunchShooter extends CommandBase{
	
	private final Shooter shoot;
	public static OI oi;
	private int x = 0;
	 public LaunchShooter() {
	        // Use requires() here to declare subsystem dependencies
		 	super();
		 	x=0;
		 	shoot = new Shooter();
	        requires(shoot);
	        
	 }

	    // Called just before this Command runs the first time
	 
	    protected void initialize() 
	    {
	    	x=0;
	    	oi = new OI();
	    	shoot.launchShooter();
	    	
	    }

	    // Called repeatedly when this Command is scheduled to run
	    protected void execute() {
	    	shoot.launchShooter();
	    }

	    // Make this return true when this Command no longer needs to run execute()
	    protected boolean isFinished() {
	    	//if(x < 25)
			//{
			//	x++;
		 return false;
			//}
			//return true;
	    }

	    // Called once after isFinished returns true
	    protected void end() {
	    	shoot.returnShooter();
	    }

	    // Called when another command which requires one or more of the same
	    // subsystems is scheduled to run
	    protected void interrupted() {
	    	
	    	shoot.returnShooter();
	    }
}
