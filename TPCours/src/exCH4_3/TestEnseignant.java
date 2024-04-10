package exCH4_3;

public class TestEnseignant {

	public static void main(String[] args) {
		
		Enseignant pierre = new Titulaire("Pierre", 1500.0);
		Enseignant laurent = new Titulaire("Laurent", 2500.0);
		Enseignant michel = new Vacataire("Michel", 15);
		Enseignant marie = new Vacataire("Marie", 60);
		
		Universite pascalPaoli = new Universite("Pascal Paoli");
		
		pascalPaoli.embaucher(pierre);
		pascalPaoli.embaucher(laurent);
		pascalPaoli.embaucher(michel);
		pascalPaoli.embaucher(marie);
		
		pascalPaoli.afficherSalaires();
	}

}
