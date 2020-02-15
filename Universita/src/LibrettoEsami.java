import java.util.HashSet;

public class LibrettoEsami {
	private HashSet<Esame> libretto;
	
	public LibrettoEsami() {
		libretto = new HashSet<Esame>();
	}
	
	public void verbalizza(Esame es) {
		libretto.add(es);
	}
	
	public boolean esameSostenuto(Esame es) {
		if(libretto.contains(es)) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		return libretto.toString();
	}
}
