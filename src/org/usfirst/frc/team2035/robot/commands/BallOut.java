package org.usfirst.frc.team2035.robot.commands;
import org.usfirst.frc.team2035.robot.subsystems.NewArm;
import org.usfirst.frc.team2035.robot.Robot;

public class BallOut extends CommandBase {
	
	private NewArm arm;
	
	public BallOut() {
        super("Ball Out");
        arm = Robot.getNewArm();
        requires(arm);
    }

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		arm.ballRollersReverse();
		
		
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		arm.ballRollersOff();
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
