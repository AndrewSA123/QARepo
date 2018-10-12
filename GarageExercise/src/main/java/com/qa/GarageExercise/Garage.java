package com.qa.GarageExercise;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> PrivateList = new ArrayList<Vehicle>();

	public void SetVehicle(Vehicle a) {
		PrivateList.add(a);
	}

	public Vehicle GetVehicle(String Name) {
		if (PrivateList.size() > 0) {
			for (int i = 0; i < PrivateList.size(); i++) {
				if (PrivateList.get(i).Manufacturer == Name) {
					return PrivateList.get(i);
				}
			}
		}

		return null;
	}

	public String GetBill(String Name) {
		if (PrivateList.size() > 0) {
			for (int i = 0; i < PrivateList.size(); i++) {
				if (PrivateList.get(i).Manufacturer == Name && PrivateList.get(i).Colour == "Red") {
					return "Your bill is £300pcm";
				}
			}
		}

		return "Your bill is too damn high";
	}

	public void removeVehicle(String name) {
		if (PrivateList.size() > 0) {
			for (int i = 0; i < PrivateList.size(); i++) {
				if (PrivateList.get(i).Manufacturer == name) {
					PrivateList.remove(i);
				}
			}
		}
	}

	public void EmptyList() {
		PrivateList.removeAll(PrivateList);
	}

}
