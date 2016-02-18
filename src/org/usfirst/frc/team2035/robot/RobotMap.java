/*----------------------------------------------------------------------------*/
/* Copyright (c) 2016 FIRST Team 2035. All Rights Reserved.                   */
/* Open Source Software - may be modified and shared by FRC teams.            */
/*----------------------------------------------------------------------------*/
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
	
	//public static final boolean SHOOTER_ON = true;
	//public static final boolean RETRACT_SHOOTER = true;
	
	
	/*
	 * Motor PWMs
	 */
    public static final int F_LEFT_MOTOR_PWM = 0; // Front Left drive motor is wired to PWM out 0
    public static final int B_LEFT_MOTOR_PWM = 1; // Rear Left drive motor is wired to PWM out 1
    public static final int F_RIGHT_MOTOR_PWM = 2; // Front Right drive motor is wired to PWM out 2
    public static final int B_RIGHT_MOTOR_PWM = 3; // Rear Right drive motor is wired to PWM out 3 
	public static final int HANGER_VICTOR_PWM = 7;
	public static final int BALL_ROLLER_PWM = 8;
	
	/*
	 * Joysticks
	 */
    public static final int JOYSTICK_A_USB_NUMBER = 0;
    public static final Joystick DRIVER_JOYSTICK_A = new Joystick(JOYSTICK_A_USB_NUMBER);
    public static final int JOYSTICK_B_USB_NUMBER = 1;
    public static final Joystick DRIVER_JOYSTICK_B = new Joystick(JOYSTICK_B_USB_NUMBER);
    
    //Joystick buttons
    public static final JoystickButton SHIFT_GEAR = new JoystickButton(DRIVER_JOYSTICK_A, 1);
    public static final JoystickButton SHOOTER_OUT = new JoystickButton(DRIVER_JOYSTICK_A, 6);
	public static final JoystickButton HANGER_EXTEND = new JoystickButton(DRIVER_JOYSTICK_A, 4);
	public static final JoystickButton HANGER_RESET = new JoystickButton(DRIVER_JOYSTICK_A, 5);
	public static final JoystickButton BUTTON_EXTRA_PUSH = new JoystickButton(DRIVER_JOYSTICK_B, 1);
	public static final JoystickButton SPIN_IN = new JoystickButton(DRIVER_JOYSTICK_B, 2);
	public static final JoystickButton SPIN_OUT = new JoystickButton(DRIVER_JOYSTICK_B, 3);
	//public static final JoystickButton SHOOTER_IN = new JoystickButton(STICK, 1);
	
	/*
	 * Solenoids
	 */
	public static final int PCM_ID = 0;
	//public static final int PCM2_ID = 1;
	
    public static final int DRIVE_TRAIN_AIR_IN = 0; //Drive Train High Gear Solenoid set to Relay cartridge 1
    public static final int DRIVE_TRAIN_AIR_OUT = 1; //Drive Train Low Gear Solenoid set to Relay cartridge 1
	public static final int ARM_FORWARD_PCM = 2;
	public static final int ARM_REVERSE_PCM = 3;
	public static final int SEESAW_FORWARD_PCM = 4;
	public static final int SEESAW_REVERSE_PCM = 5;
	public static final int SPIKE_PCM_FORWARD = 6;
	public static final int SPIKE_PCM_REVERSE = 7;
	
	//PUT BACK
	//public static final int SHOOTER_SHOOT = 2; //pcm id 2
	//public static final int SHOOTER_RETRACT = 3; //pcm id 2
	//PUT BACK
	
	
	//public static final int HANGER_SOLENOID_EXTEND = 1;
	//public static final int HANGER_SOLENOID_RETRACT = -1;
	
    /*
     * Camera
     */   
    public static final String CAM_ID = "cam0";
    public static int camCounter = 0;
    public static final int IMAGE_QUALITY = 100;
    public static final int SAVE_IMAGE_QUALITY = 100;
    public static final String IMAGE_PATH = "/images/test.jpg";
    public static final int DISTANCE_CHANNEL = 0;
    public static final int CAMERA_SESSION = NIVision.IMAQdxOpenCamera(CAM_ID, NIVision.IMAQdxCameraControlMode.CameraControlModeController); 
    //this may need to change to "cam1" depending if using test board or multiple cameras
    public static final Image FRAME = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_RGB, 0);
    
    
    /*
     * Speed
     */
	public static final double SPIKE_MOTOR_FORWARD = 0.3;
	public static final double SPIKE_MOTOR_REVERSE = -0.3;
	public static final double SPIKE_MOTOR_OFF = 0.0;
	public static final int HANGER_MOTOR_EXTEND = 1;
	public static final int HANGER_MOTOR_RETRACT = -1;
	public static final double BALL_ROLLER_FORWARD = 1.0;
	public static final double BALL_ROLLER_REVERSE = -1.0;
	public static final double BALL_ROLLER_OFF = 0.0;

}
