/*----------------------------------------------------------------------------*/
/* Copyright (c) 2016 FIRST Team 2035. All Rights Reserved.                   */
/* Open Source Software - may be modified and shared by FRC teams.            */
/*----------------------------------------------------------------------------*/
package org.usfirst.frc.team2035.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import org.usfirst.frc.team2035.robot.RobotMap;

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
	private static Button armIn;
	private static Button armOut;
	private static Button spinIn;
	private static Button spinOut;
	private static Button shooterIn;
	private static Button shooterOut;;
	private static Button hangerExtend;
	private static Button extraPush;
	
	//put your "private static Button rollerIn" here
	
	public static void initialize()
	{

		/*
		 * Initializes buttons
		 */

		shiftGear = RobotMap.SHIFT_GEAR;
		//shooterIn = RobotMap.SHOOTER_IN;
		shooterOut = RobotMap.SHOOTER_OUT;
		hangerExtend = RobotMap.HANGER_EXTEND;
		extraPush = RobotMap.BUTTON_EXTRA_PUSH;
		spinIn = RobotMap.SPIN_IN;
		spinOut = RobotMap.SPIN_OUT;
		
		
	/*
     * All button functions
	 */
		
		
		shiftGear.whileHeld(new ShiftLowGear());
		extraPush.whenPressed(new ExtraPush());
		shooterOut.whenPressed(new LaunchShooter());
		spinIn.whileHeld(new BallIn());
		spinOut.whileHeld(new BallOut());


	}
	
	}

