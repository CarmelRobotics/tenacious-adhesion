package org.usfirst.frc.team2035.robot;

 // The RobotMap is a mapping from the ports sensors and actuators are wired into
  //to a variable name. This provides flexibility changing wiring, makes checking
 // the wiring easier and significantly reduces the number of magic numbers
 // floating around.
 
 import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import com.ni.vision.NIVision;
import com.ni.vision.NIVision.Image;
 
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	/*
	 * Motor PWMs
	 */

    public static final int R_ARM_MOTOR_PWM = 6; // Right roller motor is wired to PWM out 6
    public static final int L_ARM_MOTOR_PWM = 7; // Left roller motor is wired to PWM out 7
    
    /*
	 * Solenoid PWMs
	 */
    public static final int L_ARM_AIR_IN_PCM = 0; // Left Roller Solenoid is wired to PCM 0
    public static final int L_ARM_AIR_OUT_PCM = 1; // Left Roller Solenoid is wired to PCM 0
    public static final int R_ARM_AIR_IN_PCM = 0; // Left Roller Solenoid is wired to PCM 0
    public static final int R_ARM_AIR_OUT_PCM = 1; // Left Roller Solenoid is wired to PCM 0
   
    /*
	 * PCM's (can have numbers 1-14)
	 */
  
    public static final int PCM_ID = 1;
  
  // Speed
  
    public static final double ARM_MOTOR_SPEED = .5; //chain motor lift speed is set to lift at half speed 50%
    public static final double ARM_MOTOR_SPEED_BACKWARDS = -1; //chain motor lift speed is set to lift at half speed 50%
    
   //hur dur
    
    
   
    
    
  
    
}

