package com.qa.InfiniteTerrain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoveTest {

	@Test
	public void MoveTesting() {
		Player player = new Player("Andrew", 10);
		Treasure Win = new Treasure(0, 100);
		GameClass a = new GameClass(200, -100, 100, -100, player, Win);




		System.out.println(player.xPOS);
		System.out.println(player.yPOS);
		System.out.println(Win.xPOS);
		System.out.println(Win.yPOS);
		System.out.println(a.checkPOS(player, Win));
		assertEquals("You found the treasure!", a.move("north"));

	}

}
