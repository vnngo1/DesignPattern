package main.java;

public abstract class EnemyShipBuilding {
	protected abstract EnemyShip makeEnemyShip(String typeOfShip);
	
	public EnemyShip orderTheShip(String typeOfShip) {
		EnemyShip theEnemyShip = makeEnemyShip(typeOfShip);
		theEnemyShip.makeShip();
		//theEnemyShip.displayEnemyShip();
		//theEnemyship.followHeroShip();
		return theEnemyShip;
	}

}
