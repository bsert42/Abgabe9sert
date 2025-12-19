          package h1;

public class H1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PrioListe liste = new PrioListe();

	        Patient p1 = new Patient("Anna", 1);
	        Patient p2 = new Patient("Ben", 10);
	        Patient p3 = new Patient("Clara", 5);
	        Patient p4 = new Patient("Dora", 7);

	        liste.addPatient(p1);
	        liste.addPatient(p2);
	        liste.addPatient(p3);
	        liste.addPatient(p4);

	        System.out.println("Position von Dora: " + liste.getPosition(p4)); 
	        Patient next = liste.getNextPatient();
	        System.out.println("Nächster Patient: " + next.name);
	}

}
