package com.qa.Hospital;

import java.util.ArrayList;
import java.util.List;

public class Teams {

	private String deptName;
	List<Employee> teamList = new ArrayList<Employee>();

	public Teams(String a) {
		this.deptName = a;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The Super class containing the different teams:" + deptName;
	}

	public String setTeam(Doctor a, Nurse b) {

		teamList.add(a);
		teamList.add(b);
		return "Team added";
	}

	public String printTeams() {
		if (teamList.size() > 0) {
			teamList.stream().forEach(System.out::println);
			return "Printing List";
		}
		return "Printing error";
	}

}

