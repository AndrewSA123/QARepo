package com.qa.InfiniteTerrain;

import java.util.Random;

public class Shrek {

	int health;
	int xPOS;
	int yPOS;

	public Shrek(int health, int x, int y) {
		this.health = health;
		this.xPOS = x;
		this.yPOS = y;
	}

	public void moveShrek(Player a) {

		Random rand = new Random(101);
		int random = rand.nextInt();

		if (random >= 60 && random <= 70) {
			this.xPOS += 20;
		} else if (random >= 71 && random <= 80) {
			this.xPOS -= 20;
		} else if (random >= 81 && random <= 90) {
			this.yPOS += 20;
		} else if (random >= 91) {
			this.yPOS -= 20;
		} else {

		}

	}

}
