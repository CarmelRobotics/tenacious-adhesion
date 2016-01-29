package org.usfirst.frc.team2035.robot.commands;
import org.usfirst.frc.team2035.robot.OI;

import org.usfirst.frc.team2035.robot.Robot; 
import org.usfirst.frc.team2035.robot.subsystems.ArmSubsystem;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
public class SpinOut extends CommandBase {

	private final ArmSubsystem arm;
	

	
	  public SpinOut(String name) {
	        super("SpinOut");
	        arm = Robot.getArm();
	        requires(arm);
	    }

	   
	

	

		@Override
		protected void execute() {
			arm.SpinOut();
	
		}

		@Override
		protected void initialize() {
		
		arm.SpinOut();
			
		}

		@Override
		protected void interrupted() {
			arm.MotorOff();
			
		}
		
	

		@Override
		protected boolean isFinished() {
		
			return false;
		}
	
	
		@Override
		protected void end() {
			arm.MotorOff();
			
		}
	
	
	
	
}
