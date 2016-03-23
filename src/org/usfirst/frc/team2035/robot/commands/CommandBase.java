/*----------------------------------------------------------------------------*/
/* Copyright (c) 2016 FIRST Team 2035. All Rights Reserved.                   */
/* Open Source Software - may be modified and shared by FRC teams.            */
/*----------------------------------------------------------------------------*/
package org.usfirst.frc.team2035.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team2035.robot.OI;
import org.usfirst.frc.team2035.robot.subsystems.ExampleSubsystem;

/**
 * The base for all commands. All commands should be a child of CommandBase.
 * CommandBase stores and creates each control system.
 * @author Team 2035's idiots
 */
public abstract class CommandBase extends Command {

    /**
     *
     */
    public static OI oi;
    // Create a single static instance of all of your subsystems

    /**
     *
     */
    public static ExampleSubsystem exampleSubsystem = new ExampleSubsystem();

    /**
     *
     */
    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        
    	oi = new OI();
        // Show what command your subsystem is running on the SmartDashboard
        SmartDashboard.putData(exampleSubsystem);
    }

    /**
     *
     * @param name
     */
    public CommandBase(String name) {
        super(name);
        
    }

    /**
     *
     */
    public CommandBase() {
        super();
        
    }
}