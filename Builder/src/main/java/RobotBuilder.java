package main.java;

public interface RobotBuilder {

	public void buildRobotHead();
	
	public void buildRobotTorso();
	
	public void buildRobotArms();
	
	public void buildRobotLegs();

	public Robot getRobot();
}
