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
	    public static final int CRANE_OPEN_PCM = 0;
	    public static final int CRANE_GRAB_PCM= 1;
	    public static final int BOULDERGRABBER_SOLENOID_PCM_TL = 2;
	    public static final int BOULDERGRABBER_SOLENOID_PCM_TR = 3;
	    public static final int BOULDERGRABBER_SOLENOID_PCM_BL = 4;
	    public static final int BOULDERGRABBER_SOLENOID_PCM_BR = 5;
	    
	    public static final int CRANE_VICTOR_PCM = 6;
	    public static final int HANGER_VICTOR_PCM = 7;
	    public static final int BOULDERGRABBER_VICTOR_PCM = 8;
	    //public static final int HANGER_SOLENOID_EXTEND = 1;
	    //public static final int HANGER_SOLENOID_RETRACT = -1;
	    public static final int HANGER_MOTOR_EXTEND = 1;
	    public static final int HANGER_MOTOR_RETRACT = -1;
		public static final boolean SHOOTER_ON = true;
		public static final boolean RETRACT_SHOOTER = true;
		public static final boolean SPIKE_SOLENOID_EXTEND = true;
		public static final boolean SPIKE_SOLENOID_RETRACT = true;
		public static final int BOULDERGRABBER_MOTOR_ROLL = 1;
		
		
		public static final int JOYSTICK_USB_NUMBER0 = 0;
		public static final int JOYSTICK_USB_NUMBER1 = 1;
		public static final Joystick STICK0 = new Joystick(JOYSTICK_USB_NUMBER0);
		public static final Joystick STICK1 = new Joystick(JOYSTICK_USB_NUMBER1);
		public static final JoystickButton CRANE_ROTATE_CCW = new JoystickButton(STICK0, 0);
		public static final JoystickButton CRANE_ROTATE_CW = new JoystickButton(STICK0, 1);
		public static final JoystickButton CRANE_OPEN = new JoystickButton(STICK0, 2);
		public static final JoystickButton CRANE_GRAB = new JoystickButton(STICK0, 3);
		public static final JoystickButton HANGER_EXTEND = new JoystickButton(STICK0, 4);
		public static final JoystickButton HANGER_RESET = new JoystickButton(STICK0, 5);
		public static final JoystickButton SPIKE_UP = new JoystickButton(STICK0, 3);
		public static final JoystickButton SPIKE_DOWN = new JoystickButton(STICK0, 10);
		public static final JoystickButton SPIKE_ACTIVATE = new JoystickButton(STICK0, 11);
		
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
		public static final double SPIKE_MOTOR_OFF = 0.0;

		

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