package exercice1suite;

public class Compte {
	
	private String numero;
	private double solde;
	private Personne titulaire;
	private double[] depots;
	private int nbDepot = 0;
	
	public Compte(String numero, double depotInitial, Personne titulaire) {
		this.numero = numero;
		this.solde = depotInitial;
		this.titulaire = titulaire;
		this.depots = new double[10];
		if (depotInitial > 0) {
			depots[nbDepot] = depotInitial;
			nbDepot ++;
		}
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
	public boolean deposer(double montant) {
		solde += montant;
		if (nbDepot < 10) {
			depots[nbDepot] = montant;
			nbDepot++;
			return true;
		} else {
			System.out.println("Erreur : Nombre de dépots maximum atteint.");
			return false;
		}
		
	}
	public boolean retirer(double montant) {
		if (solde-montant >= 0) {
			solde -= montant;
			return true;
		} else {
			System.out.println("Erreur de saisie : Opération impossible.");
			return false;
		}
	}
	public void faireUnVirement(double montant, Compte compteDestinataire) {
		if (solde-montant >= 0) {
			if (compteDestinataire.nbDepot <= 10) {
				solde -= montant;
				compteDestinataire.solde += montant;
				compteDestinataire.depots[compteDestinataire.nbDepot] = montant;
				compteDestinataire.nbDepot++;
			} else {
				System.out.println("Erreur : Nombre de dépots maximum du destinataire atteint.");
			}
		} else {
			System.out.println("Erreur de saisie : Opération impossible.");
		}
	}
	public void afficherDepots() {
		System.out.println("Nombre total de dépots : " + nbDepot);
		for(int i = 0; i<nbDepot; i++) {
			System.out.println("Dépôt N°" + (i+1) + " = " + depots[i] + " euros");
		}
	}
	public double depotMax() {
		int indMax = 0;
		for (int i = 1; i<depots.length; i++) {
			if (depots[i]>depots[indMax]) {
				indMax = i;
			}
		}
		return depots[indMax];
	}
	public double sommeDepots() {
		double res = 0.0;
		for (int i = 0; i<depots.length; i++) {
			res += depots[i];
		}
		return res;
	}
	public double moyenneDepots() {
		double somme = sommeDepots();
		return (somme / (nbDepot));
	}
	public String toString() {
		return "Compte courant de " + titulaire.getNom() + " : " + numero + " - Solde = " + solde + " euros.";
	}
	
}
