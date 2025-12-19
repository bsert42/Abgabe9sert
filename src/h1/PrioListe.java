package h1;

import java.util.ArrayList;

public class PrioListe {

	ArrayList<Patient> myList = new ArrayList<>();

	public void addPatient (Patient p) {
		if (myList.isEmpty()) {
			myList.add(p);
			return;
		}
		boolean eingefuegt = false;
		for (int i=0; i<myList.size(); i++) {
			if (p.prio < myList.get(i).prio) {
			myList.add(i, p);
			eingefuegt = true;
			break;
			} 
		} if (eingefuegt == false) {
			myList.add(p);
		}
	}
	public Patient getNextPatient () {
		if (myList.isEmpty()) {
			return null;
		}
		Patient ersterPatient = myList.get(0);
		myList.remove(0);
		return ersterPatient;
	}
	public int getPosition (Patient P) {
		for (int i=0; i<myList.size(); i++) {
			if (myList.get(i).equals(P)) {
				return i;
			} 
		} 	return -1;
	}
}
