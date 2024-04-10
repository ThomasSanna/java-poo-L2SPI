package exercice1;

/**
 * La classe QuestionChoixMultiple représente une question à choix multiple.
 */
public class QuestionChoixMultiple extends Question {

	/**
	 * Construit une nouvelle question à choix multiple avec le nombre de points et l'énoncé spécifiés.
	 *
	 * @param nbPoints  Le nombre de points pour la question.
	 * @param enonce    L'énoncé de la question.
	 */
	public QuestionChoixMultiple(float nbPoints, String enonce) {
		super(nbPoints, enonce);
	}
	
	/**
	 * Affiche l'énoncé de la question à choix multiple et ses propositions.
	 */
	public void afficherEnonce() {
		System.out.println(enonce);
		for(int i=0 ; i<propositions.size() ; i++) {
			System.out.println(i+1 + " : " + propositions.get(i));
		}
	}
	
	/**
	 * Affiche la bonne réponse à la question à choix multiple.
	 */
	public void afficherBonneReponse() {
		System.out.println(enonce);
		
		for(Propositions p : propositions) {
			String VouF = p.getEstCorrecte()?"V":"F";
			System.out.println(p + " : " + VouF);
		}
		afficherSiJuste();
	}
	
	/**
	 * Affiche la question à choix multiple et permet à l'utilisateur de répondre.
	 * Vérifie ensuite si la réponse est correcte et met à jour l'état de la réponse.
	 */
	public void afficherQuestion() {
		System.out.println("Question à choix multiple (" + nbPoints + " points)");
		
		afficherEnonce();

		boolean boul = true;
		for(int i = 0 ; i<propositions.size() ; i++) {
			int rep = Clavier.lireInt(propositions.get(i) + " ----> Taper 1 si vous choisissez la réponse et 0 sinon : ");
			if (!((rep == 1 && propositions.get(i).getEstCorrecte()) || 
					(rep == 0 && !(propositions.get(i).getEstCorrecte())))) {
				boul = false;
			}
		}
		if (boul) {
			changeEstJuste();
		}
		
	}

}
