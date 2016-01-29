package org.usfirst.frc.team2035.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team2035.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Victor;


public class ArmSubsystem extends SubsystemBase {
	
	//Variable Setup

	//private final Solenoid extendPiston;
   // private final Solenoid retractPiston;
    private Victor rightArmMotor;
    private Victor leftArmMotor;
    private Solenoid leftArmInSol;
    private Solenoid leftArmOutSol;
    private Solenoid rightArmInSol;
    private Solenoid rightArmOutSol;

	
	
	
	public ArmSubsystem()
	{
		super("Arm");
		
	
	}
	
	public ArmSubsystem(String n)
	{
		super("Arm");
		//name = n;
	}
	
	


	public void init() {
		
		// init Motors
		rightArmMotor = new Victor(RobotMap.R_ARM_MOTOR_PWM);
		leftArmMotor = new Victor(RobotMap.L_ARM_MOTOR_PWM);
		
		//Init Soles
		leftArmInSol = new Solenoid(RobotMap.L_ARM_AIR_IN_PCM, RobotMap.PCM_ID);
		leftArmOutSol = new Solenoid(RobotMap.L_ARM_AIR_OUT_PCM, RobotMap.PCM_ID);
		rightArmInSol = new Solenoid(RobotMap.R_ARM_AIR_IN_PCM, RobotMap.PCM_ID);
		rightArmOutSol = new Solenoid(RobotMap.R_ARM_AIR_OUT_PCM, RobotMap.PCM_ID);
		
	}
	
	
	
	public void ArmIn() {
		// solenoid bringing arm up
		leftArmInSol.set(true);
		leftArmOutSol.set(false);
		rightArmInSol.set(true);
		rightArmOutSol.set(false);
	}
	
	
	public void ArmOut() {
		// solenoid bringing arm down
		leftArmInSol.set(false);
		leftArmOutSol.set(true);
		rightArmInSol.set(false);
		rightArmOutSol.set(true);
	}
	
	
	
	// Spins the Rollers
	
	public void SpinIn() {
		rightArmMotor.set(RobotMap.ARM_MOTOR_SPEED);
		leftArmMotor.set(RobotMap.ARM_MOTOR_SPEED);
		
	}
	
	// Spins the Rollers
	
	public void SpinOut() {
		rightArmMotor.set(RobotMap.ARM_MOTOR_SPEED_BACKWARDS);
		leftArmMotor.set(RobotMap.ARM_MOTOR_SPEED_BACKWARDS);
		
	}

	

	
	protected void initDefaultCommand() {
		
		
	}
	
	
	// Turns arm off
	public void MotorOff() {
		
		leftArmMotor.set(0.0);
		rightArmMotor.set(0.0);
	}

	
	public void end() {
		
	}


	
		
	}


