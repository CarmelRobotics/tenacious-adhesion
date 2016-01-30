package org.usfirst.frc.team2035.robot.commands;
import org.usfirst.frc.team2035.robot.OI;
import org.usfirst.frc.team2035.robot.Robot; 
import org.usfirst.frc.team2035.robot.subsystems.ArmSubsystem;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
public class SpinIn extends CommandBase {

	private final ArmSubsystem arm;
	

	
	  public SpinIn() {
	        super("SpinIn");
	        arm = Robot.getArm();
	        requires(arm);
	    }

	   
	


		@Override
		protected void execute() {
			
	
		}

		@Override
		protected void initialize() {
		
		arm.SpinIn();
			
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
