/*----------------------------------------------------------------------------*/
/* Copyright (c) 2016 FIRST Team 2035. All Rights Reserved.                   */
/* Open Source Software - may be modified and shared by FRC teams.            */
/*----------------------------------------------------------------------------*/
package org.usfirst.frc.team2035.robot;

import edu.wpi.first.wpilibj.IterativeRobot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Compressor;
import org.usfirst.frc.team2035.robot.commands.*;
import org.usfirst.frc.team2035.robot.subsystems.*;
import org.usfirst.frc.team2035.robot.subsystems.ImageProcess;

import edu.wpi.first.wpilibj.Timer;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static OI oi;

	public static CompressorA compressor;
	public static DriveTrain driver;
	public static final ExampleSubsystem exampleSubsystem = new ExampleSubsystem();
	public static NewArm narm;
	private static Shooter shoot;
	public static SpikeODeath spike;
	public static Vision vision;
	public static ImageProcess process;
	public static ArduinoConnection arduino;

    Command autonomousCommand;
    SendableChooser chooser;
	
    
    public Robot()
    {
    	//driver = new DriveTrain(); //went here last year (may go in robot init)
    }

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */

    public void robotInit() {


		compressor = new CompressorA();
		driver = new DriveTrain();
		narm = new NewArm();
		shoot = new Shooter();
		spike = new SpikeODeath();
		vision = new Vision();
		process = new ImageProcess();
		process.initProcessImage();
        chooser = new SendableChooser();
        chooser.addDefault("Default Auto", new ExampleCommand());
//        chooser.addObject("My Auto", new MyAutoCommand());
        SmartDashboard.putData("Auto mode", chooser);
        driver.shiftHighGear();
        arduino = new ArduinoConnection();
        arduino.setPattern("4");
        

    }
    
	
	/**
     * This function is called once each time the robot enters Disabled mode.
     * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
     */
    public void disabledInit(){
    	//what does this do?
    	vision.end();
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select between different autonomous modes
	 * using the dashboard. The sendable chooser code works with the Java SmartDashboard. If you prefer the LabVIEW
	 * Dashboard, remove all of the chooser code and uncomment the getString code to get the auto name from the text box
	 * below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the chooser code above (like the commented example)
	 * or additional comparisons to the switch structure below with additional strings & commands.
	 */
    public void autonomousInit() {
        autonomousCommand = (Command) chooser.getSelected();
        
		/* String autoSelected = SmartDashboard.getString("Auto Selector", "Default");
		switch(autoSelected) {
		case "My Auto":
			autonomousCommand = new MyAutoCommand();
			break;
		case "Default Auto":
		default:
			autonomousCommand = new ExampleCommand();
			break;
		} */
    	
    	// schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
        System.out.println("Auton Loop is running");
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
        compressor.start();
        driver.shiftHighGear();
        vision.init();
        OI.initialize();
        
        
        //remember to shift to high or low gear here
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        compressor.start();
        vision.saveImage();
        process.processImage();
        
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
    
    /*
     * remember to put these in for all subsystems
     * 
     * public static DriveTrain getDriveTrain() {
     
    	return driver;
    	}
    */
    
    public static CompressorA getcompressor() {
    	return compressor;
    }
    public static DriveTrain getDriveTrain() {
    	return driver;
    }
    public static NewArm getNewArm() {
    	return narm;
    }
    public static Shooter getShooter() {
    	return shoot;
    }
    public static SpikeODeath getSpike() {
    	return spike;
    }
    public static Vision getVision() {
    	return vision;
    }
    public static ArduinoConnection getArduino() {
        return arduino;
    }

    
    
    
    
}

//dominic was here 
//theo was here
//fang was here
//jason was here
//abby was here