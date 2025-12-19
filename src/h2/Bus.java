package h2;

import java.util.ArrayList;

public class Bus {
	ArrayList<Passenger> passengers = new ArrayList<>();
	
	public void enterBus(Passenger p) {
		passengers.add(p);
	}
	private void exitBus() {
		for (int i = passengers.size()-1; i>=0; i--) {
			Passenger p = passengers.get(i);
			if (p.visited == p.planned) {
				passengers.remove(i);
			}
		}
	}
	public void nextStop (Passenger[] boarding) {
		for (int i = passengers.size()-1; i>=0; i--) {
			Passenger p = passengers.get(i);
			p.visited++;
		}
		exitBus();
		for (Passenger p : boarding) {
		    passengers.add(p);
		}
	}
	 public void nextStop() {
	        for (Passenger p : passengers) {
	            p.visited++;
	        }
	        exitBus();
	    }

	    public ArrayList<Passenger> findPassengersWithoutTickets() {
	        ArrayList<Passenger> removed = new ArrayList<>();
	        for (int i = passengers.size() - 1; i >= 0; i--) {
	            Passenger p = passengers.get(i);
	            if (!p.ticket) {
	                removed.add(0, p); 
	                passengers.remove(i);
	            }
	        }
	        return removed;
	    }

	    public void transferPassengers(Bus otherBus, String[] passengerNames) {
	        for (int i = passengers.size() - 1; i >= 0; i--) {
	            Passenger p = passengers.get(i);
	            for (String name : passengerNames) {
	                if (p.name.equals(name)) {
	                    otherBus.enterBus(p);
	                    passengers.remove(i);
	                    break;
	                }
	            }
	      }
	  }
}
