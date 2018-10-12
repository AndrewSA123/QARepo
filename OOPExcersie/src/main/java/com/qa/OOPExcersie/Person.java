package com.qa.OOPExcersie;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String Name;
	private int Age;
	private String jobTitle;
	private List<String> container = new ArrayList<String>();
	private StringBuilder sb = new StringBuilder();

	public Person(String name, int age, String jobTitle) {
		this.Name = name;
		this.Age = age;
		this.jobTitle = jobTitle;
		this.container.add(this.Name);
		this.container.add(Integer.toString(this.Age));
		this.container.add(this.jobTitle);

	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hello " + this.Name + " you're a " + this.Age + " year old " + this.jobTitle;
	}

	public String returnName() {
		return this.Name;
	}

	public int returnAge() {
		return this.Age;
	}

	public String returnJob() {
		return this.jobTitle;
	}

	public void PrintList() {
		if (this.container.get(0) != null) {
			for (int i = 0; i < this.container.size(); i++) {
				System.out.println(this.container.get(i));
			}
		} else {
			System.out.println("Error");
		}
	}

}
