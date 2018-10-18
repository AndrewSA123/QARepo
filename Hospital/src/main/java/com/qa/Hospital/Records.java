package com.qa.Hospital;

public class Records {

	int UID;
	Patient patientName;
	String injury;
	Doctor doctorName;

	public Records(Patient patientName, String injury, Doctor docName) {
		this.doctorName = docName;
		this.patientName = patientName;
		this.injury = injury;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Patient: " + patientName + ". Injury: " + injury + ". Doctor: " + doctorName;
	}

}
