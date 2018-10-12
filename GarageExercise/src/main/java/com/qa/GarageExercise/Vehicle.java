package com.qa.GarageExercise;

public abstract class Vehicle {

	public int NumberOfWheels;
	public int TopSpeed;
	public int StoppingDistance;
	public String Colour;
	public String Manufacturer;

	public abstract String drive();

	public abstract String stop();

}
