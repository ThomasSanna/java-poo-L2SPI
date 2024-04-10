package exCH4_2;

import exCH4_2.Personne;

public class Etudiant extends Personne {

	private String numEtu;
	
	public Etudiant(String nom, int age, String numEtu) {
		super(nom, age);
		this.numEtu = numEtu;
	}

	public void setNumEtu(String numEtu) {
		this.numEtu = numEtu;
	}
	
	public String toString() {
		return "Etudiant numéro " + numEtu + " " + super.toString() ;
	}
	
	public void afficher() {
		System.out.println("******Etudiant******");
		System.out.println("Numéro étudiant : " + numEtu);
		super.afficher();
	}
}
