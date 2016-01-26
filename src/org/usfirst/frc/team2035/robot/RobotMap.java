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

    public static final int R_ARM_MOTOR_PWM = 6; // Right arm motor is wired to PWM out 6
    public static final int L_ARM_MOTOR_PWM = 7; // Left arm motor is wired to PWM out 7
    
    /*
	 * Solenoid PWMs
	 */
    public static final int L_ARM_AIR_IN_PCM = 0; // Left arm Solenoid is wired to PCM 0
    public static final int L_ARM_AIR_OUT_PCM = 1; // Left arm Solenoid is wired to PCM 0
    public static final int R_ARM_AIR_IN_PCM = 0; // Left arm Solenoid is wired to PCM 0
    public static final int R_ARM_AIR_OUT_PCM = 1; // Left arm Solenoid is wired to PCM 0
   
    /*
	 * PCM's
	 */
  
    public static final int PCM_ID = 1;
  
    //Joystick
    public static final int JOYSTICK_R_USB_NUMBER = 0;
    public static final int JOYSTICK_L_USB_NUMBER = 1;
    public static final Joystick DRIVER_JOYSTICK_R = new Joystick(JOYSTICK_R_USB_NUMBER);
    public static final Joystick DRIVER_JOYSTICK_L = new Joystick(JOYSTICK_L_USB_NUMBER);
    // Speed
    public static final double ARM_MOTOR_SPEED = 1; //chain motor lift speed is set to lift at half speed 50%
    public static final double ARM_MOTOR_SPEED_BACKWARDS = -1; //chain motor lift speed is set to lift at half speed 50%
    
   //Buttons
    
    public static final JoystickButton BUTTON_ARM_IN = new JoystickButton(DRIVER_JOYSTICK_L, 1);
    public static final JoystickButton BUTTON_ARM_OUT = new JoystickButton(DRIVER_JOYSTICK_L, 2);
    public static final JoystickButton BUTTON_ARM_MOTOR_SPIN_IN = new JoystickButton(DRIVER_JOYSTICK_L, 3);
    public static final JoystickButton BUTTON_ARM_MOTOR_SPIN_OUT = new JoystickButton(DRIVER_JOYSTICK_L, 4);
   
    
    
  
    
}