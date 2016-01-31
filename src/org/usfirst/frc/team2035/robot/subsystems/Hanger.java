package org.usfirst.frc.team2035.robot.subsystems;
import org.usfirst.frc.team2035.robot.RobotMap;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Victor;  

public class Hanger extends SubsystemBase{
	//public static Solenoid airIn1, airOut1, airIn2, airOut2, airIn3, airOut3;
	public Victor canthang;
	String name = "";
	public Hanger()
	{
		super();
		//airIn1 = new Solenoid(RobotMap.HANGER_SOLENOID_EXTEND);
		//airIn1.set(false);
		//airIn2 = new Solenoid(RobotMap.HANGER_SOLENOID_EXTEND);
		//airIn2.set(false);
		//airIn3 = new Solenoid(RobotMap.HANGER_SOLENOID_EXTEND);
		//airIn3.set(false);
		//airOut1 = new Solenoid(RobotMap.HANGER_SOLENOID_RETRACT);
		//airOut1.set(true);
		//airOut2 = new Solenoid(RobotMap.HANGER_SOLENOID_RETRACT);
		//airOut2.set(true);
		//airOut3 = new Solenoid(RobotMap.HANGER_SOLENOID_RETRACT);
		//airOut3.set(true);
		canthang = new Victor(RobotMap.HANGER_VICTOR_PWM);
		canthang.set(0);
	}
	public Hanger(String n)
	{
		name = n;
		//airIn1 = new Solenoid(RobotMap.HANGER_SOLENOID_EXTEND);
		//airIn1.set(false);
		//airIn2 = new Solenoid(RobotMap.HANGER_SOLENOID_EXTEND);
		//airIn2.set(false);
		//airIn3 = new Solenoid(RobotMap.HANGER_SOLENOID_EXTEND);
		//airIn3.set(false);
		//airOut1 = new Solenoid(RobotMap.HANGER_SOLENOID_RETRACT);
		//airOut1.set(true);
		//airOut2 = new Solenoid(RobotMap.HANGER_SOLENOID_RETRACT);
		//airOut2.set(true);
		//airOut3 = new Solenoid(RobotMap.HANGER_SOLENOID_RETRACT);
		//airOut3.set(true);
		canthang.set(0);
	}
	public void init() {};
	
	public void hangerExtend()
	{
		//airIn1.set(true);
		//airIn2.set(true);
		//airIn3.set(true);
		//airOut1.set(false);
		//airOut2.set(false);
		//airOut3.set(false);
		canthang.set(RobotMap.HANGER_MOTOR_EXTEND);
	}
	public void hangerRetract()
	{
		//airOut1.set(true);
		//airOut2.set(true);
		//airOut3.set(true);
		//airIn1.set(false);
		//airIn2.set(false);
		//airIn3.set(false);
		canthang.set(RobotMap.HANGER_MOTOR_RETRACT);
		
	}
	public void end() {};
	@Override
	protected void initDefaultCommand() {};

}
