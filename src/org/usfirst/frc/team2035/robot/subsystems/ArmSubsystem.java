package org.usfirst.frc.team2035.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem; 
import org.usfirst.frc.team2035.robot.RobotMap;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Victor;


public class ArmSubsystem extends SubsystemBase {
	
	//Variable Setup
	private static int PWN = 5;
	//private final Solenoid extendPiston;
   // private final Solenoid retractPiston;
    private Victor rightArmMotor;
    private Victor leftArmMotor;
    private Solenoid leftArmSol;
    private Solenoid rightArmSol;

	
	
	
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
		leftArmSol = new Solenoid(RobotMap.L_ARM_AIR_PCM, RobotMap.PCM_ID);
		rightArmSol = new Solenoid(RobotMap.R_ARM_AIR_PCM, RobotMap.PCM_ID);
		
	}
	
	
	public void armIn() {
		rightArmMotor.set(RobotMap.ARM_MOTOR_SPEED);
		leftArmMotor.set(RobotMap.ARM_MOTOR_SPEED);
		
	}
	
	
	
	public void armOut() {
		rightArmMotor.set(RobotMap.ARM_MOTOR_SPEED_BACKWARDS);
		leftArmMotor.set(RobotMap.ARM_MOTOR_SPEED_BACKWARDS);
		
	}

	

	
	protected void initDefaultCommand() {
		
		
	}
	
	
	
	public void motorOff() {
		
		leftArmMotor.set(0.0);
		rightArmMotor.set(0.0);
	}

	
	public void end() {
		
	}


	
		
	}


