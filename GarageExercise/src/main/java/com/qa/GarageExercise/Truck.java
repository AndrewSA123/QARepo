package com.qa.GarageExercise;

public class Truck extends Vehicle {

	public Truck(String Make, int Doors, int Seats, int Wheels, int Speed, int Stopping, String Colour) {

		super.Manufacturer = Make;
		super.NumberOfWheels = Wheels;
		super.StoppingDistance = Stopping;
		super.TopSpeed = Speed;
		super.Colour = Colour;
	}

	@Override
	public String drive() {
		// TODO Auto-generated method stub
		return "Drives on 10 wheels";
	}

	@Override
	public String stop() {
		// TODO Auto-generated method stub
		return "Stops very slowly";
	}



}
