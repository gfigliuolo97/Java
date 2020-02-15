
public class Esame {
	private int codiceEsame;
	private String nomeEsame;
	
	public Esame(int codice, String nome) {
		this.codiceEsame = codice;
		this.nomeEsame = nome;
	}
	
	public String toString() {
		return nomeEsame + "(" + codiceEsame + ")";
	}
	
	public int hashCode() {
		return new Integer(codiceEsame).hashCode();
	}
	
	public boolean equals(Esame e) {
		return (e.codiceEsame == this.codiceEsame);
	}
}
