package com.qa.GarageExercise;

public class Car extends Vehicle {

	public int NumberOfDoors;
	public int NumberOfSeats;


	public Car(String Make, int Doors, int Seats, int Wheels, int Speed, int Stopping, String Colour) {

		this.NumberOfDoors = Doors;
		this.NumberOfSeats = Seats;
		super.Manufacturer = Make;
		super.NumberOfWheels = Wheels;
		super.StoppingDistance = Stopping;
		super.TopSpeed = Speed;
		super.Colour = Colour;
	}

	@Override
	public String drive() {


		return "This " + super.Colour + " car drives on " + super.NumberOfWheels + " wheels, with a top speed of: "
				+ super.TopSpeed + "MPH";
	}

	@Override
	public String stop() {

		return "Stops over " + super.StoppingDistance + " meters";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Car: " + NumberOfDoors + " Doors : " + NumberOfSeats + " Seats : " + Manufacturer + " Manufacturer : "
				+ super.Colour + " Colour";
	}



}
