package com.qa.Hospital;

public class Runner {

	public static void main(String[] args) {

		Patient a = new Patient("Andrew", "30/05/96", 5);
		Doctor b = new Doctor("Joe", "999999", 10);
		Nurse c = new Nurse("Amir", "888888", 9);
		Teams team = new Teams("Surgery");
		Hospital hos = new Hospital();
		Records checkIns = new Records(a, "broken Knee", b);

		hos.setDoctor(b);
		hos.setNurse(c);
		team.setTeam(b, c);
		hos.checkIn(checkIns);
		hos.saveToFile(team);

	}

}
