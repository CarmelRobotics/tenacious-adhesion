package org.usfirst.frc.team2035.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem; 

import org.usfirst.frc.team2035.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Victor;



public class ArmSubsystem extends SubsystemBase {
	
	//Variable Setup

	//private final Solenoid extendPiston;
   // private final Solenoid retractPiston;
    private Victor rightArmMotor;
    private Victor leftArmMotor;
   private DoubleSolenoid rightArmSol;
   private DoubleSolenoid leftArmSol;

	
	
	
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
		leftArmSol = new DoubleSolenoid(RobotMap.PCM_ID, RobotMap.L_ARM_AIR_IN_PCM, RobotMap.L_ARM_AIR_OUT_PCM);
		rightArmSol = new DoubleSolenoid(RobotMap.PCM_ID, RobotMap.R_ARM_AIR_IN_PCM, RobotMap.R_ARM_AIR_OUT_PCM);
	
		
	}
	
	
	
	public void ArmIn() {
		// solenoid bringing arm up
		leftArmSol.set(DoubleSolenoid.Value.kForward);
		rightArmSol.set(DoubleSolenoid.Value.kForward);
	}
	
	
	public void ArmOut() {
		// solenoid bringing arm down
		leftArmSol.set(DoubleSolenoid.Value.kReverse);
		rightArmSol.set(DoubleSolenoid.Value.kReverse);
	}
	
	
	
	// Spins the Rollers
	
	public void SpinIn() {
		rightArmMotor.set(RobotMap.SECOND_ARM_MOTOR_SPEED);
		leftArmMotor.set(RobotMap.SECOND_ARM_MOTOR_SPEED);
		
	}
	
	// Spins the Rollers
	
	public void SpinOut() {
		rightArmMotor.set(RobotMap.SECOND_ARM_MOTOR_SPEED_BACKWARDS);
		leftArmMotor.set(RobotMap.SECOND_ARM_MOTOR_SPEED_BACKWARDS);
		
	}

	

	
	protected void initDefaultCommand() {
		
		
	}
	
	
	// Turns motor for arm off
	public void MotorOff() {
		
		leftArmMotor.set(0.0);
		rightArmMotor.set(0.0);
	}

	
	public void end() {
		
	}


	
		
	}


