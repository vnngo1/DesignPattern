package main.java;

public abstract class EnemyShip {
	private String name;
	ESWeapon weapon;
	ESEngine engine;
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	abstract void makeShip();
	public String toSTring() {
	String infoOnShip = "The " + name + " has a spped of " + engine + " and an attack power of " + weapon;
	return infoOnShip;
	}
}
