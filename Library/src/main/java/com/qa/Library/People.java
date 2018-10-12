package com.qa.Library;

public class People {

	String name;
	String DoB;
	String contactNumber;
	int UID;

	public People(int UID, String Name, String Dob, String ContactNumber) {
		this.name = Name;
		this.contactNumber = ContactNumber;
		this.DoB = Dob;
		this.UID = UID;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + "\n" + this.contactNumber + "\n" + this.DoB;
	}

}
