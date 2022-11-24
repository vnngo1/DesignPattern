package main.java;

public class OldRobotBuilder implements RobotBuilder{
	
	private Robot robot;
	
	public OldRobotBuilder() {
		this.robot = new Robot();
	}

	@Override
	public void buildRobotHead() {
		// TODO Auto-generated method stub
		robot.setRobotHead("Tin Head");
	}

	@Override
	public void buildRobotTorso() {
		// TODO Auto-generated method stub
		robot.setRobotTorso("Tin Torso");
	}

	@Override
	public void buildRobotArms() {
		// TODO Auto-generated method stub
		robot.setRobotArms("Big Arms");
	}

	@Override
	public void buildRobotLegs() {
		// TODO Auto-generated method stub
		robot.setRobotLegs("Roller Legs");
	}
	
	public Robot getRobot() {
		return this.robot;
	}
}
