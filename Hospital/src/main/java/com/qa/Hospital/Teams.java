package com.qa.Hospital;

public class Teams {

	private String deptName;

	public Teams(String a) {
		this.deptName = a;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The Super class containing the different teams:" + deptName;
	}

}

