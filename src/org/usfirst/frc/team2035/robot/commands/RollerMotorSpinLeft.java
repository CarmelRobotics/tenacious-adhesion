package org.usfirst.frc.team2035.robot.commands;

import org.usfirst.frc.team2035.robot.Robot;
import org.usfirst.frc.team2035.robot.subsystems.Rollers;


public class RollerMotorSpinLeft extends CommandBase {
	
	private final Rollers rollers;

	public RollerMotorSpinLeft() {
		super("rollermotorleft");
		rollers = Robot.getRollers();
		requires(rollers);
	}

	@Override
	protected void initialize() {
		rollers.spinLeft();

		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		rollers.motorOff();
		
	}

	@Override
	protected void interrupted() {
		rollers.motorOff();
		
	}

}