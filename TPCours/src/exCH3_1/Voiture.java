package exCH3_1;

public class Voiture {
	
	// ATTRIBUTS

	private String immat;
	private int puissance;
	
	// CONSTRUCTEURS
	
	public Voiture(String immat, int puissance) {
		setImmat(immat);
		setPuissance(puissance);
	}
	
	public String toString() {
		return "Voiture " + immat + " de puissance " + puissance;
	}

	public void setImmat(String immat) {
		this.immat = immat;
	}
	
	public String getImmat() {
		return immat;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	
	public int getPuissance() {
		return puissance;
	}
}
