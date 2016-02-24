package org.usfirst.frc.team2035.robot.commands;

import org.usfirst.frc.team2035.robot.*;

import org.usfirst.frc.team2035.robot.subsystems.*;


public class SpikeExtend extends CommandBase {
	 
	private int x = 0;
	
	private final SpikeODeath SPIKE;
	public static OI oi;
	
	public SpikeExtend() {
		super("Spike");
		
		x=0;
		SPIKE = Robot.getSpike();
		SPIKE.activate();
	}
	
	protected void initialize() {
		x=0;
		oi = new OI();
	}

	protected void execute() {
		SPIKE.activate();
	}
	 
	protected boolean isFinished() {

	 return false;

	}
	 
	protected void end() {
		SPIKE.solOff();
	}
	 
	protected void interrupted() {
		SPIKE.solOff();
	}

}
