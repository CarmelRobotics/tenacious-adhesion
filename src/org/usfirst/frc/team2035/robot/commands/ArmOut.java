package org.usfirst.frc.team2035.robot.commands;
import org.usfirst.frc.team2035.robot.OI;
import org.usfirst.frc.team2035.robot.Robot; 
import org.usfirst.frc.team2035.robot.subsystems.ArmSubsystem;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ArmOut extends CommandBase {

	private final ArmSubsystem arm;
	

	
	  public ArmOut() {
	        super("ArmOut");
	        arm = Robot.getArm();
	        requires(arm);
	    }

	   
	

	

		@Override
		protected void execute() {
			arm.ArmOut();
	 
		}

		@Override
		protected void initialize() {
		
		arm.ArmOut();
			
		}

		@Override
		protected void interrupted() {
		
			
		}

		@Override
		protected boolean isFinished() {
		
			return false;
		}
	
	
		@Override
		protected void end() {
			
			
		}
	
	
	
	
}
