package exercice1;

import java.util.ArrayList;

import javax.swing.JButton;

/**
 * La classe abstraite Question représente une question générique.
 */
public abstract class Question {
	
	protected ArrayList<JButton> boutonsRep;
	
	/**0
	 * L'énoncé de la question.
	 */
	protected String enonce;
	
	/**
	 * Indique si la réponse à la question est correcte.
	 */
	protected boolean estJuste = false;
	
	/**
	 * Le nombre de propositions associées à la question.
	 */
	protected int nbPropositions = 0;
	
	/**
	 * Le nombre de points attribués pour la question.
	 */
	protected float nbPoints;
	
	/**
	 * La liste des propositions associées à la question.
	 */
	protected ArrayList<Propositions> propositions;
	
	/**
	 * Construit une nouvelle question avec le nombre de points et l'énoncé spécifiés.
	 *
	 * @param nbPoints  Le nombre de points pour la question.
	 * @param enonce    L'énoncé de la question.
	 */
	protected Question(float nbPoints, String enonce) {
		this.enonce = enonce;
		this.nbPoints = nbPoints;
		propositions = new ArrayList<Propositions>();
		boutonsRep = new ArrayList<JButton>();
	}
	
	/**
	 * Affiche l'énoncé de la question.
	 */
	public abstract void afficherQuestion();
	
	/**
	 * Affiche la bonne réponse à la question.
	 */
	public abstract void afficherBonneReponse();
	
	/**
	 * Ajoute une proposition à la question.
	 *
	 * @param nom       Le nom de la proposition.
	 * @param estVraie   Indique si la proposition est vraie ou fausse.
	 */
	public void addPropositions(String nom, boolean estVraie) {
		propositions.add(new Propositions(nom, estVraie));
	}
	
	/**
	 * Ajoute une proposition fausse à la question.
	 *
	 * @param nom   Le nom de la proposition.
	 */
	public void addPropositions(String nom) {
		propositions.add(new Propositions(nom, false));
	}
	
	/**
	 * Retourne le nombre de points attribués à la question.
	 *
	 * @return Le nombre de points pour la question.
	 */
	public float getNbPoints() {
		return nbPoints;
	}
	
	/**
	 * Indique si la réponse à la question est correcte.
	 *
	 * @return true si la réponse est correcte, sinon false.
	 */
	public boolean getEstJuste() {
		return estJuste;
	}
	
	/**
	 * Inverse l'état de la réponse à la question (juste devient faux et vice versa).
	 */
	public void changeEstJuste() {
		this.estJuste = !this.estJuste;
	}
	
	/**
	 * Affiche si la réponse à la question est juste ou fausse.
	 */
	public void afficherSiJuste() {
		if(estJuste) {
			System.out.println("La réponse que vous avez fournie était vraie");
		} else {
			System.out.println("La réponse que vous avez fournie était fausse");
		}
	}
	
}
