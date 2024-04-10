package exercice1;

public class Equipier {
	
	private String nom;
	private String specialite;
	
	public Equipier(String nom, String specialite) {
		this.nom = nom;
		this.specialite = specialite;
	}
	
	public String toString() {
		return nom + " (" + specialite + ")";
	}

}
