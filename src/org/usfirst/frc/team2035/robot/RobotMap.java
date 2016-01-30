package org.usfirst.frc.team2035.robot;

import com.ni.vision.NIVision;
import com.ni.vision.NIVision.Image;
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
	 * Joystickss
	 */

	public static final int JOYSTICK_L_USB_NUMBER = 0;
	public static final int JOYSTICK_R_USB_NUMBER = 1;
	public static final Joystick JOYSTICK_L = new Joystick(JOYSTICK_L_USB_NUMBER);
	public static final Joystick JOYSTICK_R = new Joystick(JOYSTICK_R_USB_NUMBER);
	
	public static final JoystickButton BUTTON_EXTRA_PUSH = new JoystickButton(JOYSTICK_R, 1);

	
	
	/*
	 * Solenoids
	 */
	public static final int PCM_ID = 1;
	public static final int ARM_FORWARD_PCM = 2;
	public static final int ARM_REVERSE_PCM = 4; //CHANGE BACK
	public static final int SEESAW_FORWARD_PCM = 3;
	public static final int SEESAW_REVERSE_PCM = 5;
	public static final int L_ARM_AIR_IN_PCM = 0; // Left Roller Solenoid is wired to PCM 0
    public static final int L_ARM_AIR_OUT_PCM = 1; // Left Roller Solenoid is wired to PCM 0
    public static final int R_ARM_AIR_IN_PCM = 0; // Left Roller Solenoid is wired to PCM 0
    public static final int R_ARM_AIR_OUT_PCM = 1; // Left Roller Solenoid is wired to PCM 0
    /*
     * Camera
     */   
    public static final String CAM_ID = "cam1";
    public static int camCounter = 0;
    public static final int IMAGE_QUALITY = 100;
    public static final int SAVE_IMAGE_QUALITY = 100;
    public static final String IMAGE_PATH = "/images/test.jpg";
    public static final int DISTANCE_CHANNEL = 0;
    public static final int CAMERA_SESSION = NIVision.IMAQdxOpenCamera("cam0", NIVision.IMAQdxCameraControlMode.CameraControlModeController); 
    //this may need to change to "cam1" depending if using test board or multiple cameras
    public static final Image FRAME = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_RGB, 0);
    
    // Speed
    
    public static final double ARM_MOTOR_SPEED = .5; //chain motor lift speed is set to lift at half speed 50%
    public static final double ARM_MOTOR_SPEED_BACKWARDS = -1; //chain motor lift speed is set to lift at half speed 50%
    
   //hur dur

}

