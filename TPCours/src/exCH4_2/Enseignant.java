package exCH4_2;

import exCH4_2.Personne;

public class Enseignant extends Personne{
	private double salaire;
	private int nbHeuresCours;

	public Enseignant(String nom, int age, double salaire, int nbHeuresCours) {
		super(nom, age);
		this.salaire = salaire;
		this.nbHeuresCours = nbHeuresCours;
	}
	
	public String toString() {
		return "Enseignant "  + super.toString()  + " " + salaire;
	}

	public void afficher() {
		System.out.println("******Enseignant******");
		super.afficher();
		System.out.println(
				"Salaire : " + salaire +
				"\nNombre d'heures de cours : " + nbHeuresCours
				);
	}
	
}
