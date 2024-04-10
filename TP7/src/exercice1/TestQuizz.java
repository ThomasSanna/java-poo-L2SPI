package exercice1;

public class TestQuizz {

	public static void main(String[] args) {
		
		Quizz quizz = new Quizz("Université de Corse", "PersonneEnParticulier");
		
		Question q1 = new QuestionChoixUnique(2, "L'université de Corse est localisée :");
		q1.addPropositions("à Corté", true);
		q1.addPropositions("à Ajaccio");
		q1.addPropositions("à Bastia");
		
		Question q2 = new QuestionChoixMultiple(2, "Quelles sont les matières enseignées à la Faculté des sciences ?");
		q2.addPropositions("Algorithmique", true);
		q2.addPropositions("Chant");
		q2.addPropositions("Danse");
		q2.addPropositions("Programmation", true);
		
		Question q3 = new QuestionChoixUnique(1, "Quel est le nom de l'université de Corse?");
		q3.addPropositions("Pasquale Paoli", true);
		q3.addPropositions("Colomba");
		q3.addPropositions("Sampiero Corso");
		
		Question q4 = new QuestionVraiFaux(2, "L'université de Corse a ouvert ses portes en 1765.", true);

		quizz.addQ(q1);
		quizz.addQ(q2);
		quizz.addQ(q3);
		quizz.addQ(q4);
		
		quizz.questionnaire();
	}

}
