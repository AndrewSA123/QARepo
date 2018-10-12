package com.qa.InfiniteTerrain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoveTest {

	@Test
	public void MoveTesting() {
		Player player = new Player("Andrew", 100);
		Treasure Win = new Treasure(50, 60);
		GameClass a = new GameClass(100, 100, 100, 100, player, Win);

		assertEquals("You moved 10 meters south", a.move("south"));

	}

}
