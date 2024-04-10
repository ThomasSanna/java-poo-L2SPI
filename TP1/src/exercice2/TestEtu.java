package exercice2;

public class TestEtu {

	public static void main(String[] args) {
		
		
		Etudiant Alfred = new Etudiant("Alfred", 10, 8, 12);
		Etudiant Emma = new Etudiant("Emma", 5, 10, 3);
		
		Alfred.afficherResultat();
		Emma.afficherResultat();
		
		System.out.println((Alfred.moyenne()>Emma.moyenne()? Alfred.getNom(): Emma.getNom()) + " a une meilleure moyenne.");
		
	}

}
