package org.usfirst.frc.team2035.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.RobotDrive;
import org.usfirst.frc.team2035.robot.Robot;
import org.usfirst.frc.team2035.robot.RobotMap;
import org.usfirst.frc.team2035.robot.subsystems.DriveTrain;

public class AutoDriveForward extends CommandBase 
{
	private final DriveTrain theDriveTrain;
	private Timer time;
	private boolean timesup;

	public AutoDriveForward()
	{
		super("AutoDriveForward");
		theDriveTrain = Robot.getDriveTrain();
		time = new Timer();
		time.start();
		timesup = false;
	}
	protected void initialize()
	{
		
	}
	
	protected void execute()
	{
		 theDriveTrain.drive(RobotMap.AutonomousSpeed);
	        if (time.get() > 1.00) 
	        {
	            timesup = true;
	        }
	}
	
	protected boolean isFinished()
	{
		return timesup;
	}
	
	protected void end() 
	{
	       theDriveTrain.drive(0);
	}

	protected void interrupted()
	{
	       
	}
}

