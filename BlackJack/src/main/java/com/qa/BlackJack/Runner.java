package com.qa.BlackJack;

import java.util.Random;

public class Runner {

	public static void main(String[] args) {

		Random Rand = new Random();
		int a = Rand.nextInt(22);
		int b = Rand.nextInt(22);

		Runner NewRunner = new Runner();

		System.out.println(NewRunner.Play(a, b));

	}

	public int Play(int a, int b) {

		if (a > b || b > 21) {
			return a;
		} else if (a < b && b < 22) {
			return b;
		} else {
			return 0;
		}
	}
}
