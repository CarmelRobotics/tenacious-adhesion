package org.usfirst.frc.team2035.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team2035.robot.Robot;
import org.usfirst.frc.team2035.robot.subsystems.NewArm;


public class ArmControl extends CommandBase {
	
	private final Joystick JOYSTICK;
	private final NewArm ARM;
	
	
	public ArmControl(Joystick j) {
		
		JOYSTICK = j;
		ARM = Robot.getNewArm();
	}
	
	protected void initialize() {
		
	}
	
	
	protected void execute() {
		ARM.pickUpBall();
	}
	
	protected void end() {
		
	}
	
	protected void interrupted() {
		ARM.setSolenoid(DoubleSolenoid.Value.kOff);
	}
	
	protected boolean isFinished() {
		return false;
	}
	
	

}
