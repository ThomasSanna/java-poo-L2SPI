package exercice1;

public abstract class Bateau {
	
	private String nom;
	protected float temps;
	private Equipage equipage;

	public Bateau(String nom) {
		this.nom = nom;
	}
	
	public abstract float tempsPondere();
	
	public String resultat() {
		if (equipage != null) {
			return "Le bateau " + nom + " de " + equipage.getCapitaine() + " a réalisé un temps pondéré de " + tempsPondere() + " mn.";
		}
		return "";
	}
	
	public void enregistrerTemps(float t) {
		temps = t;
	}
	
	public void affecterEquipage(Equipage equipage) {
		if (this.equipage == null) {
			this.equipage = equipage;
		} else {
			System.out.println("L'équipage de " + equipage.getCapitaine() + " a déjà été assigné.");
		}
	}
	
	public boolean peutAffecterEquipage() {
		return this.equipage == null;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String toString() {
		if (equipage != null) {
			return nom + " de " + equipage.getCapitaine();
		} else {
			return nom ;
		}
	}
	
}
