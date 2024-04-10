package exCH4_5;

import exCH4_2.Enseignant;
import exCH4_2.Etudiant;
import exCH4_2.Personne;

//exercice 4.5
public class TestPersonne4_5 {
	//Classes Personne, Etudiant, Enseignant de l'exercice 4.2
	public static void main(String[] args) {		
		Personne p1=new Personne("Marie",20);
		Personne p2=new Etudiant("Machin",26,"20202134");
		Personne p3=new Enseignant("Toto",34,2000,192);
		Etudiant p4=new Etudiant("Jean", 21,"20203433");
		Enseignant p5= new Enseignant("Pierre",54,3000,250);	
		p4=(Etudiant) p2; // downcast
		// p5=(Enseignant) p1; // Erreur, une Personne n'a pas les mêmes attributs qu'un Enseignant
		((Etudiant) p2).setNumEtu("20205784");
		p4.setNumEtu("20205785");
		// ((Etudiant) p3).setNumEtu("20205786"); // Impossible, un Enseignant n'a pas de methode setNumEtu
	}

}
