/*----------------------------------------------------------------------------*/
/* Copyright (c) 2016 FIRST Team 2035. All Rights Reserved.                   */
/* Open Source Software - may be modified and shared by FRC teams.            */
/*----------------------------------------------------------------------------*/
package org.usfirst.frc.team2035.robot.commands;

import org.usfirst.frc.team2035.robot.subsystems.DriveTrain;
import org.usfirst.frc.team2035.robot.OI;
import org.usfirst.frc.team2035.robot.Robot;

/**
 *
 * @author Team 2035
 */
public class ShiftLowGear extends CommandBase {


    private final DriveTrain train;
    public static OI oi; 

    public ShiftLowGear() {
    	super("StandardDrive");
    	train = Robot.getDriveTrain();
    	requires(train);
    	//System.out.println("LowButtonPressed");
    }
    
    protected void initialize() {
    	//System.out.println("LowButtonPressed");
    	oi = new OI();
    	train.shiftLowGear();
    }
    
    protected void execute() {
    	//System.out.println("LowButtonPressed");
    	//train.shiftLowGear();
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