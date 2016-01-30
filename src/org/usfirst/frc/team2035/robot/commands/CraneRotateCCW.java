package org.usfirst.frc.team2035.robot.commands;
import org.usfirst.frc.team2035.robot.subsystems.Crane;
import org.usfirst.frc.team2035.robot.Robot;

public class CraneRotateCCW extends CommandBase{
	private Crane crane;
	  public CraneRotateCCW() {
	      super();
	      crane = new Crane();
		  requires(Robot.exampleSubsystem);
	    }

	    // Called just before this Command runs the first time
	    protected void initialize() {
	    	crane.craneRotateCCW();
	    }

	    // Called repeatedly when this Command is scheduled to run
	    protected void execute() {
	    	crane.craneRotateCCW();
	    }

	    // Make this return true when this Command no longer needs to run execute()
	    protected boolean isFinished() {
	        return false;
	    }

	    // Called once after isFinished returns true
	    protected void end() {
	    }

	    // Called when another command which requires one or more of the same
	    // subsystems is scheduled to run
	    protected void interrupted() {
	    }
}
