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
		return libretto.contains(es);
	}
	
	public String toString() {
		return libretto.toString();
	}
}
