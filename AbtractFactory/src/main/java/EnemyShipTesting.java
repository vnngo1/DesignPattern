package main.java;

public class EnemyShipTesting {
	public static void main(String[] args) {
		EnemyShipBuilding MakeUFO = new UFOEnemyShipBuilding();
		EnemyShip theGrunt = MakeUFO.orderTheShip("UFO");
		System.out.println(theGrunt + "\n");
		EnemyShip theBoss = MakeUFO.orderTheShip("UFO Boss");
		System.out.println(theBoss + "\n");
	}
}
