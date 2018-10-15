package com.qa.Hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hospital {

	private List<Doctor> doctorList = new ArrayList<Doctor>();
	private List<Patient> patientList = new ArrayList<Patient>();
	private List<Nurse> nurseList = new ArrayList<Nurse>();

	public Hospital() {

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The Controller class for all the methods";
	}

	public String setDoctor(Doctor a) {
		a.UID = doctorList.size();
		doctorList.add(a);
		return "New doctor added";
	}

	public String setNurse(Nurse a) {
		a.UID = nurseList.size();
		nurseList.add(a);
		return "New Nurse added";
	}

	public String setPatient(Patient a) {
		a.UID = patientList.size();
		patientList.add(a);
		return "New patient added";
	}

	public String printDoctors() {
		if (doctorList.size() > 0) {
			doctorList.stream().forEach(System.out::println);
			return "Printing doctor list";
		}
		return "Error while printing";
	}

	public String printNurse() {
		if (nurseList.size() > 0) {
			nurseList.stream().forEach(System.out::println);
			return "Printing nurse list";
		}
		return "Error while printing";
	}

	public String printPatient() {
		if (patientList.size() > 0) {
			patientList.stream().forEach(System.out::println);
			return "Printing patients";
		}
		return "Error while printing";
	}

	public List<Doctor> getDoctor(String a) {
		if (doctorList.size() > 0) {
			List<Doctor> tempList = doctorList.stream().filter(p -> p.Name.equals(a)).collect(Collectors.toList());
			return tempList;
		}
		System.out.println("An error occurred");
		return null;
	}

	public List<Doctor> getDoctor(int a) {
		if (doctorList.size() > 0) {
			List<Doctor> tempList = doctorList.stream().filter(p -> p.UID == a).collect(Collectors.toList());
			return tempList;
		}
		System.out.println("An error occurred");
		return null;
	}

	public List<Nurse> getNurse(String a) {
		if (nurseList.size() > 0) {
			List<Nurse> tempList = nurseList.stream().filter(p -> p.Name.equals(a)).collect(Collectors.toList());
			return tempList;
		}
		System.out.println("An error occurred");
		return null;
	}

	public List<Nurse> getNurse(int a) {
		if (nurseList.size() > 0) {
			List<Nurse> tempList = nurseList.stream().filter(p -> p.UID == a).collect(Collectors.toList());
			return tempList;
		}
		System.out.println("An error occurred");
		return null;
	}

}