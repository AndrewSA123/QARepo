package com.qa.Library;

public class Runner {

	public static void main(String[] args) {

		Book a = new Book("hello world", 1, "Andrew", "Today", "Me", 19);
		Book b = new Book("New Book", 2, "Malcolm", "Today", "You", 20);
		People c = new People(1, "Andrew", "30/05/1996", "07783791220");
		People d = new People(2, "Ben", "30/05/1996", "07783791220");
		Library newLibrary = new Library();

		newLibrary.setItem(a);
		newLibrary.setItem(b);
		newLibrary.setPerson(c);
		newLibrary.setPerson(d);
		newLibrary.printPeople();
		newLibrary.removePerson("Andrew");
		newLibrary.printPeople();


	}

}
