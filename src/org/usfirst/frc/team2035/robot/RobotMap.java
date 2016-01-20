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
	   public static final int CRANE_SOLENOID_VALUE = 1;
	   public static final int CRANE_SOLENOID_VALUE_REVERSE= -1;
	   public static final int CRANE_MOTOR_ROTATE_CW = 1;
	   public static final int CRANE_MOTOR_ROTATE_CCW = -1;
}