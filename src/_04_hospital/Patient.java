package _04_hospital;

public class Patient {
	
	private boolean notDying = false;

	public boolean feelsCaredFor(){
		return notDying;
	}
	public void checkPulse() {
		notDying = true;
	}
}
