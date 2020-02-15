
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studente s1 = new Studente(001, "Serena", "DeRuvo");
		Studente s2 = new Studente(002, "Fabrizio", "Frasca");
		Studente s3 = new Studente(003, "Giovanni", "Figliuolo");
		
		Esame e1 = new Esame(123, "MAP");
		Esame e2 = new Esame(124, "ASD");
		Esame e3 = new Esame(125, "ING");
		
		LibrettoEsami libretto1 = new LibrettoEsami();
		libretto1.verbalizza(e1);
		libretto1.verbalizza(e2);
		libretto1.verbalizza(e2); //non viene fatto
		System.out.println(libretto1.toString());
		
		LibrettoEsami libretto2 = new LibrettoEsami();
		libretto2.verbalizza(e3);
		libretto2.verbalizza(e2);
		System.out.println(libretto2.toString());
		
		LibrettoEsami libretto3 = new LibrettoEsami();
		libretto3.verbalizza(e1);
		libretto3.verbalizza(e3);
		System.out.println(libretto3.toString());
		
		ArchivioStudenti a = new ArchivioStudenti();
		a.inserisci(s1, libretto1);
		a.inserisci(s2, libretto2);
		a.inserisci(s3, libretto3);		
		a.inserisci(s3, libretto1); // non viene inserito
		System.out.println("Archivio studenti:"+ a.toString());
		
		System.out.println("Libretto di "+s1.toString()+":");		
		System.out.println(a.ricerca(s1));
		
		System.out.println(libretto3.esameSostenuto(e2));
		
		
		
	}

}
