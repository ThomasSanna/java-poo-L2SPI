package exercice1;

public class Personne {

	private String nom;
	private String adresse;
	
	public Personne (String nom, String adresse) {
		this.nom = nom;
		this.adresse = adresse;
	}
	
	public String getAdresse() {
		return adresse;
	}

	public String getNom() {
		return nom;
	}
	
	public String toString() {
		return "Nom : " + nom + "\nAdresse : " + adresse ;
	}
	
}
