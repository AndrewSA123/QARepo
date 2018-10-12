package com.qa.OOPExcersie;

public class Delegate {

	private String Name;
	private int UID;
	private int teckSkills;
	private int softSkills;
	private String contactInfo;

	public Delegate(String Name) {
		this.Name = Name;
	}

	public void remove() {
		System.out.println("Delegate Removed");
	}

	public void changeStream() {
		System.out.println("Delegate Changed Stream");
	}

	public void setName(String nameString) {
		this.Name = nameString;
	}

	public String getName() {
		if (this.Name != null) {
			return this.Name;
		} else {
			return "Has no name";
		}
	}
}
