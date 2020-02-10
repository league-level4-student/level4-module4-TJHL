package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	
	private ArrayList<Doctor> doc = new ArrayList<Doctor>();
	private ArrayList<Patient> gib = new ArrayList<Patient>();
	
	public void addDoctor(Doctor a) {
		doc.add(a);
	}
	
	public ArrayList<Doctor> getDoctors(){
		return doc;
	}
	
	public void addPatient(Patient egone) {
		gib.add(egone);
	}
	
	public ArrayList<Patient> getPatients(){
		return gib;
	}
	
	public void assignPatientsToDoctors() {
		int docCount = 0;
		for (int i = 0; i < gib.size(); i++) {
			try {
				doc.get(docCount).assignPatient(gib.get(i));
			}catch (DoctorFullException e) {
				docCount++;
				i--;
			}

		}
	}
}