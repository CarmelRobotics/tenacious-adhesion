/*----------------------------------------------------------------------------*/
/* Copyright (c) 2016 FIRST Team 2035. All Rights Reserved.                   */
/* Open Source Software - may be modified and shared by FRC teams.            */
/*----------------------------------------------------------------------------*/
package org.usfirst.frc.team2035.robot.commands;

import org.usfirst.frc.team2035.robot.subsystems.NewArm;
import org.usfirst.frc.team2035.robot.OI;
import org.usfirst.frc.team2035.robot.Robot;

public class ArmPushUp extends CommandBase {
	
	private final NewArm arm;
	public static OI oi;
	
	public ArmPushUp() {
        super("Arm All Up");
        arm = Robot.getNewArm();
        requires(arm);
    }

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		arm.solenoidsOff();
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		arm.allUp();
		
	}

	@Override
	protected void initialize() {
		oi = new OI();
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		arm.solenoidsOff();
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
