// SANNA THOMAS L2SPI

package exercice8;

public class Entier {

    // ATTRIBUTS
    
    private static int borneSup ;
    private static int borneInf ;
    private int entier;
    
    // CONSTRUCTEUR
    
    /**
     * Constructeur avec des bornes spécifiées.
     * @param borneSup La borne supérieure.
     * @param borneInf La borne inférieure.
     * @param entier La valeur initiale de l'entier.
     */
    public Entier(int borneSup, int borneInf, int entier) {
        setBorneInf(borneInf);
        setBorneSup(borneSup);
        // Vérifie si l'entier est dans les bornes spécifiées, sinon le fixe à la borne inférieure
        if (entier <= borneInf && entier >= borneSup) {
            setEntier(entier);
        } else {
            setEntier(borneInf);
        }
    }
    
    /**
     * Constructeur avec bornes par défaut (0 et 10).
     * @param entier La valeur initiale de l'entier.
     */
    public Entier(int entier) {
    	this(10, 0, entier);
    }
    
    /**
     * Constructeur par défaut (borne inférieure 0, borne supérieure 10, entier fixé à la borne inférieure).
     */
    public Entier() {
    	this(10, 0, 0);
    }
    
    // METHODES
    
    /**
     * Retourne une représentation textuelle de l'objet.
     * @return La représentation textuelle de l'objet.
     */
    public String toString() {
        return "Entier de valeur " + this.entier + " compris entre " + borneInf + " et " + borneSup;
    }
    
    /**
     * Incrémente la valeur de l'entier de 1.
     */
    public void incremente() {
        setEntier(this.entier + 1);
    }
    
    /**
     * Incrémente la valeur de l'entier de n.
     * @param n La valeur à incrémenter.
     */
    public void incremente(int n) {
        setEntier(this.entier + n);
    }
    
    // SETTER & GETTER
    
    /**
     * Retourne la borne supérieure.
     * @return La borne supérieure.
     */
    public static int getBorneSup() {
        return borneSup;
    }
    
    /**
     * Définit la borne supérieure, mais uniquement si elle est supérieure à la borne inférieure.
     * @param borneSup La nouvelle borne supérieure.
     */
    public static void setBorneSup(int borneSup) {
        if (borneSup > borneInf) {
            Entier.borneSup = borneSup;
        }
    }
    
    /**
     * Retourne la borne inférieure.
     * @return La borne inférieure.
     */
    public static int getBorneInf() {
        return borneInf;
    }
    
    /**
     * Définit la borne inférieure.
     * @param borneInf La nouvelle borne inférieure.
     */
    public static void setBorneInf(int borneInf) {
        Entier.borneInf = borneInf;
    }

    /**
     * Retourne la valeur de l'entier.
     * @return La valeur de l'entier.
     */
    public int getEntier() {
        return entier;
    }

    /**
     * Définit la valeur de l'entier, mais uniquement si elle est dans les bornes spécifiées.
     * @param entier La nouvelle valeur de l'entier.
     */
    public void setEntier(int entier) {
        if (entier >= borneInf  && entier <= borneSup) {
            this.entier = entier;
        } else {
            System.out.println("Entier " + entier + " dépasse les bornes " + borneInf  + " et " + borneSup);
        }
    }
}