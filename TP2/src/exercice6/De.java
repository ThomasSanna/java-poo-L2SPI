/**
 * SANNA THOMAS L2SPI
 * Cette classe représente un dé à six faces.
 * Elle permet de lancer le dé pour obtenir une valeur aléatoire entre 1 et 6.
 * 
 * @version 1.0.0
 * @author Sanna Thomas
 */
package exercice6;

public class De {
	
	// ATTRIBUTS
	private int valeur;
	
	// CONSTRUCTEURS
	
	/**
	 * Constructeur par défaut qui initialise la valeur du dé à 1.
	 */
	public De() {
		setValeur(1);
	}
	
	// METHODES
	
	/**
	 * Lance le dé pour obtenir une valeur aléatoire entre 1 et 6.
	 */
	public void lancer() {
		setValeur((int) (Math.random() * 6) + 1);
	}
	
	// SETTER & GETTER
	
	/**
	 * Obtient la valeur actuelle du dé.
	 * 
	 * @return La valeur actuelle du dé.
	 */
	public int getValeur() {
		return this.valeur;
	}
	
	/**
	 * Définit la valeur du dé.
	 * 
	 * @param valeur La nouvelle valeur du dé.
	 */
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
}
