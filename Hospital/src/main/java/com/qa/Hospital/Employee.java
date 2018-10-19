package com.qa.Hospital;

public abstract class Employee extends Person implements Promotable, Demotable {

	int UID;
	String Name;
	String DoB;
	String Team;
	Level positionLevel;


}
