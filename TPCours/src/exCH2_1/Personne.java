package exCH2_1;

public class Personne {
	
	private String nom;
	private String adresse;
	private double salaire;
	public static int nbPersonne = 0;
	private static double masseSalaire = 0.0;
	
	//DECLARATIONS DES ATTRIBUTS
	
	public Personne(String nom, String adresse, double salaire) {
		setNom(nom);
		setAdresse(adresse);
		setSalaire(salaire);
		nbPersonne ++;
	}
	public Personne(String nom, double salaire) {
		this(nom, "", salaire);
		nbPersonne ++;
	}
	
	//NOM
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	//ADRESSE
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public String getAdresse() {
		return this.adresse;
	}
	
	
	//SALAIRE
	
	public void setSalaire(double salaire) {
		if (this.salaire == 0.0) {
			masseSalaire = masseSalaire + (salaire >= 1219 ? salaire : 1219);
		} else {
			masseSalaire -= this.salaire;
			masseSalaire = masseSalaire + (salaire >= 1219 ? salaire : 1219);
		}
		if (salaire >= 1219) {
			this.salaire = salaire;
		} else {
			this.salaire = 1219;
		}
	}
	
	public double getSalaire() {
		return this.salaire;
	}
	
	
	//AUTRES METHODES
	public void afficher() {
		System.out.println(this.nom + " habite " + this.adresse);
	}
	
	public void changerAdresse(String nouvelleAdresse) {
		this.adresse = nouvelleAdresse;
	}
	
	public void salaireAnnuel() {
		System.out.println("Salaire annuel de " + this.nom + " : " + this.salaire * 12);
	}
	
	public void salaireEstSupp2000() {
		System.out.println(this.nom + " a un salaire plus " + ((this.salaire >= 2000)? "grand " : "petit ") + "que 2000.");
	}
	
	public static double affichermasseSalariale() {
		return masseSalaire;
	}
	
	public static double salaireMoyen() {
		return masseSalaire / nbPersonne;
	}

}
