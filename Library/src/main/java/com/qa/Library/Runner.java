package com.qa.Library;

public class Runner {

	public static void main(String[] args) {

		Book a = new Book("hello world", 1, "Andrew", "Today", "Me", 19);
		Book b = new Book("New Book", 2, "Malcolm", "Today", "You", 20);
		Library newLibrary = new Library();

		newLibrary.setItem(a);
		newLibrary.setItem(b);


	}

}
