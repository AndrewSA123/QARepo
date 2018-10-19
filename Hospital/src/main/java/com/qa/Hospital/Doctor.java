package com.qa.Hospital;

public class Doctor extends Employee {



	public Doctor(String name, String dob, int level) {

		super.Name = name;
		super.DoB = dob;
		switch (level) {
		case 1:
			super.positionLevel = Level.ONE;
		case 2:
			super.positionLevel = Level.TWO;
		case 3:
			super.positionLevel = Level.THREE;
		case 4:
			super.positionLevel = Level.FOUR;
		case 5:
			super.positionLevel = Level.FIVE;
		default:
			System.out.println("int invalid, position set to default");
			super.positionLevel = Level.ONE;

		}

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Name + " " + DoB + " " + positionLevel;
	}

	@Override
	public String promote() {

		switch (super.positionLevel) {
		case ONE:
			super.positionLevel = Level.TWO;
			return "Doctor promoted to level 2";
		case TWO:
			super.positionLevel = Level.THREE;
			return "Doctor promoted to level 3";
		case THREE:
			super.positionLevel = Level.FOUR;
			return "Doctor promoted to level 4";
		case FOUR:
			super.positionLevel = Level.FIVE;
			return "Doctor promoted to level 5";
		case FIVE:
			return "Doctor cannot be promoted any higher";
		}

		return "Error";
	}

	@Override
	public String Demote() {

		switch (super.positionLevel) {
		case ONE:
			return "Cannot demote any lower";
		case TWO:
			super.positionLevel = Level.ONE;
			return "Doctor demoted to level 1";
		case THREE:
			super.positionLevel = Level.TWO;
			return "Doctor demoted to level 2";
		case FOUR:
			super.positionLevel = Level.THREE;
			return "Doctor demoted to level 3";
		case FIVE:
			super.positionLevel = Level.FOUR;
			return "Doctor demoted to level 4";
		}

		return "Error";
	}

}
