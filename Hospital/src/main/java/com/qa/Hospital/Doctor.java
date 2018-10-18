package com.qa.Hospital;

public class Doctor extends Employee {



	public Doctor(String name, String dob, int level) {

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
