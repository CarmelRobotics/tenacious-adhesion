package org.usfirst.frc.team2035.robot.commands;

import org.usfirst.frc.team2035.robot.*;

import org.usfirst.frc.team2035.robot.subsystems.*;

import edu.wpi.first.wpilibj.Timer;


public class AutonomousDrivePastBarricades extends CommandBase{ 
	//this autonomous works on the obstacles the robot can just drive through, without needing any additional actions
	
	private final DriveTrain DRIVE;
	private Timer autonomousTimer;
	public static OI oi;
	
	public AutonomousDrivePastBarricades() {
		super("Drive");
		DRIVE = Robot.getDriveTrain();
	}
	
	protected void initialize() {
		oi = new OI();
		autonomousTimer = new Timer();
	}

	protected void execute() {
		autonomousTimer.start();
		 while(autonomousTimer.get() <= RobotMap.TIME_TO_OBST)
		 {
			 DRIVE.drive(RobotMap.SPEED_TO_OBST);
		 }
		 while(autonomousTimer.get() > RobotMap.TIME_TO_OBST && autonomousTimer.get() <= 8)
		 {
			 DRIVE.shiftLowGear();
			 DRIVE.drive(RobotMap.SPEED_AT_OBST);
		 }
		 DRIVE.drive(0);
		 autonomousTimer.stop();
		 autonomousTimer.reset();
	}
	 
	protected boolean isFinished() {
	 return false;
	}
	 
	protected void end() {
		 DRIVE.shiftHighGear();
		 DRIVE.drive(0);
	}
	 
	protected void interrupted() {
		 DRIVE.shiftHighGear();
		 DRIVE.drive(0);
	}

}
