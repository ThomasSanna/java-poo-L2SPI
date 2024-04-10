package exercice1;
	/**
	 * @author Sanna
	 */
public class Point {
	
	private char nom;
	private double abscisse;
	
	public Point (char nom, double abscisse) { 
		setNom(nom);
		// this.nom = nom
		setAbscisse(abscisse);
		// this.abscisse = abscisse
	}

	public void setNom (char nom) {
		this.nom = nom;
	}
	public char getNom() {
		return this.nom;
	}

	public void setAbscisse (double abscisse) {
		this.abscisse = abscisse;
	}
	public double getAbscisse() {
		return this.abscisse;
	}
	
	public void affiche() {
		System.out.println("Nom : " + nom + "\nAbscisse : " + abscisse);
	}
	public void translate(int n) {
		this.abscisse += n;
	}
	
}
