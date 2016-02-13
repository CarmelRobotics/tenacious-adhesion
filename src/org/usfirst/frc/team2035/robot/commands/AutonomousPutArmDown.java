package org.usfirst.frc.team2035.robot.commands;

import org.usfirst.frc.team2035.robot.*;
import org.usfirst.frc.team2035.robot.subsystems.*;

import edu.wpi.first.wpilibj.Timer;

public class AutonomousPutArmDown extends CommandBase {
	
	private final DriveTrain DRIVE;
	private Timer autonomousTimer;
	public static OI oi;
	
	
	pubic AutonomousPutArmDown() {
		super("drive");
		
		DRIVE = Robot.getDriveTrain();
		
	}

}
