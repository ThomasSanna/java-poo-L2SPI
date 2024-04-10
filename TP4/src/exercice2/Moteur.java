package exercice2;

public class Moteur {
	private static int nbMoteur = 0;
	private int num;
	private double prix;
	private int puissance;
	
	public Moteur(int puissance, double prix) {
		this.puissance = puissance;
		this.prix = prix;
		nbMoteur ++;
		this.num = nbMoteur;
	}
	public double getPrix() {
		return prix;
	}
	public int getPuissance() {
		return puissance;
	}
	public int getNum() {
		return num;
	}
	public String toString() {
		return "Numéro " + num + " de " + puissance + " cv";
	}
}
