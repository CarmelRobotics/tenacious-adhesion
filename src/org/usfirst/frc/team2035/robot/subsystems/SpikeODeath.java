/*----------------------------------------------------------------------------*/
/* Copyright (c) 2016 FIRST Team 2035. All Rights Reserved.                   */
/* Open Source Software - may be modified and shared by FRC teams.            */
/*----------------------------------------------------------------------------*/
package org.usfirst.frc.team2035.robot.subsystems;
import org.usfirst.frc.team2035.robot.RobotMap;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Victor; 


public class SpikeODeath extends SubsystemBase {

private String name;
private DoubleSolenoid sol;
private Solenoid airInSole, airOutSole;
private Victor spike;
private Servo steve;
//public Victor counterClawkwise; // This too.
	public SpikeODeath()
	{ 
		super("Crane");
		//name = "";
		sol = new DoubleSolenoid(RobotMap.PCM_ID, RobotMap.SPIKE_PCM_FORWARD, RobotMap.SPIKE_PCM_REVERSE);
		//sol = new Solenoid(RobotMap.PCM_ID, RobotMap.SPIKE_PCM_FORWARD);
		//airInSole = new Solenoid(RobotMap.CRANE_SOLENOID_VALUE);
		//airOutSole = new Solenoid(RobotMap.CRANE_SOLENOID_VALUE_REVERSE);
		//airInSole.set(false);
		//airOutSole.set(true);
		steve = new Servo(RobotMap.SERVO_PWM);
		spike = new Victor(RobotMap.HANGER_VICTOR_PWM);
		//counterClawkwise = new Victor(0);
	}
	/*
	public SpikeODeath(String n)
	{
		super("Crane");
		name = n;
		sol = new DoubleSolenoid(RobotMap.PCM_ID, RobotMap.SPIKE_PCM_FORWARD, RobotMap.SPIKE_PCM_REVERSE);
		//airInSole = new Solenoid(RobotMap.CRANE_SOLENOID_VALUE);
		//airOutSole = new Solenoid(RobotMap.CRANE_SOLENOID_VALUE_REVERSE);
		//airInSole.set(false);
		//airOutSole.set(true);
		spike = new Victor(0);
		//counterClawkwise = new Victor(0);
	}
	*/
	public void init(){
		
	}
	
	public void activate() {
		sol.set(DoubleSolenoid.Value.kForward);
		
	}
	
	public void retract() {
		sol.set(DoubleSolenoid.Value.kReverse);
		
	}
	
	public void solOff() {
		sol.set(DoubleSolenoid.Value.kOff);
	}
	
//	public void activate() {
//		sol.set(true);
//	}
//	public void retract() {
//		sol.set(false);
//	}
	
	
	public void setSpikeDown() {
		steve.setAngle(180);
		if(steve.getAngle() == 180)
		{
		spike.set(RobotMap.SPIKE_MOTOR_FORWARD);
		}
	}
	
	public void setSpikeUp() {
		steve.setAngle(0);
		
		if(steve.getAngle() ==0) 
		{
		spike.set(RobotMap.SPIKE_MOTOR_REVERSE);
		}
		
	}
	
	public void lockSpike() {
		steve.setAngle(180);
	}
	
	public void setSpikeStop() {
		spike.set(RobotMap.SPIKE_MOTOR_OFF);
		steve.setAngle(180);
		
	}
	
	
	
	
//	//closes crane
//	public void craneGrab()
//	{
//		airInSole.set(false);
//	
//		airOutSole.set(true);
//		System.out.println("Grab Works");
//	}
//	//opens crane
//	public void craneOpen()
//	{
//		airInSole.set(true);
//		airOutSole.set(false);
//		System.out.println("Open Works");
//	}
//	//turns crane clockwise
//	public void craneHandRotateCW()
//	{
//		claw.set(RobotMap.CRANE_MOTOR_ROTATE_CW);
//		//counterClawkwise.set(0);
//		System.out.println("Clockwise Works");
//	}
//	//to turn it counterclockwise
//	public void craneHandRotateCCW()
//	{
//		claw.set(RobotMap.CRANE_MOTOR_ROTATE_CCW);
//		//clawkwise.set(0);
//		System.out.println("Counterclockwise Works");
//	}
//	//for when no buttons are being pressed
//	public void motorReset()
//	{
//		claw.set(0);
//		//counterClawkwise.set(0);
//		System.out.println("Works");
//	}
	
	public void end(){
		
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	};
}
//Centipede was here