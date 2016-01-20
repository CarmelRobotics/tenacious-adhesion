package org.usfirst.frc.team2035.robot.commands;

import org.usfirst.frc.team2035.robot.subsystems.DriveTrain;
import org.usfirst.frc.team2035.robot.Robot;

/**
 *
 * @author Team 2035
 */
public class ShiftHighGear extends CommandBase {


    private final DriveTrain train;

    public ShiftHighGear() {
    	super("StandardDrive");
    	train = Robot.getDriveTrain();
    	requires(train);
    }
    
    protected void initialize() {
    	train.shiftHighGear();
    }
    
    protected void execute() {
    	train.shiftHighGear();
    }
    
    protected boolean isFinished() {
    	return false;
    }
    protected void end() {
    	train.shiftLowGear();
    }
    
    protected void interrupted() {
    	train.shiftLowGear();
    }

}