package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	
	boolean isSurgeon = false;
	boolean isGP = false;
	
	private ArrayList<Patient> docsPatients = new ArrayList<Patient>();
	
	public void assignPatient(Patient corpse) throws DoctorFullException {
		if(docsPatients.size()>2) {
			throw new DoctorFullException();
		}
		else {
			docsPatients.add(corpse);
		}
	}
	
	public ArrayList<Patient> getPatients(){
		return docsPatients;
	}
	
	public void doMedicine() {
		for (int i = 0; i < docsPatients.size(); i++) {
			docsPatients.get(i).checkPulse();
		}
	}

	public boolean performsSurgery() {
		return isSurgeon;
	}
	
	public boolean makesHouseCalls() {
		return isGP;
	}
	
}