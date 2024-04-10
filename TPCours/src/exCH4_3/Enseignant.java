package exCH4_3;

public abstract class Enseignant {
	private String nom;
	
	public Enseignant(String nom) {
		this.nom = nom;
	}

	public abstract double salaire();
	
	public String toString() {
		return nom;
	}
}
