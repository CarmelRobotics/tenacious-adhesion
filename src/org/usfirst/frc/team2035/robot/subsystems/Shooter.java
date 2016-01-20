package org.usfirst.frc.team2035.robot.subsystems;

import org.usfirst.frc.team2035.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;

public class Shooter extends SubsystemBase
{
	
	private String name;
	private Solenoid shooterOn;
	private Solenoid retractShooter;
	
	
	public Shooter()
	{
		super();
		name = "";
		shooterOn.set(false);
		retractShooter.set(false);
	}
	
	public Shooter(String n)
	{
		super("Shooter");
		name = n;
	}
	public void init(){
		
	}//dontevenask
	
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
	}
	
	public void launchShooter()
	{
		retractShooter.set(false);
		shooterOn.set(RobotMap.SHOOTER_ON);
		

	}
	public void returnShooter()
	{
		shooterOn.set(false);
		retractShooter.set(RobotMap.RETRACT_SHOOTER);
	}
	public  void end(){
		//dontevenask
	}
	}
