package exCH4_3;

public class Vacataire extends Enseignant {

	private final double SALHOR = 40;
	private int nbHeuresCours;
	
	public Vacataire(String nom, int nbHeuresCours) {
		super(nom);
		this.nbHeuresCours = nbHeuresCours;
	}
	
	public double salaire() {
		return nbHeuresCours * SALHOR;
	}
	public String toString() {
		return super.toString() + " (vacataire " + nbHeuresCours + " heures)";
	}
}
