package com.qa.InfiniteTerrain;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Player a = new Player("Andrew", 100);
		Treasure Win = new Treasure(50, 60);
		Scanner sc = new Scanner(System.in);
		GameClass gameManager = new GameClass(100, -100, 100, -100, a, Win);
		Trap trap = new Trap(0, 0, a, gameManager);
		Shrek shrek = new Shrek(100, 0, a.yPOS + 30, a, gameManager);
		String command;

		gameManager.intro(a, sc, trap, gameManager);

		while (gameManager.checkPOS(a, Win) == false) {
			shrek.moveShrek(a);
			System.out.println(trap.update(a, gameManager));
			command = sc.nextLine();
			System.out.println(gameManager.move(command));
			if (gameManager.checkPOS(a, Win)) {
				System.out.println("Your found the treasure!");
				System.exit(1);
			}

		}

	}

}
