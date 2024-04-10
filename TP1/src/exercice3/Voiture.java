package exercice3;

public class Voiture {
	
	private String nom;
	private int chevaux;
	private int vitesse;
	private int maxVitesse;
	
	
	public Voiture(String nom, int chevaux) {
		this.nom = nom;
		this.chevaux = chevaux;
		this.vitesse = 0;
		this.maxVitesse = 5;
	}
	
	public int donneVitesse() {
		return this.vitesse;
	}
	public void passeVitesseSuperieure() {
		if (vitesse < maxVitesse) {
			vitesse += 1;
		}
	}
	public void retrograde() {
		if (vitesse > 0) {
			vitesse -= 1;
		}
	}
	public void affiche() {
		System.out.println(nom + ", " + chevaux + " chevaux.");
	}
	public boolean estPointMort() {
		return vitesse == 0;
	}

}
