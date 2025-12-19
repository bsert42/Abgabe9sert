package h1;

public class Patient {
	String name;
	int prio;
	
	public Patient (String name, int prio) {
		this.name = name;
		this.prio = prio;
	}
	 @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Patient other = (Patient) obj;
	        return name.equals(other.name) && prio == other.prio;
	 }
}
