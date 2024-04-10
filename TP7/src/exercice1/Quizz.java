package exercice1;

import java.util.ArrayList;

/**
 * La classe Quizz représente un questionnaire avec différents types de questions.
 */
public class Quizz {
	
	/**
	 * Le titre du quiz.
	 */
	private String titre;
	
	/**
	 * L'auteur du quiz.
	 */
	private String auteur;
	
	/**
	 * Le nombre total de questions dans le quiz.
	 */
	private int nbQuestions;
	
	/**
	 * Le total des points attribués pour des réponses correctes.
	 */
	private float totalPointsBonneRep; 
	
	/**
	 * Le total des points disponibles dans le quiz.
	 */
	private float totalPoints; 
	
	/**
	 * La liste des questions dans le quiz.
	 */
	private ArrayList<Question> questions;
	
	/**
	 * Construit un nouveau Quizz avec le titre et l'auteur spécifiés.
	 *
	 * @param titre   Le titre du quiz.
	 * @param auteur  L'auteur du quiz.
	 */
	public Quizz(String titre, String auteur) {
		this.titre = titre;
		this.auteur = auteur;
		this.nbQuestions = 0;
		questions = new ArrayList<Question>();
	}
	
	/**
	 * Ajoute une question à choix multiples au quiz.
	 *
	 * @param nbPoints  Le nombre de points pour la question.
	 * @param enonce    L'énoncé ou la question.
	 */
	public void addQCM(float nbPoints, String enonce) {
		questions.add(new QuestionChoixMultiple(nbPoints, enonce));
		nbQuestions ++;
	}
	
	/**
	 * Ajoute une question à choix unique au quiz.
	 *
	 * @param nbPoints  Le nombre de points pour la question.
	 * @param enonce    L'énoncé ou la question.
	 */
	public void addQCU(float nbPoints, String enonce) {
		questions.add(new QuestionChoixUnique(nbPoints, enonce));
		nbQuestions ++;
	}
	
	/**
	 * Ajoute une question vrai/faux au quiz.
	 *
	 * @param nbPoints   Le nombre de points pour la question.
	 * @param enonce     L'énoncé ou la question.
	 * @param estVraie   La réponse correcte (vrai ou faux).
	 */
	public void addVF(float nbPoints, String enonce, boolean estVraie) {
		questions.add(new QuestionVraiFaux(nbPoints, enonce, estVraie));
		nbQuestions ++;
	}
	
	/**
	 * Ajoute une question personnalisée au quiz.
	 *
	 * @param q  La question personnalisée à ajouter.
	 */
	public void addQ(Question q) {
		questions.add(q);
		nbQuestions++;
	}
	
	/**
	 * Retourne une représentation textuelle du quiz.
	 *
	 * @return Une chaîne formatée représentant les détails du quiz.
	 */
	public String toString() {
		calculTotalPoints();
		return (
				"******* QUIZZ " + titre + " *******\n"+
				"QUIZZ noté sur " + totalPoints + " défini par " + auteur +
				"\n*********************"
		);
	}
	
	/**
	 * Affiche les questions du quiz, calcule le total des points et affiche la correction.
	 */
	public void questionnaire() {
		System.out.println(toString());
		for (int i=0 ; i<questions.size() ; i++) {
			System.out.println("Question N°" + (i+1));
			questions.get(i).afficherQuestion();
			System.out.println("---------------------------");
		}
		
		calculTotalPoints();
		
		System.out.println("Résultat : " + totalPointsBonneRep + "/" + totalPoints);
		
		System.out.println("******* CORRECTION du QUIZZ " + titre + " *******");
		
		for (int i=0 ; i<questions.size() ; i++) {
			System.out.println("Question N°" + (i+1));
			questions.get(i).afficherBonneReponse();
			System.out.println("---------------------------");
		}
	}
	
	/**
	 * Calcule le total des points attribués pour les réponses correctes et le total des points disponibles dans le quiz.
	 */
	private void calculTotalPoints() {
		totalPointsBonneRep = 0;
		totalPoints = 0;
		for(Question q: questions) {
			if(q.getEstJuste()) {
				totalPointsBonneRep += q.getNbPoints();
			}
			totalPoints += q.getNbPoints();
		}
	}

}
