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
	public SpikeODeath()
	{ 
		super("SpikeODeath");
		name = "";
		sol = new DoubleSolenoid(RobotMap.PCM_ID, RobotMap.SPIKE_PCM_FORWARD, RobotMap.SPIKE_PCM_REVERSE);
		spike = new Victor(0);
	}
	
	public SpikeODeath(String n)
	{
		super("SpikeODeath");
		name = n;
		sol = new DoubleSolenoid(RobotMap.PCM_ID, RobotMap.SPIKE_PCM_FORWARD, RobotMap.SPIKE_PCM_REVERSE);
		spike = new Victor(0);
	}
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
	
	public void end(){}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	};
}
//Centipede was here