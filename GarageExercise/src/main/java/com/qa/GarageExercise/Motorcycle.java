package com.qa.GarageExercise;

public class Motorcycle extends Vehicle {

	public Motorcycle(String Make, int Wheels, int Speed, int Stopping, String Colour) {
		super.Manufacturer = Make;
		super.TopSpeed = Speed;
		super.Colour = Colour;
		super.StoppingDistance = Stopping;
		super.NumberOfWheels = Wheels;
	}

	@Override
	public String drive() {
		// TODO Auto-generated method stub
		return "This " + super.Colour + " Motorcycle drives on " + super.NumberOfWheels
				+ " wheels, with a top speed of: " + super.TopSpeed + "MPH";
	}

	@Override
	public String stop() {
		// TODO Auto-generated method stub
		return "Stops over " + super.StoppingDistance + " meters";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This motorcycle is made by: " + Manufacturer + " Manufacturer in the colour: " + super.Colour
				+ " Colour";
	}


}
