package com.qa.Hospital;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hospital {

	private List<Doctor> doctorList = new ArrayList<Doctor>();
	private List<Patient> patientList = new ArrayList<Patient>();
	private List<Nurse> nurseList = new ArrayList<Nurse>();
	private List<Records> recordList = new ArrayList<Records>();

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

	public List<Patient> getPatient(int a) {
		if (nurseList.size() > 0) {
			List<Patient> tempList = patientList.stream().filter(p -> p.UID == a).collect(Collectors.toList());
			return tempList;
		}
		System.out.println("An error occurred");
		return null;
	}

	public List<Patient> getPatient(String a) {
		if (nurseList.size() > 0) {
			List<Patient> tempList = patientList.stream().filter(p -> p.Name.equals(a)).collect(Collectors.toList());
			return tempList;
		}
		System.out.println("An error occurred");
		return null;
	}

	public String checkIn(Records a) {
		a.UID = recordList.size();
		recordList.add(a);
		return "Patient checked in";
	}

	public String checkOut(String name) {
		List<Records> tempList = recordList.stream().filter(p -> p.patientName.Name.equals(name))
				.collect(Collectors.toList());
		recordList.removeAll(tempList);
		return "Patient checked out";
	}

	public String saveToFile(Teams a) {

		Path file = Paths.get("Records.txt");
		File filePath = new File(file.toString());
		List<String> FileList = new ArrayList<String>();


		for (int i = 0; i < doctorList.size(); i++) {
			FileList.add(doctorList.get(i).toString());
		}

		for (int i = 0; i < nurseList.size(); i++) {
			FileList.add(nurseList.get(i).toString());
		}

		for (int i = 0; i < patientList.size(); i++) {
			FileList.add(patientList.get(i).toString());
		}
		for (int i = 0; i < recordList.size(); i++) {
			FileList.add(recordList.get(i).toString());
		}

		FileList.add(a.toString());
		try {
			Files.write(file, FileList, Charset.forName("UTF-8"));
			System.out.println(filePath.getAbsolutePath());
		} catch (Exception x) {
			System.out.println(x);
		}

		return "saved too: " + file.toString();
	}

}
