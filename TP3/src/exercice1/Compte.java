package exercice1;

public class Compte {
	
	private String numero;
	private double solde;
	private Personne titulaire;
	
	public Compte(String numero, double depotInitial, Personne titulaire) {
		this.numero = numero;
		this.solde = depotInitial;
		this.titulaire = titulaire;
	}
	public Compte(String numero, double depotInitial, String nom, String adresse) {
		this(
				numero, 
				depotInitial, 
				new Personne(nom, adresse)
		);
	}
	public Compte(String numero, String nom, String adresse) {
		this(
				numero, 
				0, 
				new Personne(nom, adresse)
		);
	}
	public Compte(String numero, Personne titulaire) {
		this(
				numero, 
				0,
				titulaire
		);
	}
	
	public String getNumero() {
		return numero;
	}
	public double getSolde() {
		return solde;
	}
	public String getNomTitulaire() {
		return titulaire.getNom();
	}
	public boolean estVide() {
		return solde==0;
	}
	public void deposer(double montant) {
		solde += montant;
	}
	public void retirer(double montant) {
		if (solde-montant >= 0) {
			solde -= montant;
		} else {
			System.out.println("Erreur de saisie : Opération impossible.");
		}
	}
	public void faireUnVirement(double montant, Compte compteDestinataire) {
		if (solde-montant >= 0) {
			solde -= montant;
			compteDestinataire.solde += montant;
		} else {
			System.out.println("Erreur de saisie : Opération impossible.");
		}
	}
	public String toString() {
		return "Compte courant de " + titulaire.getNom() + " : " + numero + " - Solde = " + solde + " euros.";
	}
	
}
