package org.usfirst.frc.team2035.robot.commands;

import org.usfirst.frc.team2035.robot.*;
import org.usfirst.frc.team2035.robot.subsystems.*;

import edu.wpi.first.wpilibj.Timer;

public class BasicAutonomous extends CommandBase {
	
	private final DriveTrain DRIVE;
	private Timer autonomousTimer;
	public static OI oi;
	
	public BasicAutonomous() {
		super("drive");
		DRIVE = Robot.getDriveTrain();
	}

	protected void initialize() {
		oi = new OI();
		autonomousTimer = new Timer();
	}

	protected void execute() {
		autonomousTimer.start();
		 while(autonomousTimer.get() <= 4)
		 {
			 DRIVE.drive(.5);
		 }
		 DRIVE.drive(0);
		 autonomousTimer.stop();
		 autonomousTimer.reset();
	}
	 
	protected boolean isFinished() {
	 return false;
	}
	 
	protected void end() {
		 DRIVE.drive(0);
	}
	 
	protected void interrupted() {
		 DRIVE.drive(0);
	}






}
