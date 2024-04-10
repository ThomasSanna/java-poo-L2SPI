// SANNA THOMAS L2SPI
/**
 * La classe Jeu421 simule un jeu basé sur le lancer de trois dés, où le but est d'obtenir la combinaison gagnante "4-2-1".
 * 
 * @version 1.0.0
 * @author Sanna Thomas
 */
package exercice6;

public class Jeu421 {
	
	// ATTRIBUTS
	
	/** Premier dé du jeu. */
	private static De d1 = new De();
	
	/** Deuxième dé du jeu. */
	private static De d2 = new De();
	
	/** Troisième dé du jeu. */
	private static De d3 = new De();
	
	/** Nombre d'essais avant de gagner le jeu. */
	private static int nbEssais = 0;
	
	// METHODES
	
	/**
	 * Affiche les valeurs actuelles des trois dés.
	 */
	public static void afficherDes() {
		System.out.println(d1.getValeur() + ", " + d2.getValeur() + ", " + d3.getValeur());
	}

	/**
	 * Vérifie si la combinaison actuelle des dés correspond à la condition gagnante "4-2-1".
	 * 
	 * La condition gagnante est définie par deux critères :
	 * 1. La somme des valeurs des dés doit être égale à 7.
	 * 2. Le produit des valeurs des dés doit être égal à 8.
	 * 
	 * Ces critères représentent la combinaison spécifique "4-2-1" dans le jeu 421.
	 * Si ces conditions sont remplies, la méthode renvoie true, indiquant que le joueur a gagné.
	 * Sinon, elle renvoie false.
	 * 
	 * @return true si la combinaison actuelle des dés est gagnante, sinon false.
	 */
	public static boolean estGagnant() {
		if (((d1.getValeur() + d2.getValeur() + d3.getValeur()) == 7) && ((d1.getValeur() * d2.getValeur() * d3.getValeur()) == 8)){
	        return true;
	    } else {
	        return false;
	    }
	}

	/**
	 * Lance le jeu et continue jusqu'à ce que la combinaison gagnante soit obtenue.
	 */
	public static void lancerJeu() {
		System.out.println("Lancement du jeu...");
		d1.lancer(); d2.lancer(); d3.lancer();
		while(!Jeu421.estGagnant()) {
			nbEssais ++;
			int deNumRelance = lireIntConsole();
			lancerN(deNumRelance);
		}
		System.out.println("Dé 1 : " + d1.getValeur() + "\nDé 2 : " + d2.getValeur() + "\nDé 3 : " + d3.getValeur() + "\nBravo vous avez gagné en " + nbEssais + " essais.");
	}
	
	
	// AUTRES METHODES
	
	/**
	 * Lance le dé spécifié par le numéro.
	 * 
	 * @param n Numéro du dé à relancer (1, 2 ou 3).
	 */
	public static void lancerN(int n) {
		switch(n) {
		case 1:
			d1.lancer();
			break;
		case 2:
			d2.lancer();
			break;
		case 3:
			d3.lancer();
			break;
		default:
			lireIntConsole();
		}
	}
	
	/**
	 * Lit un entier depuis la console en demandant à l'utilisateur quel dé relancer.
	 * 
	 * @return Entier saisi par l'utilisateur (1, 2 ou 3).
	 */
	public static int lireIntConsole() {
		int res = 0;
		while (res < 1 || res >3) {
			res = Clavier.lireInt("Perdu ! \nDé 1 : " + d1.getValeur() +"\nDé 2 : " + d2.getValeur() + "\nDé 3 : " + d3.getValeur() +"\nQuel dé voulez-vous relancer ? (1 - 2 - 3) : ");
		}
		return res;
	}
}
