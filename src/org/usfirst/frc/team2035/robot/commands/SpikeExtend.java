package org.usfirst.frc.team2035.robot.commands;

import org.usfirst.frc.team2035.robot.*;

import org.usfirst.frc.team2035.robot.subsystems.*;


public class SpikeExtend extends CommandBase {
	 
	private final SpikeODeath SPIKE;
	public static OI oi;
	
	public SpikeExtend() {
		super("Spike");
		
		SPIKE = Robot.getSpike();
	}
	
	protected void initialize() {
		oi = new OI();
	}

	protected void execute() {
		SPIKE.activate();
	}
	 
	protected boolean isFinished() {
	 return false;
	}
	 
	protected void end() {
		SPIKE.activate();
	}
	 
	protected void interrupted() {
		SPIKE.activate();
	}

}
