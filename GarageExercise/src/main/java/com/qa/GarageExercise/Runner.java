package com.qa.GarageExercise;

public class Runner {

	public static void main(String[] args) {

		Garage TempGarage = new Garage();

		Car Prius = new Car("Prius", 4, 5, 4, 100, 20, "Red");
		Motorcycle Harley = new Motorcycle("Harley", 2, 150, 30, "Green");

		TempGarage.SetVehicle(Prius);
		TempGarage.SetVehicle(Harley);

		System.out.println(TempGarage.GetVehicle("Prius"));
		System.out.println(TempGarage.GetVehicle("Harley"));
		System.out.println(TempGarage.GetBill("Prius"));

	}

}
