// SANNA THOMAS L2SPI
/**
 * Citerne - Classe représentant une citerne avec des attributs tels que la capacité, le contenu effectif, l'identifiant, le nom et le numéro d'ordre.
 * Chaque citerne possède un identifiant unique basé sur le nom et le numéro d'ordre.
 * La classe offre des méthodes pour remplir, vider et comparer des citernes.
 * @author Sanna Thomas
 */
package exercice7;

public class Citerne {

	// ATTRIBUTS
	
	private int capaciteL;
	private double contenuEffectifL;
	private String identifiant;
	private String nomCiterne;
	private int numOrdre;
	private static int nbCiternes;
	
	// CONSTRUCTEURS
	
    /**
     * Constructeur de la classe Citerne.
     * 
     * @param nomCiterne Nom de la citerne.
     * @param capaciteL Capacité totale de la citerne en litres.
     * @param contenuEffectifL Contenu effectif actuel de la citerne en litres.
     */
	public Citerne (String nomCiterne, int capaciteL, double contenuEffectifL) {
		nbCiternes ++;
		setNumOrdre(nbCiternes);
		setNomCiterne(nomCiterne);
		setCapaciteL(capaciteL);
		setContenuEffectifL(contenuEffectifL);
		setIdentifiant();
	}
	
	// METHODES
	
    /**
     * Renvoie une représentation textuelle de la citerne.
     * 
     * @return Chaîne de caractères représentant la citerne.
     */
	public String toString() {
		return "Citerne " + identifiant + ", capacité (L) : " + capaciteL + " litres, volume contenu : " + contenuEffectifL + " litres.";
	}
	
    /**
     * Remplit la citerne avec une quantité spécifiée, si possible.
     * 
     * @param quantite Quantité à ajouter au contenu effectif de la citerne.
     */
	public void remplirCiterne (double quantite) {
		if (contenuEffectifL + quantite > capaciteL) {
			System.out.println("ERREUR REMPLISSAGE IMPOSSIBLE : La cuve " + identifiant + " est trop pleine pour accepter une opération de remplissage de " + quantite + " litre(s)");
		} else {
			contenuEffectifL += quantite;
			System.out.println("La cuve " + identifiant + " a été remplie de " + quantite + "litre(s)");
		}
	}
	
	/**
     * Vide la citerne avec une quantité spécifiée, si possible.
     * 
     * @param quantite Quantité à retirer du contenu effectif de la citerne.
     */
	public void viderCiterne (double quantite) {
		if (contenuEffectifL - quantite < 0) {
			System.out.println("ERREUR VIDAGE IMPOSSIBLE : La cuve " + identifiant + " ne contient pas les " + quantite + " litre(s) demandé(s)");
		} else {
			contenuEffectifL -= quantite;
			System.out.println("La cuve " + identifiant + " a été vidée de " + quantite + "litre(s)");
		}
	}
	
	/**
     * Compare deux citernes pour égalité basée sur la capacité et le contenu effectif.
     * 
     * @param c1 Première citerne à comparer.
     * @param c2 Deuxième citerne à comparer.
     * @return true si les citernes sont égales, false sinon.
     */
	public static boolean citerneEqual (Citerne c1, Citerne c2) {
		return c1.capaciteL == c2.capaciteL && c1.contenuEffectifL == c2.contenuEffectifL;
	}
	
	/**
     * Renvoie le nombre total de citernes créées.
     * 
     * @return Nombre total de citernes créées.
     */
	public static int totalCiterne () {
		return nbCiternes;
	}
	
    // SETTER & GETTER
    
    /**
     * Modifie la capacité totale de la citerne.
     * 
     * @param capaciteL Nouvelle capacité totale en litres.
     */
    public void setCapaciteL(int capaciteL) {
        this.capaciteL = capaciteL;
    }

    /**
     * Renvoie la capacité totale de la citerne.
     * 
     * @return Capacité totale de la citerne en litres.
     */
    public int getCapaciteL() {
        return capaciteL;
    }

    /**
     * Modifie le contenu effectif actuel de la citerne.
     * 
     * @param contenuEffectifL Nouveau contenu effectif en litres.
     */
    public void setContenuEffectifL(double contenuEffectifL) {
        this.contenuEffectifL = contenuEffectifL;
    }

    /**
     * Renvoie le contenu effectif actuel de la citerne.
     * 
     * @return Contenu effectif actuel de la citerne en litres.
     */
    public double getContenuEffectifL() {
        return contenuEffectifL;
    }

    /**
     * Définit l'identifiant unique de la citerne basé sur le nom et le numéro d'ordre.
     */
    public void setIdentifiant() {
        this.identifiant = nomCiterne + "_" + numOrdre;
    }

    /**
     * Renvoie l'identifiant unique de la citerne.
     * 
     * @return Identifiant unique de la citerne.
     */
    public String getIdentifiant() {
        return identifiant;
    }

    /**
     * Renvoie le nom de la citerne.
     * 
     * @return Nom de la citerne.
     */
    public String getNomCiterne() {
        return nomCiterne;
    }

    /**
     * Modifie le nom de la citerne.
     * 
     * @param nomCiterne Nouveau nom de la citerne.
     */
    public void setNomCiterne(String nomCiterne) {
        this.nomCiterne = nomCiterne;
    }

    /**
     * Renvoie le numéro d'ordre de la citerne.
     * 
     * @return Numéro d'ordre de la citerne.
     */
    public int getNumOrdre() {
        return numOrdre;
    }

    /**
     * Modifie le numéro d'ordre de la citerne.
     * 
     * @param numOrdre Nouveau numéro d'ordre de la citerne.
     */
	public void setNumOrdre(int numOrdre) {
		this.numOrdre = numOrdre;
	}
	
}
