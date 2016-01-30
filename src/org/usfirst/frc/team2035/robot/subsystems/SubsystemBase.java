package org.usfirst.frc.team2035.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

public abstract class SubsystemBase extends Subsystem {
	
	//abby wuz here
	
	private String name;
	
	public SubsystemBase()
	{
		super();
		name = "";
	}
	
	public SubsystemBase(String n)
	{
		super();
		name = n;
	}
	
	public abstract void init();

	
	public abstract void end();


}