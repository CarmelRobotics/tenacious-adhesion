/*----------------------------------------------------------------------------*/
/* Copyright (c) 2016 FIRST Team 2035. All Rights Reserved.                   */
/* Open Source Software - may be modified and shared by FRC teams.            */
/*----------------------------------------------------------------------------*/
package org.usfirst.frc.team2035.robot.commands;

import org.usfirst.frc.team2035.robot.Robot;
import org.usfirst.frc.team2035.robot.OI;
import org.usfirst.frc.team2035.robot.subsystems.Shooter;
public class LaunchShooter extends CommandBase{
	
	private final Shooter shoot;
	public static OI oi;
	 public LaunchShooter() {
	        // Use requires() here to declare subsystem dependencies
		 	super();
		 	shoot = new Shooter();
	        requires(shoot);
	        
	 }

	    // Called just before this Command runs the first time
	 
	    protected void initialize() 
	    {
	    	oi = new OI();
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
	    	shoot.returnShooter();
	    }

	    // Called when another command which requires one or more of the same
	    // subsystems is scheduled to run
	    protected void interrupted() {
	    	
	    	shoot.returnShooter();
	    }
}