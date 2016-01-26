package org.usfirst.frc.team2035.robot.subsystems;

import org.usfirst.frc.team2035.robot.subsystems.SubsystemBase;
import org.usfirst.frc.team2035.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick; 
import edu.wpi.first.wpilibj.DoubleSolenoid;

public class NewArm extends SubsystemBase {
	
	private Joystick stick;
	private DoubleSolenoid sol;
	private DoubleSolenoid sol2;
	
	public NewArm() {
		super("Arm");
		
		stick = new Joystick(RobotMap.JOYSTICK_L_USB_NUMBER);
		sol = new DoubleSolenoid(RobotMap.PCM_ID, RobotMap.ARM_FORWARD_PCM, RobotMap.ARM_REVERSE_PCM);
		sol2 = new DoubleSolenoid(RobotMap.PCM_ID, RobotMap.SEESAW_FORWARD_PCM, RobotMap.SEESAW_REVERSE_PCM);
	}
	
	public void init() {
		
	}
	
	public void pickUpBall() {
		//if the joystick is pushed forward, the solenoid will release air
		//if it is returned to 0, the piston stop
		//if the joystick is pushed backwards, air will be sucked out of the piston
		if(stick.getY() > 0)
		{
			sol.set(DoubleSolenoid.Value.kForward);
		}
		else if(stick.getY() < 0) {
			sol.set(DoubleSolenoid.Value.kReverse);
		}
		else {
			sol.set(DoubleSolenoid.Value.kOff);
		}
	}
	
	public void extraExtend()
	{
//		//if the arm is not extended all the way, it will extend it
//		//if not, the extra piston will retract
//		//however, it will only turn on if the original piston is extended
		
		sol2.set(DoubleSolenoid.Value.kForward);
//		if(sol2.get() == false)
//		{
//			if(sol1.get() == true)
//			{
//				sol2.set(true);
//			}
//			else if(sol1.get() == true)
//			{
//				sol2.set(true);
//			}
//			sol2.set(false);
//		}
//		else if(sol2.get() == true)
//		{
//			sol2.set(false);
//		}
//		else if(sol1.get() == false)
//		{
//			sol2.set(false);
//		}
	}
	
	
	
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
	
	public void end() {
		
	}
	
	//comment
	
	

}
