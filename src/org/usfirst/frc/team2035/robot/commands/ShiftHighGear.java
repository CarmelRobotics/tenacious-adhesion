package org.usfirst.frc.team2035.robot.commands;

import org.usfirst.frc.team2035.robot.subsystems.DriveTrain;
import org.usfirst.frc.team2035.robot.OI;
import org.usfirst.frc.team2035.robot.Robot;

/**
 *
 * @author Team 2035
 */
public class ShiftHighGear extends CommandBase {


    private final DriveTrain train;
    public static OI oi;

    public ShiftHighGear() {
    	super("StandardDrive");
    	train = Robot.getDriveTrain();
    	requires(train);
    	//System.out.println("HighButtonPressed");
    }
    
    protected void initialize() {
       	//System.out.println("HighButtonPressed");
    	train.shiftHighGear();
    	oi = new OI();
    }
    
    protected void execute() {
       	//System.out.println("HighButtonPressed");
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