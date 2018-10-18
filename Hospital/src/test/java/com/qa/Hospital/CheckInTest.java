package com.qa.Hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CheckInTest {

	@Test
	public void checkIn() {
		Patient a = new Patient("Andrew", "30/05/96", 5);
		Doctor b = new Doctor("Joe", "999999", 10);
		Nurse c = new Nurse("Amir", "888888", 9);
		Teams team = new Teams("Surgery");
		Hospital hos = new Hospital();
		Records checkIns = new Records(a, "broken Knee", b);

		assertEquals("Patient checked in", hos.checkIn(checkIns));
		assertEquals("Team added", team.setTeam(b, c));

	}

}
