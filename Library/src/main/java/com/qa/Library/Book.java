package com.qa.Library;

public class Book extends Item {

	String publisher;
	String title;

	public Book(String Title, int UID, String author, String PrintDate, String Pub, int Price) {
		super.UID = UID;
		super.price = Price;
		super.author = author;
		super.printDate = PrintDate;
		this.publisher = Pub;
		this.title = Title;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.title + " by: " + super.author + " Starting at: " + super.price;
	}

}
