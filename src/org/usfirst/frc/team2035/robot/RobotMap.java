package org.usfirst.frc.team2035.robot;
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
	
	//Motor PWMS

	public static final int F_LEFT_MOTOR_PWM = tbd; // Front Left drive motor is wired to PWM out 0
    public static final int B_LEFT_MOTOR_PWM = tbd; // Rear Left drive motor is wired to PWM out 1
    public static final int F_RIGHT_MOTOR_PWM = tbd; // Front Right drive motor is wired to PWM out 2
    public static final int B_RIGHT_MOTOR_PWM = tbd; // Rear Right drive motor is wired to PWM out 3 
    public static final int L_CHAIN_MOTOR_PWM = tbd; // Left chain motor is wired to PWM out 4
    public static final int R_CHAIN_MOTOR_PWM = tbd; // Right chain motor is wired to PWM out 5
    public static final int R_ROLLER_MOTOR_PWM = tbd; // Right roller motor is wired to PWM out 6
    public static final int L_ROLLER_MOTOR_PWM = tbd; // Left roller motor is wired to PWM out 7

    //Driver Joystick values
    public static final int JOYSTICK_R_USB_NUMBER = tbd;
    public static final int JOYSTICK_L_USB_NUMBER = tbd;
    public static final Joystick DRIVER_JOYSTICK_R = new Joystick(JOYSTICK_R_USB_NUMBER);
    public static final Joystick DRIVER_JOYSTICK_L = new Joystick(JOYSTICK_L_USB_NUMBER);

    //Solenoid PCM
    
  
    public static final int DRIVE_TRAIN_AIR_IN = tbd; //Drive Train High Gear Solenoid set to Relay cartridge 1
    public static final int DRIVE_TRAIN_AIR_OUT = tbd; //Drive Train Low Gear Solenoid set to Relay cartridge
    

    //Digital IO Numbering
    public static final int PCM_ID = 1;
    public static final int PCM2_ID = 2;

}		



