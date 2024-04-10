package exercice1;

/**
 * La classe QuestionChoixUnique représente une question à choix unique.
 */
public class QuestionChoixUnique extends Question {

	/**
	 * Construit une nouvelle question à choix unique avec le nombre de points et l'énoncé spécifiés.
	 *
	 * @param nbPoints  Le nombre de points pour la question.
	 * @param enonce    L'énoncé de la question.
	 */
	public QuestionChoixUnique(float nbPoints, String enonce) {
		super(nbPoints, enonce);
	}
	
	/**
	 * Affiche l'énoncé de la question à choix unique et ses propositions.
	 */
	private void afficherEnonce() {
		System.out.println(enonce);
		for(int i=0 ; i<propositions.size() ; i++) {
			System.out.println(i+1 + " : " + propositions.get(i));
		}
	}
	
	/**
	 * Affiche la question à choix unique et permet à l'utilisateur de répondre.
	 * Vérifie ensuite si la réponse est correcte et met à jour l'état de la réponse.
	 */
	public void afficherQuestion() {
		System.out.println("Question à choix unique (" + nbPoints + " points)");
		afficherEnonce();
		
		int rep = Clavier.lireInt("Entrer le numéro de la réponse choisie \n(1 à " + propositions.size() + ") : ");
		
		if (propositions.get(rep-1).getEstCorrecte()) {
			changeEstJuste();
		}
	}
	
	/**
	 * Affiche la bonne réponse à la question à choix unique.
	 */
	public void afficherBonneReponse() {
		System.out.println(enonce);
		
		for(Propositions p:propositions) {
			String VouF = p.getEstCorrecte()?"V":"F";
			System.out.println(p + " : " + VouF);
		}
		afficherSiJuste();
	}
	
	/**
	 * Ajoute une proposition à la question à choix unique en vérifiant qu'il n'y a qu'une seule réponse correcte.
	 *
	 * @param nom       Le nom de la proposition.
	 * @param estVraie   Indique si la proposition est vraie ou fausse.
	 */
	public void addPropositions(String nom, boolean estVraie) {
		if ((existePasRep() && estVraie) || !estVraie) {
			propositions.add(new Propositions(nom, estVraie));
		} else {
			System.out.println("Une Proposition est déjà vraie dans votre QCU " + enonce + " !");
		}
	}
	
	/**
	 * Vérifie s'il n'y a pas déjà de réponse correcte dans la liste des propositions.
	 *
	 * @return true s'il n'y a pas de réponse correcte, sinon false.
	 */
	public boolean existePasRep() {
		for (Propositions p:propositions) {
			if (p.getEstCorrecte()) {
				return false;
			}
		}
		return true;
	}
	
}
