/**
 * SANNA THOMAS L2SPI
 * Cette classe représente un vecteur tridimensionnel en trois dimensions (x, y, z).
 * Elle permet de réaliser des opérations telles que l'affichage des coordonnées, le calcul de la norme,
 * le produit scalaire avec d'autres vecteurs, et la somme de vecteurs.
 * 
 * @version 1.0.0
 * @author Sanna Thomas
 */
package exercice5;

public class Vecteur3D {
	
	// ATTRIBUTS
	
    /** Première composante (coordonnée x) du vecteur. */
    private double x;
    
    /** Deuxième composante (coordonnée y) du vecteur. */
    private double y;
    
    /** Troisième composante (coordonnée z) du vecteur. */
    private double z;
    
	
	// CONSTRUCTEURS
	
	/**
	 * Constructeur par défaut qui crée un vecteur 3D avec des composantes nulles.
	 */
	public Vecteur3D() {
		this(0.0, 0.0, 0.0);
	}
	
	/**
	 * Constructeur avec trois composantes spécifiées.
	 * 
	 * @param x Première composante (coordonnée x).
	 * @param y Seconde composante (coordonnée y).
	 * @param z Troisième composante (coordonnée z).
	 */
	public Vecteur3D(double x, double y, double z) {
		setx(x);
		sety(y);
		setz(z);
	}
	
	// METHODES
	
	/**
	 * Affiche les coordonnées du vecteur 3D sous forme de chaîne de caractères.
	 */
	public void afficheCoordonnees() {
		System.out.println("<" + x + ", " + y + ", " + z + ">");
	}
	
	/**
	 * Calcule la norme (longueur) du vecteur.
	 * 
	 * @return La norme du vecteur.
	 */
	public double normeVect() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
	}
	
	/**
	 * Calcule le produit scalaire de ce vecteur avec un autre vecteur donné.
	 * 
	 * @param v Le vecteur avec lequel effectuer le produit scalaire.
	 * @return Le produit scalaire entre ce vecteur et le vecteur donné.
	 */
	public double produitScalaire(Vecteur3D v) {
		return (x * v.x) + (y * v.y) + (z * v.z);
	}
	
	/**
	 * Calcule le produit scalaire entre deux vecteurs 3D donnés.
	 * 
	 * @param v1 Le premier vecteur.
	 * @param v2 Le deuxième vecteur.
	 * @return Le produit scalaire entre les deux vecteurs.
	 */
	public static double produitScalaire(Vecteur3D v1, Vecteur3D v2) {
		return (v1.x * v2.x) + (v1.y * v2.y) + (v1.z * v2.z);
	}
	
	/**
	 * Calcule la somme de ce vecteur avec un autre vecteur donné et retourne le résultat sous forme de chaîne de caractères.
	 * 
	 * @param v Le vecteur à ajouter à ce vecteur.
	 * @return La somme de ce vecteur avec le vecteur donné sous forme de chaîne de caractères.
	 */
	public String somme(Vecteur3D v) {
		return "<" + (x + v.x) + ", " + (y + v.y) + ", " + (z + v.z) + ">";
	}
	
	/**
	 * Calcule la somme entre deux vecteurs 3D donnés et retourne le résultat sous forme de chaîne de caractères.
	 * 
	 * @param v1 Le premier vecteur.
	 * @param v2 Le deuxième vecteur.
	 * @return La somme des deux vecteurs sous forme de chaîne de caractères.
	 */
	public static String somme(Vecteur3D v1, Vecteur3D v2) {
		return "<" + (v1.x + v2.x) + ", " + (v1.y + v2.y) + ", " + (v1.z + v2.z) + ">";
	}
	
	public String toString() {
		return "<" + x + ", " + y + ", " + z + ">";
	}
	
	// GETTERS & SETTERS
	
	/**
	 * Retourne la première composante (coordonnée x) du vecteur.
	 * 
	 * @return La première composante du vecteur.
	 */
	public double getx() {
		return x;
	}
	
	/**
	 * Définit la première composante (coordonnée x) du vecteur.
	 * 
	 * @param x La nouvelle valeur de la première composante.
	 */
	public void setx(double x) {
		this.x = x;
	}
	
	/**
	 * Retourne la deuxième composante (coordonnée y) du vecteur.
	 * 
	 * @return La deuxième composante du vecteur.
	 */
	public double gety() {
		return y;
	}
	
	/**
	 * Définit la deuxième composante (coordonnée y) du vecteur.
	 * 
	 * @param y La nouvelle valeur de la deuxième composante.
	 */
	public void sety(double y) {
		this.y = y;
	}
	
	/**
	 * Retourne la troisième composante (coordonnée z) du vecteur.
	 * 
	 * @return La troisième composante du vecteur.
	 */
	public double getz() {
		return z;
	}
	
	/**
	 * Définit la troisième composante (coordonnée z) du vecteur.
	 * 
	 * @param z La nouvelle valeur de la troisième composante.
	 */
	public void setz(double z) {
		this.z = z;
	}
}
