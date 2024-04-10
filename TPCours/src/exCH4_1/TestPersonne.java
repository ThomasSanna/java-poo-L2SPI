package exCH4_1;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne marie = new Personne("Marie", 20);
		Etudiant etu = new Etudiant();
		etu.afficher();
		etu.setNom("Pierre");
		etu.setAge(21);
		etu.setNumEtu("20203456");
		etu.afficher();
		
	}

}
