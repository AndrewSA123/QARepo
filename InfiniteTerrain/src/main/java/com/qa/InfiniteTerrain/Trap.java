package com.qa.InfiniteTerrain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Trap {

	int damage;
	int xPOS;
	int yPOS;
	Player a;
	Random rand = new Random();
	GameClass gameManager;
	List<Trap> trapList = new ArrayList<Trap>();


	public Trap(int x, int y, Player a, GameClass b) {
		this.damage = 20 * b.difficulty;
		this.xPOS = x;
		this.yPOS = y;
		this.a = a;
		this.gameManager = b;
	}

	public String update(Player a, GameClass b) {

		if (trapCheck(a, this.xPOS, this.yPOS)) {
			a.health -= 50;
			a.moveSpeed /= 2;
			System.out.println("health: " + a.health);
			return "You have been trapped!";
		}

		return "";
	}
	
	public List<Trap> placeTraps(GameClass a) {

		if (a.difficulty == 1) {
			for (int i = 0; i < 3; i++) {
				Trap t = new Trap(rand.nextInt(101), rand.nextInt(101), this.a, gameManager);
				trapList.add(t);
			}
		} else if (a.difficulty == 2) {
			for (int i = 0; i < 5; i++) {
				Trap t = new Trap(rand.nextInt(101), rand.nextInt(101), this.a, gameManager);
				trapList.add(t);
			}

		} else if (a.difficulty == 3) {
			for (int i = 0; i < 10; i++) {
				Trap t = new Trap(rand.nextInt(101), rand.nextInt(101), this.a, gameManager);
				trapList.add(t);
			}
		}

		return trapList;
	}

	public boolean trapCheck(Player a, int x, int y) {
		if (((a.xPOS >= x - 10 && a.xPOS <= x + 10) && (a.yPOS >= y - 10 && a.yPOS <= y + 10))) {
			return false;
		} else {
			return true;
		}

	}

}
