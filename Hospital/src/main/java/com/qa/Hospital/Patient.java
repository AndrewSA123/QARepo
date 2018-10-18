package com.qa.Hospital;

public class Patient extends Person {

	int UID;
	String Name;
	String DoB;
	int wardNum;

	public Patient(String name, String dob, int ward) {
		this.Name = name;
		this.DoB = dob;
		this.wardNum = ward;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Name + " " + DoB + " " + wardNum;
	}

}
