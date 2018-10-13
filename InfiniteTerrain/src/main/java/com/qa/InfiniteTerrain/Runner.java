package com.qa.InfiniteTerrain;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Player a = new Player("Andrew", 10);
		Treasure Win = new Treasure(50, 60);
		Scanner sc = new Scanner(System.in);
		GameClass gameManager = new GameClass(1000, -1000, 1000, -1000, a, Win);
		Shrek shrek = new Shrek(100, 0, 0, a);
		String command;

		gameManager.intro(a, sc);

		while (gameManager.checkPOS(a, Win) == false) {
			command = sc.nextLine();
			System.out.println(gameManager.move(command));
			shrek.moveShrek(a);
			if (gameManager.checkPOS(a, Win)) {
				System.out.println("Your found the treasure!");
				System.exit(1);
			}

		}

	}

}
