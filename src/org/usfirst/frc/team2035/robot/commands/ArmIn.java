package org.usfirst.frc.team2035.robot.commands;
import org.usfirst.frc.team2035.robot.OI;
import org.usfirst.frc.team2035.robot.Robot; 
import org.usfirst.frc.team2035.robot.subsystems.ArmSubsystem;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
public class ArmIn extends CommandBase {

	private final ArmSubsystem arm;
	

	
	  public ArmIn() {
	        super("ArmIn");
	        arm = Robot.getArm();
	        requires(arm);
	    }

	   


		@Override
		protected void execute() {
			
			arm.ArmIn();
		}

		@Override
		protected void initialize() {
		
		arm.ArmIn();
			
		}

		@Override
		protected void interrupted() {
		
			
		}

		@Override
		protected boolean isFinished() {
		
			return true;
		}
	
		@Override
		protected void end() {
			
			
		}
	
	
	
	
	
}
