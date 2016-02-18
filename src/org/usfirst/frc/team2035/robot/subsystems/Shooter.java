/*----------------------------------------------------------------------------*/
/* Copyright (c) 2016 FIRST Team 2035. All Rights Reserved.                   */
/* Open Source Software - may be modified and shared by FRC teams.            */
/*----------------------------------------------------------------------------*/
package org.usfirst.frc.team2035.robot.subsystems;

import org.usfirst.frc.team2035.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Shooter extends SubsystemBase
{
	
	//private String name;
	//private DoubleSolenoid shooterOn;
	//private Solenoid retractShooter;
	
	
	public Shooter()
	{
		super("shoot");
		//name = "";
		//shooterOn = new DoubleSolenoid(RobotMap.PCM_ID, RobotMap.SHOOTER_SHOOT, RobotMap.SHOOTER_RETRACT);
		//shooterOn.set(false);
		//retractShooter.set(false);
	}
/*	
	public Shooter(String n)
	{
		super("Shooter");
		name = n;
	}
*/
	public void init(){
		
	}//dontevenask
	
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
	}
	
	public void launchShooter()
	{
		//retractShooter.set(false);
		//shooterOn.set(RobotMap.SHOOTER_ON);
		//shooterOn.set(DoubleSolenoid.Value.kForward);

	}
	public void returnShooter()
	{
		//shooterOn.set(false);
		//retractShooter.set(RobotMap.RETRACT_SHOOTER);
		//shooterOn.set(DoubleSolenoid.Value.kReverse);
	}
	public  void end(){
		//dontevenask
	}
	}
