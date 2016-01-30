package org.usfirst.frc.team2035.robot.subsystems;
import org.usfirst.frc.team2035.robot.RobotMap;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Victor;  

public class BoulderGrabber extends SubsystemBase {
//public abstract class BoulderGrabber extends SubsystemBase {
private String name;
public Solenoid bgSolenoidBL, bgSolenoidBR, bgSolenoidTR, bgSolenoidTL;
public Solenoid bgSolenoidBLIn, bgSolenoidBRIn, bgSolenoidTRIn, bgSolenoidTLIn;
public Victor boulderPush; 
	public BoulderGrabber()
	{ 
		super("BoulderGrabber");
		name = "";
		bgSolenoidBL = new Solenoid(RobotMap.BOULDERGRABBER_SOLENOID_PCM_BL); //bottom-left
		bgSolenoidBR = new Solenoid(RobotMap.BOULDERGRABBER_SOLENOID_PCM_BR); //bottom-right
		bgSolenoidTR= new Solenoid(RobotMap.BOULDERGRABBER_SOLENOID_PCM_TR); //top-right
		bgSolenoidTL = new Solenoid(RobotMap.BOULDERGRABBER_SOLENOID_PCM_TL); //top-left
		bgSolenoidBL.set(false);
		bgSolenoidBR.set(false);
		bgSolenoidTL.set(false);
		bgSolenoidTL.set(false);
		boulderPush = new Victor(RobotMap.BOULDERGRABBER_VICTOR_PCM);
		boulderPush.set(0);
	}
	
	public BoulderGrabber(String n)
	{
		super("BoulderGrabber");
		name = "n";
		bgSolenoidBL = new Solenoid(RobotMap.BOULDERGRABBER_SOLENOID_PCM_BL);
		bgSolenoidBR = new Solenoid(RobotMap.BOULDERGRABBER_SOLENOID_PCM_BR);
		bgSolenoidTR= new Solenoid(RobotMap.BOULDERGRABBER_SOLENOID_PCM_TR);
		bgSolenoidTL = new Solenoid(RobotMap.BOULDERGRABBER_SOLENOID_PCM_TL);
		bgSolenoidBL.set(false);
		bgSolenoidBR.set(false);
		bgSolenoidTL.set(false);
		bgSolenoidTL.set(false);
		boulderPush = new Victor(RobotMap.BOULDERGRABBER_VICTOR_PCM);
		boulderPush.set(0);
	}
	public void init(){};
	
	public void boulderGrabberExtend()
	{
		bgSolenoidBL.set(true);
		bgSolenoidBR.set(true);
		bgSolenoidTL.set(true);
		bgSolenoidTR.set(true);
	}

	public void boulderGrabberRetract()
	{
		bgSolenoidBL.set(false);
		bgSolenoidBR.set(false);
		bgSolenoidTL.set(false);
		bgSolenoidTR.set(false);
	}

	public void boulderGrabberRoll()
	{
		boulderPush.set(RobotMap.BOULDERGRABBER_MOTOR_ROLL);
	}


	
	public void boulderGrabberMotorReset()
	{
		boulderPush.set(0);
	}
	
	public void end(){}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	};
}
//Centipede was here