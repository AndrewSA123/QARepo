package com.qa.Hospital;

public class Nurse extends Employee {

	public Nurse(String name, String dob, int level) {

		super.Name = name;
		super.DoB = dob;
		super.positionLevel = level;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Name + " " + DoB + " " + positionLevel;
	}


}
