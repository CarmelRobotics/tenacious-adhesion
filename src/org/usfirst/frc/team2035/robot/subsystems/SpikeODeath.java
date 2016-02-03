package org.usfirst.frc.team2035.robot.subsystems;
import org.usfirst.frc.team2035.robot.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Victor; 


public class SpikeODeath extends SubsystemBase {

private String name;
private DoubleSolenoid sol;
private Solenoid airInSole, airOutSole;
private Victor spike; 
//public Victor counterClawkwise; // This too.
	public SpikeODeath()
	{ 
		super("Crane");
		//name = "";
		sol = new DoubleSolenoid(RobotMap.PCM_ID, RobotMap.SPIKE_PCM_FORWARD, RobotMap.SPIKE_PCM_REVERSE);
		//airInSole = new Solenoid(RobotMap.CRANE_SOLENOID_VALUE);
		//airOutSole = new Solenoid(RobotMap.CRANE_SOLENOID_VALUE_REVERSE);
		//airInSole.set(false);
		//airOutSole.set(true);
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
	public void init(){};
	
	public void activate() {
		sol.set(DoubleSolenoid.Value.kForward);
	}
	
	public void retract() {
		sol.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void setSpikeUp() {
		spike.set(RobotMap.SPIKE_MOTOR_FORWARD);
	}
	
	public void setSpikeDown() {
		spike.set(RobotMap.SPIKE_MOTOR_REVERSE);
		
	}
	
	public void setSpikeStop() {
		spike.set(RobotMap.SPIKE_MOTOR_OFF);
		
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
	
	public void end(){}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	};
}
//Centipede was here