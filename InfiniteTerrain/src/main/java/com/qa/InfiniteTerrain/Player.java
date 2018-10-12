package com.qa.InfiniteTerrain;

public class Player {

	String name;
	int health;

	int yPOS;
	int xPOS;

	public Player(String name, int health) {
		this.name = name;
		this.health = health;
		this.yPOS = 0;
		this.xPOS = 0;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The players name is: " + this.name;
	}

}
