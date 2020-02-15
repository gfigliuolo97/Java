import java.util.HashMap;

public class ArchivioStudenti {
	private HashMap<Studente, LibrettoEsami> archivio;
	
	public ArchivioStudenti() {
		archivio = new HashMap<Studente, LibrettoEsami>();
	}
	
	public void inserisci(Studente s, LibrettoEsami l) {
		archivio.put(s,l);
	}
	
	public LibrettoEsami ricerca(Studente s) {
		if(archivio.containsKey(s)) {
			return archivio.get(s);
		}else{
			return null;
		}
	}
	
	public String toString() {
		return archivio.toString();
	}
}
