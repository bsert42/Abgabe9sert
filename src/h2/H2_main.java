package h2;

public class H2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Bus busA = new Bus();
		        Bus busB = new Bus();

		        Passenger anna = new Passenger("Anna", 2, true);
		        Passenger ben = new Passenger("Ben", 3, false);
		        Passenger clara = new Passenger("Clara", 1, true);

		        busA.enterBus(anna);
		        busA.enterBus(ben);
		        busA.enterBus(clara);

		     
		        busA.nextStop();

		 
		        System.out.println("Passagiere ohne Ticket: " + busA.findPassengersWithoutTickets().size()); 

		    
		        busA.transferPassengers(busB, new String[]{"Anna","Clara"});
		        System.out.println("Bus A Passagiere: " + busA.passengers.size()); 
		        System.out.println("Bus B Passagiere: " + busB.passengers.size()); 
	}

}
