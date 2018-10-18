package com.qa.InfiniteTerrain;

public class Trap {

	int damage;
	int xPOS;
	int yPOS;

	public Trap(int d, int x, int y) {
		this.damage = d;
		this.xPOS = x;
		this.yPOS = y;
	}

	public boolean trapCheck(Player a, int x, int y) {
		if (((a.xPOS >= x - 10 && a.xPOS <= x + 10) && (a.yPOS >= y - 10 && a.yPOS <= y + 10))) {
			return false;
		} else {
			return true;
		}

	}

}
