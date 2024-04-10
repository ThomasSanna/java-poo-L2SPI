package exercice1;

/**
 * La classe Propositions représente une proposition associée à une question.
 */
public class Propositions {

	/**
	 * Indique si la proposition est correcte ou non.
	 */
	private boolean estCorrecte;
	
	/**
	 * L'énoncé de la proposition.
	 */
	private String enonce;
	
	/**
	 * Construit une nouvelle proposition avec l'énoncé et l'indication de sa correction.
	 *
	 * @param enonce       L'énoncé de la proposition.
	 * @param estCorrect   Indique si la proposition est correcte.
	 */
	public Propositions(String enonce, boolean estCorrect) {
		this.enonce = enonce;
		this.estCorrecte = estCorrect;
	}
	
	/**
	 * Retourne true si la proposition est correcte, sinon false.
	 *
	 * @return true si la proposition est correcte, sinon false.
	 */
	public boolean getEstCorrecte() {
		return estCorrecte;
	}
	
	/**
	 * Retourne une représentation textuelle de la proposition.
	 *
	 * @return L'énoncé de la proposition.
	 */
	public String toString() {
		return enonce;
	}
	
}
