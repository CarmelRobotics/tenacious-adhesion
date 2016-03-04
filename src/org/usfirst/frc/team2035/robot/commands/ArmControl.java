/*----------------------------------------------------------------------------*/
/* Copyright (c) 2016 FIRST Team 2035. All Rights Reserved.                   */
/* Open Source Software - may be modified and shared by FRC teams.            */
/*----------------------------------------------------------------------------*/
package org.usfirst.frc.team2035.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;


import edu.wpi.first.wpilibj.Joystick;

import org.usfirst.frc.team2035.robot.OI;
import org.usfirst.frc.team2035.robot.Robot;
import org.usfirst.frc.team2035.robot.subsystems.NewArm;


public class ArmControl extends CommandBase {
	
	public static Joystick JOYSTICK;
	public static NewArm ARM;
	private int x;
	
	public ArmControl() {
        super("Arm Control");
        ARM = Robot.getNewArm();
        requires(ARM);
        x=0;
    }
	
	
	protected void initialize() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        x=0;
    	oi = new OI();
        // Show what command your subsystem is running on the SmartDashboard
        //SmartDashboard.putData(spike);
	}
	
	
	protected void execute() {
		ARM.pickUpBall();
	}
	
	protected void end() {
		ARM.setSolenoid(DoubleSolenoid.Value.kOff);
	}
	
	protected void interrupted() {
		ARM.setSolenoid(DoubleSolenoid.Value.kOff);
	}
	
	protected boolean isFinished() {
		return true;
		/*if(x<10)
		{
			x++;
		return false;
		}
		else
		{
			x=0;
			return true;
		}*/
	}
	
	

}
