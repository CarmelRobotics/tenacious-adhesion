/*----------------------------------------------------------------------------*/
/* Copyright (c) 2016 FIRST Team 2035. All Rights Reserved.                   */
/* Open Source Software - may be modified and shared by FRC teams.            */
/*----------------------------------------------------------------------------*/
package org.usfirst.frc.team2035.robot.commands;
import org.usfirst.frc.team2035.robot.OI;
import org.usfirst.frc.team2035.robot.Robot; 
import org.usfirst.frc.team2035.robot.subsystems.NewArm;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
public class ExtraPush extends CommandBase {

	private final NewArm arm;
	public static OI oi;

	
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
			oi = new OI();
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
