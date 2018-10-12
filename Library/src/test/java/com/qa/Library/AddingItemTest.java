package com.qa.Library;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddingItemTest {

	@Test
	public void AddTest() {
		Book a = new Book("Hello World", 1, "Andrew", "Today", "Me", 19);
		Library newLib = new Library();

		assertEquals("Item Added", newLib.setItem(a));

	}

	@Test
	public void RemmoveTest() {
		Book a = new Book("Hello World", 1, "Andrew", "Today", "Me", 19);
		Library newLib = new Library();

		newLib.setItem(a);

		assertEquals("Item Removed", newLib.removeItem("Andrew"));
	}

}
