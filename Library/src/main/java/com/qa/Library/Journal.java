package com.qa.Library;

public class Journal extends Item {

	String title;
	String publisher;

	public Journal(int UID, String Title, String Pub, String author, int price, String PrintDate) {
		super.UID = UID;
		super.price = price;
		super.printDate = PrintDate;
		this.title = Title;
		this.publisher = Pub;
		super.author = author;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.title + " by: " + super.author + " starting at: " + this.publisher;
	}

}
