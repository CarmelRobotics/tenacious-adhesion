/*----------------------------------------------------------------------------*/
/* Copyright (c) 2016 FIRST Team 2035. All Rights Reserved.                   */
/* Open Source Software - may be modified and shared by FRC teams.            */
/*----------------------------------------------------------------------------*/
package org.usfirst.frc.team2035.robot.subsystems;

import org.usfirst.frc.team2035.robot.subsystems.SubsystemBase;
import org.usfirst.frc.team2035.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick; 
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Victor;

public class NewArm extends SubsystemBase {
	
	private Joystick stick;
	private DoubleSolenoid sol;
	private DoubleSolenoid sol2;
	private Victor speedControl;
	
	public NewArm() {
		super("Arm");
		

		stick = RobotMap.DRIVER_JOYSTICK_B;
		sol = new DoubleSolenoid(RobotMap.PCM_ID, RobotMap.ARM_FORWARD_PCM, RobotMap.ARM_REVERSE_PCM);
		sol2 = new DoubleSolenoid(RobotMap.PCM_ID, RobotMap.SEESAW_FORWARD_PCM, RobotMap.SEESAW_REVERSE_PCM);
		speedControl = new Victor(RobotMap.BALL_ROLLER_PWM);
	}
	
	//test
	
	public void init() {
		
	}
	
	public void pickUpBall() {
		//if the joystick is pushed forward, the solenoid will release air
		//if it is returned to 0, the piston stop
		//if the joystick is pushed backwards, air will be sucked out of the piston

		
		if(stick.getY() > 0)
		{
			sol.set(DoubleSolenoid.Value.kForward);
		}
		else if(stick.getY() < 0) {
			sol.set(DoubleSolenoid.Value.kReverse);
		}
		else {
			sol.set(DoubleSolenoid.Value.kOff);
		}
	}
	
	public void solTest()
	{
		if(sol.get() == DoubleSolenoid.Value.kForward)
		{
			sol.set(DoubleSolenoid.Value.kReverse);
		}
		else if(sol.get() == DoubleSolenoid.Value.kReverse)
		{
			sol.set(DoubleSolenoid.Value.kForward);
		}
		else {
			sol.set(DoubleSolenoid.Value.kForward);
		}
	}
	public void extraExtend()
	{
//		//if the arm is not extended all the way, it will extend it
//		//if not, the extra piston will retract
//		//however, it will only turn on if the original piston is extended
		//sol2.set(DoubleSolenoid.Value.kForward);
		if(sol2.get() == DoubleSolenoid.Value.kReverse)
		{
			sol2.set(DoubleSolenoid.Value.kForward);
		}
		else
		{
			sol2.set(DoubleSolenoid.Value.kReverse);
		}
		/*
		if(sol2.get() == DoubleSolenoid.Value.kReverse) {
			sol2.set(DoubleSolenoid.Value.kForward);
		}
		else if(sol2.get() == DoubleSolenoid.Value.kForward)
		{
			sol2.set(DoubleSolenoid.Value.kReverse);
		}
		else {
			sol2.set(DoubleSolenoid.Value.kOff);
		}*/

	}
	
	public void ballRollersForward()
	{
		speedControl.set(RobotMap.BALL_ROLLER_FORWARD);
	}
	
	public void ballRollersReverse()
	{
		speedControl.set(RobotMap.BALL_ROLLER_REVERSE);
	}
	
	public void ballRollersOff()
	{
		speedControl.set(RobotMap.BALL_ROLLER_OFF);
	}
	
	public void setSolenoid(DoubleSolenoid.Value v) {
		sol.set(v);
	}
	
	
	
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
	
	public void end() {
		
	}
	
	//comment
	
	

}
