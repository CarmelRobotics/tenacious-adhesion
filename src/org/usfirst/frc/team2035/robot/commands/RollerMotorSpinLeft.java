package org.usfirst.frc.team2035.robot.commands;

import org.usfirst.frc.team2035.robot.Robot;
import org.usfirst.frc.team2035.robot.subsystems.Rollers;


public class RollersMotorSpinLeft extends CommandBase {

	private final Rollers Rollers;

	public RollersMotorSpinLeft() {
		super("Rollersmotorleft");
		Rollers = Robot.getRollers();
		requires(Rollers);
	}

	@Override
	protected void initialize() {
		Rollers.spinLeft();

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
		Rollers.motorOff();

	}

	@Override
	protected void interrupted() {
		Rollers.motorOff();

	}
}
