package org.usfirst.frc.team2035.robot.subsystems;
import org.usfirst.frc.team2035.robot.RobotMap;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Victor;  
public class Crane extends SubsystemBase {
//public abstract class Crane extends SubsystemBase {
private String name;
public Solenoid airInSole, airOutSole;
public Victor claw; 
//public Victor counterClawkwise; // This too.
	public Crane()
	{ 
		super("Crane");
		name = "";
		airInSole = new Solenoid(RobotMap.CRANE_SOLENOID_VALUE);
		airOutSole = new Solenoid(RobotMap.CRANE_SOLENOID_VALUE_REVERSE);
		airInSole.set(false);
		airOutSole.set(true);
		claw = new Victor(0);
		//counterClawkwise = new Victor(0);
	}
	
	public Crane(String n)
	{
		super("Crane");
		name = n;
		airInSole = new Solenoid(RobotMap.CRANE_SOLENOID_VALUE);
		airOutSole = new Solenoid(RobotMap.CRANE_SOLENOID_VALUE_REVERSE);
		airInSole.set(false);
		airOutSole.set(true);
		claw = new Victor(0);
		//counterClawkwise = new Victor(0);
	}
	public void init(){};
	
	//closes crane
	public void craneGrab()
	{
		airInSole.set(false);
	
		airOutSole.set(true);
		System.out.println("Grab Works");
	}
	//opens crane
	public void craneOpen()
	{
		airInSole.set(true);
		airOutSole.set(false);
		System.out.println("Open Works");
	}
	//turns crane clockwise
	public void craneHandRotateCW()
	{
		claw.set(RobotMap.CRANE_MOTOR_ROTATE_CW);
		//counterClawkwise.set(0);
		System.out.println("Clockwise Works");
	}
	//to turn it counterclockwise
	public void craneHandRotateCCW()
	{
		claw.set(RobotMap.CRANE_MOTOR_ROTATE_CCW);
		//clawkwise.set(0);
		System.out.println("Counterclockwise Works");
	}
	//for when no buttons are being pressed
	public void motorReset()
	{
		claw.set(0);
		//counterClawkwise.set(0);
		System.out.println("Works");
	}
	
	public void end(){}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	};
}
//Centipede was here