package com.qa.InfiniteTerrain;

import java.util.Random;

public class Shrek {

	int health;
	int xPOS;
	int yPOS;
	Player gamePlayer;
	GameClass game;

	public Shrek(int health, int x, int y, Player a, GameClass b) {
		this.health = health;
		this.xPOS = x;
		this.yPOS = y;
		this.gamePlayer = a;
		this.game = b;

	}

	public void moveShrek(Player a) {

		Random rand = new Random(101);
		int random = rand.nextInt();

		if (shrekCheck(gamePlayer, this.xPOS, this.yPOS)) {
			if (random >= 60 && random <= 70) {
				this.xPOS += 20 * this.game.difficulty;
			} else if (random >= 71 && random <= 80) {
				this.xPOS -= 20 * this.game.difficulty;
			} else if (random >= 81 && random <= 90) {
				this.yPOS += 20 * this.game.difficulty;
			} else if (random >= 91) {
				this.yPOS -= 20 * this.game.difficulty;
			} else {

			}
		} else {
			if (a.health > 50) {
				a.health -= 20 * this.game.difficulty;
				a.yPOS += 20;
				System.out.println("What are you doing in my swamp! \n" + "Shrek hits you with a glancing blow"
						+ "\nHealth: " + a.health + "\nyou ran 20 meters north");

			} else {

				System.out.println("Shrek rips your flash from your bones, you died, obviously.");
				System.exit(1);
			}

		}


	}

	public boolean shrekCheck(Player a, int x, int y) {
		if (((a.xPOS >= x - 10 && a.xPOS <= x + 10) && (a.yPOS >= y - 10 && a.yPOS <= y + 10))) {
			return false;
		} else {
			return true;
		}

	}

}
