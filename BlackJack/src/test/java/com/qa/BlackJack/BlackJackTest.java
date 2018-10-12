package com.qa.BlackJack;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BlackJackTest {

	@Test
	public void PlayTest() {
		Runner newRunner = new Runner();
		assertEquals(21, newRunner.Play(10, 21));
		assertEquals(9, newRunner.Play(9, 5));
		assertEquals(11, newRunner.Play(11, 3));
		assertEquals(5, newRunner.Play(5, 2));
		assertEquals(0, newRunner.Play(10, 10));
		assertEquals(21, newRunner.Play(10, 21));

	}


}
