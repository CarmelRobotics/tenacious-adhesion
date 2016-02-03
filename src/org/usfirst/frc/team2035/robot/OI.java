package org.usfirst.frc.team2035.robot;
import org.usfirst.frc.team2035.robot.commands.*;
import edu.wpi.first.wpilibj.buttons.Button;
import org.usfirst.frc.team2035.robot.commands.ExampleCommand;

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
	// Programmers like butt-ons
	
	//another change made by abby on a different computer 
	
	//comment after merging into master
	private static Button craneRotateCCW;
	private static Button craneRotateCW;
	private static Button craneOpen;
	private static Button craneGrab;
	private static Button hangerExtend;
	private static Button spikeActive;
	private static Button spikeDeactivate;
	private static Button spikeExtend;
	private static Button spikeRelease;
	public static void initialize()
	{
		craneRotateCCW = RobotMap.CRANE_ROTATE_CCW;
		craneRotateCW = RobotMap.CRANE_ROTATE_CW;
		craneOpen = RobotMap.CRANE_OPEN;
		craneGrab = RobotMap.CRANE_GRAB;
		spikeActive = RobotMap.SPIKE_UP;
		spikeDeactivate = RobotMap.SPIKE_DOWN;
		spikeExtend = RobotMap.SPIKE_ACTIVATE;
		spikeRelease = RobotMap.SPIKE_DOWN;
		craneRotateCCW.whenPressed(new CraneRotateCCW());
		craneRotateCCW.whenReleased(new CraneMotorReset());
		craneRotateCW.whenPressed(new CraneRotateCW());
		craneRotateCW.whenReleased(new CraneMotorReset());
		craneOpen.whenPressed(new CraneOpen());
		craneGrab.whenPressed(new CraneGrab());
		spikeActive.whenPressed(new SpikeActivate());
		spikeDeactivate.whenPressed(new SpikeDown());
		spikeExtend.whenPressed(new SpikeUp());
		spikeExtend.whenReleased(new SpikeStop());
		spikeRelease.whenPressed(new SpikeDown());
		spikeRelease.whenReleased(new SpikeStop());
	}
}

