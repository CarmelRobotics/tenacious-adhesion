package org.usfirst.frc.team2035.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
//import com.ni.vision.NIVision;
//import com.ni.vision.NIVision.Image;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
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
		 * Spike o Death
		 */
		public static final int PCM_ID = 1;
	    public static final int SPIKE_PCM_FORWARD = 6;
	    public static final int SPIKE_PCM_REVERSE = 5;
		public static final int CRANE_SOLENOID_VALUE = 1;
		public static final int CRANE_SOLENOID_VALUE_REVERSE= -1;
		public static final int CRANE_MOTOR_ROTATE_CW = 1;
		public static final int CRANE_MOTOR_ROTATE_CCW = -1;
		
		public static final double SPIKE_MOTOR_FORWARD = 0.3;
		public static final double SPIKE_MOTOR_REVERSE = -0.3;
		public static final int SPIKE_MOTOR_OFF = 0;

	    /*
	     * Joystick Buttons
	    */
	    public static final int JOYSTICK_R_USB_NUMBER = 0;
	    public static final int JOYSTICK_L_USB_NUMBER = 1;
	    public static final Joystick DRIVER_JOYSTICK_R = new Joystick(JOYSTICK_R_USB_NUMBER);
	    public static final Joystick DRIVER_JOYSTICK_L = new Joystick(JOYSTICK_L_USB_NUMBER);
	    
	    //Right Joystick Buttons
	    public static final JoystickButton BUTTON_SHIFT_GEAR = new JoystickButton(DRIVER_JOYSTICK_R, 1);
	    public static final JoystickButton BUTTON_FORKLIFT_DOWN = new JoystickButton(DRIVER_JOYSTICK_R, 2);
	    public static final JoystickButton BUTTON_FORKLIFT_UP = new JoystickButton(DRIVER_JOYSTICK_R, 3);
	    public static final JoystickButton BUTTON_FORKLIFT_BACK = new JoystickButton(DRIVER_JOYSTICK_R, 4);
	    public static final JoystickButton BUTTON_FORKLIFT_FORWARD = new JoystickButton(DRIVER_JOYSTICK_R, 5);
	    
	    //Left Joystick Buttons
	    public static final JoystickButton BUTTON_ROLLER_MOTOR_IN = new JoystickButton(DRIVER_JOYSTICK_L, 1);
	    public static final JoystickButton BUTTON_ROLLER_IN = new JoystickButton(DRIVER_JOYSTICK_L, 2);
	    public static final JoystickButton BUTTON_ROLLER_OUT = new JoystickButton(DRIVER_JOYSTICK_L, 3);
	    public static final JoystickButton BUTTON_ROLLER_SPIN_LEFT = new JoystickButton(DRIVER_JOYSTICK_L, 4);
	    public static final JoystickButton BUTTON_ROLLER_SPIN_RIGHT = new JoystickButton(DRIVER_JOYSTICK_L, 5);
	    public static final JoystickButton BUTTON_ROLLER_MOTOR_OUT = new JoystickButton(DRIVER_JOYSTICK_L, 6);
	    
	    //public static final JoystickButton BUTTON_ROLLER_IN = new JoystickButton(DRIVER_JOYSTICK, 7);
	    //public static final JoystickButton BUTTON_ROLLER_OUT = new JoystickButton(DRIVER_JOYSTICK, 6);
	    //public static final JoystickButton BUTTON_ROLLER_MOTOR_IN = new JoystickButton(DRIVER_JOYSTICK, 5);
	    //public static final JoystickButton BUTTON_ROLLER_MOTOR_OUT = new JoystickButton(DRIVER_JOYSTICK, 4);
	    //public static final JoystickButton BUTTON_FORKLIFT_UP = new JoystickButton(DRIVER_JOYSTICK, 3);
	    //public static final JoystickButton BUTTON_FORKLIFT_DOWN = new JoystickButton(DRIVER_JOYSTICK, 2);
	    //public static final JoystickButton BUTTON_SHIFT_GEAR = new JoystickButton(DRIVER_JOYSTICK, 1);
	    //public static final JoystickButton BUTTON_FORKLIFT_BACK = new JoystickButton(DRIVER_JOYSTICK, 8);
	    //public static final JoystickButton BUTTON_FORKLIFT_FORWARD = new JoystickButton(DRIVER_JOYSTICK, 9);
	    //public static final JoystickButton BUTTON_ROLLER_SPIN_RIGHT = new JoystickButton(DRIVER_JOYSTICK, 11);
	    //public static final JoystickButton BUTTON_ROLLER_SPIN_LEFT = new JoystickButton(DRIVER_JOYSTICK, 10);
}