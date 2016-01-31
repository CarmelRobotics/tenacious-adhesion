package org.usfirst.frc.team2035.robot.commands;
import org.usfirst.frc.team2035.robot.OI;
import org.usfirst.frc.team2035.robot.Robot; 
import org.usfirst.frc.team2035.robot.subsystems.NewArm;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
public class ExtraPush extends CommandBase {

	private final NewArm arm;
	

	
	  public ExtraPush() {
	        super("Extra Push");
	        arm = Robot.getNewArm();
	        requires(arm);
	    }

	   


		@Override
		protected void execute() {
			
			arm.extraExtend();
		}

		@Override
		protected void initialize() {
			
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
