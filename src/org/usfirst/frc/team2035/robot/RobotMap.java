package org.usfirst.frc.team2035.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

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
	//dontevenask
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
	
    // public static int rangefinderModule = 1;
	public static final int SHOOTER_AIR_IN_PCM = 2;
	public static final int SHOOTER_AIR_OUT_PCM = 3;
	public static final boolean SHOOTER_ON = true;
	public static final boolean RETRACT_SHOOTER = true;
	public static final double ROLLER_ON = 1;
	public static final double ROLLER_OFF = 0;
	
	public static final int JOYSTICK_USB_NUMBER = 0;

	public static final Joystick STICK = new Joystick(JOYSTICK_USB_NUMBER);
	public static final JoystickButton SHOOTER_OUT = new JoystickButton(STICK, 4);
	public static final JoystickButton SHOOTER_IN = new JoystickButton(STICK, 5);
	
	

	
}
