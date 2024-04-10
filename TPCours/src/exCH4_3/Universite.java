package exCH4_3;

import java.util.ArrayList;

public class Universite {

	private String nom;
	private ArrayList<Enseignant> salaries;
	
	public Universite (String nom){
		this.nom = nom;
		this.salaries = new ArrayList<Enseignant>();
	}
	
	public void afficherSalaires() {
		System.out.println("LISTE DES ENSEIGNANTS DE L'UNIVERSITE " + nom);
		System.out.println("Effectif: " + salaries.size() + " enseignants");
		double totalSalaire = 0.0;
		for (Enseignant e: salaries ) {
			System.out.println(e + " : " + e.salaire() + " euros");
			totalSalaire += e.salaire();
		}
		System.out.println("Total des salaires = " + totalSalaire + " euros");
	}
	
	public void embaucher(Enseignant e) {
		salaries.add(e);
	}
	
}
