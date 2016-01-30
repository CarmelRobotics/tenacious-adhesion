package org.usfirst.frc.team2035.robot;

import edu.wpi.first.wpilibj.buttons.Button;

import org.usfirst.frc.team2035.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team2035.robot.commands.ExampleCommand;

import org.usfirst.frc.team2035.robot.subsystems.*;
import org.usfirst.frc.team2035.robot.commands.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	//
	//
	//another change made by abby on a different computer 

	//comment after merging into master

	private static Button shiftGear;
	private static Button ArmIn;
	private static Button ArmOut;
	private static Button SpinIn;
	private static Button SpinOut;

	
	
	

	public static void initialize()
	{
		
	
		 /*
	     * All button functions
	     */
	   
		
	/*
	 * Initialize buttons
	 */
		
	// ex: rollerIn = RobotMap.BUTTON_ROLLER_OUT;
		
		shiftGear = RobotMap.BUTTON_SHIFT_GEAR;
		ArmIn = RobotMap.BUTTON_ARM_IN;
		ArmOut = RobotMap.BUTTON_ARM_OUT;
		SpinIn = RobotMap.BUTTON_ARM_MOTOR_SPIN_IN;
		SpinOut = RobotMap.BUTTON_ARM_MOTOR_SPIN_OUT;
	/*
     * All button functions
	 */
		
	// ex: rollerIn.whenPressed(new RollerIn());
		
		shiftGear.whileHeld(new ShiftLowGear());
		ArmIn.whenPressed(new ArmIn());
	    ArmOut.whenPressed(new ArmOut());
		SpinIn.whileHeld(new SpinIn());
		SpinOut.whileHeld(new SpinOut());

	}
	
	}


	
	
	


