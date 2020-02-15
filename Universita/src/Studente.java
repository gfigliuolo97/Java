
public class Studente {
	private int matricola;
	private String nome;
	private String cognome;
	
	public Studente(int matricola, String nome, String cognome) {
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public String toString() {
		return nome + " " + cognome + " (Matri." + matricola + ")";
	}
	
	public int hashCode() {
		return new Integer(matricola).hashCode(); 
	}
	
	public boolean equals(Studente s) {
		return (s.matricola == this.matricola);
	}
}
