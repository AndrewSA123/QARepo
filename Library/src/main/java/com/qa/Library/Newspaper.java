package com.qa.Library;

public class Newspaper extends Item {

	String headline;
	String publication;

	public Newspaper(int UID, String author, String Headline, String Publication, String PrintDate, int Price) {
		super.author = author;
		super.UID = UID;
		super.price = Price;
		super.printDate = PrintDate;
		this.headline = Headline;
		this.publication = Publication;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.headline + " published by: " + this.publication + " Starting at: " + super.price;
	}

}
