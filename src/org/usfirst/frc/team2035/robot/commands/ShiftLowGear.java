package org.usfirst.frc.team2035.robot.commands;

import org.usfirst.frc.team2035.robot.subsystems.DriveTrain;
import org.usfirst.frc.team2035.robot.Robot;

/**
 *
 * @author Team 2035
 */
public class ShiftLowGear extends CommandBase {


    private final DriveTrain train;

    public ShiftLowGear() {
    	super("StandardDrive");
    	train = Robot.getDriveTrain();
    	requires(train);
    	System.out.println("LowButtonPressed");
    }
    
    protected void initialize() {
    	System.out.println("LowButtonPressed");
    	train.shiftLowGear();
    }
    
    protected void execute() {
    	System.out.println("LowButtonPressed");
    	train.shiftLowGear();
    }
    
    protected boolean isFinished() {
    	return true;
    }
    protected void end() {
    	train.shiftHighGear();
    }
    
    protected void interrupted() {
    	train.shiftHighGear();
    }

}