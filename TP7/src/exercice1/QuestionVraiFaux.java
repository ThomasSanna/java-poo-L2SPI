package exercice1;

import java.util.ArrayList;

import javax.swing.JButton;

/**
 * La classe QuestionVraiFaux représente une question de type Vrai/Faux.
 */
public class QuestionVraiFaux extends Question {
	
	/**
	 * Indique si la réponse correcte à la question Vrai/Faux est Vraie.
	 */
	private boolean estVraie;

	/**
	 * Construit une nouvelle question de type Vrai/Faux avec le nombre de points, l'énoncé et la réponse correcte spécifiés.
	 *
	 * @param nbPoints  Le nombre de points pour la question.
	 * @param enonce    L'énoncé de la question.
	 * @param estVraie   Indique si la réponse correcte est Vraie.
	 */
	public QuestionVraiFaux(float nbPoints, String enonce, boolean estVraie) {
		super(nbPoints, enonce);
		this.estVraie = estVraie;
	}
	
	/**
	 * Affiche la question Vrai/Faux, permet à l'utilisateur de répondre et met à jour l'état de la réponse.
	 */
	public void afficherQuestion() {
		System.out.println("Question Vrai/Faux (" + nbPoints + " points)");
		System.out.println(enonce);
		String rep = Clavier.lireString("Entrez votre proposition (V ou F) : ");
		
		if((rep.equals("V") && estVraie) || (rep.equals("F") && !estVraie)) {
			changeEstJuste();
		}
	}
	
	/**
	 * Affiche la bonne réponse à la question Vrai/Faux.
	 */
	public void afficherBonneReponse() {
		System.out.println(enonce);

		if(estVraie) {
			System.out.println("V");
		} else {
			System.out.println("F");
		}
		
		afficherSiJuste();
	}
	
	public ArrayList<JButton> getBoutonsRep() {
		return boutonsRep;
	}

}
