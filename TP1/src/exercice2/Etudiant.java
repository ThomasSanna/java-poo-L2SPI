package exercice2;

public class Etudiant {
	
	// QUESTION 4
	
	
	private String nom;
	private double[] notes;
	private final int nbNotes=3;
	
	public Etudiant(String nom, double noteUE1, double noteUE2, double noteUE3) {
		notes = new double[nbNotes];
		setNom(nom);
		setNotes(noteUE1, noteUE2, noteUE3);
	}
	public void setNom (String nom) {
		this.nom = nom;
	}
	public void setNotes (double note1, double note2, double note3) {
		notes[0]=note1;
		notes[1]=note2;
		notes[2]=note3;
	}
	public double moyenne() {
		return (notes[0] + notes[1] + notes[2])/3;
	}
	public boolean aValiderUE(int numUE) {
		switch (numUE) {
		case 1:
			return notes[0]>=10;
		case 2:
			return notes[1]>=10;
		case 3:
			return notes[2]>=10;
		default:
			return false;
		}
	}
	public String resultatUE (int numUE) {
		String res = "non acquise";
		switch(numUE) {
		case 1:
			res = (notes[0]>=10) ? "acquise" : estAdmis()? "acquise par compensation" : "non acquise";
			break;
		case 2:
			res = (notes[1]>=10) ? "acquise" : estAdmis()? "acquise par compensation" : "non acquise";
			break;
		case 3:
			res = (notes[2]>=10) ? "acquise" : estAdmis()? "acquise par compensation" : "non acquise";
			break;
		}
		return res;
	}
	public boolean estAdmis() {
		return (moyenne()>=10);
	}
	public void afficherResultat() {
		System.out.println(
				"Etudiant : " + nom +
				"\nNote UE1 : " + notes[0] +"	UE " + resultatUE(1) +
				"\nNote UE2 : " + notes[1] +"	UE " + resultatUE(2) +
				"\nNote UE3 : " + notes[2] +"	UE " + resultatUE(3) +
				"\nMoyenne générale : " + moyenne() + "	" + (estAdmis()?"admis":"refusé")
				);
	}
	public String getNom() {
		return nom;
	}

	
	/* QUESTION 1 2 3
	 */ 
	/*
	private String nom;
	private double noteUE1;
	private double noteUE2;
	private double noteUE3;

	
	public Etudiant(String nom, double noteUE1, double noteUE2, double noteUE3) {
		setNom(nom);
		//this.nom = nom
		setNoteUE1(noteUE1);
		setNoteUE2(noteUE2);
		setNoteUE3(noteUE3);
	}
	
	public void setNom (String nom) {
		this.nom = nom;
	}
	public void setNoteUE1 (double noteUE1) {
		this.noteUE1 = noteUE1;
	}
	public void setNoteUE2 (double noteUE2) {
		this.noteUE2 = noteUE2;
	}
	public void setNoteUE3 (double noteUE3) {
		this.noteUE3 = noteUE3;
	}
	
	public double moyenne() {
		return (noteUE1+noteUE2+noteUE3)/3;
	}
	public boolean estAdmis() {
		return moyenne()>=10;
	}
	public void afficherResultat() {
		System.out.println(
				"Etudiant : " + nom +
				"\nNote UE1 : " + noteUE1 +"	UE " + resultatUE(1) +
				"\nNote UE2 : " + noteUE2 +"	UE " + resultatUE(2) +
				"\nNote UE3 : " + noteUE3 +"	UE " + resultatUE(3) +
				"\nMoyenne générale : " + moyenne() + "	" + (estAdmis()?"admis":"refusé")
				);
	}
	public String getNom() {
		return nom;
	}
	public boolean aValiderUE(int numUE) {
		/*switch (numUE) {
		case 1:
			return noteUE1>=10;
		case 2:
			return noteUE2>=10;
		case 3:
			return noteUE3>=10;
		default:
			return false;
		}*/
		/*if (numUE == 1) {
			return noteUE1>=10;
		} else if (numUE == 2) {
			return noteUE2>=10;
		} else if (numUE == 3) {
			return noteUE3>=10;
		}
		return false;
	}
	public String resultatUE (int numUE) {
		String res = "non acquise";
		switch(numUE) {
		case 1:
			res = (noteUE1>=10) ? "acquise" : this.estAdmis()? "acquise par compensation" : "non acquise";
			// (condition) ? true : false
			/*
			if(noteUE1 >= 10) {
				res = "acquise";
			} else if (estAdmis()) {
				res = "acquise par compensation";
			} else {
				res = "non acquise";
			}*/
			/*break;
		case 2:
			res = (this.noteUE2>=10) ? "acquise" : this.estAdmis()? "acquise par compensation" : "non acquise";
			break;
		case 3:
			res = (this.noteUE3>=10) ? "acquise" : this.estAdmis()? "acquise par compensation" : "non acquise";
			break;
		}
		return res;
	
	}*/
	
	
}
