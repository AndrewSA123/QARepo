package com.qa.Library;

public abstract class Item {

	int UID;
	int price;
	String printDate;
	String author;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is the Item super class for the items";
	}

}
