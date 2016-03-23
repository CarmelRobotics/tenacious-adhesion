package org.usfirst.frc.team2035.robot.commands;

import org.usfirst.frc.team2035.robot.*;

import org.usfirst.frc.team2035.robot.subsystems.*;

import edu.wpi.first.wpilibj.Timer;

public class AutonomousPutArmDown extends CommandBase {
	//this autonomous drives forward, puts arm down, then drives forward
	private final DriveTrain DRIVE;
	private final NewArm ARM;
	private Timer autonomousTimer;
	public static OI oi;
	
	
	public AutonomousPutArmDown(){
		super("Drive");
		
		DRIVE = Robot.getDriveTrain();
		ARM = Robot.getNewArm();
		
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
		ARM.extraExtend();
		 while(autonomousTimer.get() > RobotMap.TIME_TO_OBST && autonomousTimer.get() <= 8)
		 {
			 DRIVE.shiftLowGear();
			 DRIVE.drive(RobotMap.SPEED_AT_OBST);
		 }
		 ARM.extraExtend();
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
