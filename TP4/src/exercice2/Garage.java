package exercice2;

import java.util.ArrayList;

public class Garage {
	private String adresse;
	private int nbMaxVoitures;
	private String nom;
	private ArrayList<Voiture> listeVoitures;
	
	public Garage(String nom, String adresse, int nbMaxVoitures) {
		this.nom = nom;
		this.adresse = adresse;
		this.nbMaxVoitures = (nbMaxVoitures<0? 0 : nbMaxVoitures);
		listeVoitures = new ArrayList<>();
	}
	public void afficher() {
		System.out.println("GARAGE " + nom + " (" + adresse + ") Capacité : " + listeVoitures.size() + " voitures.");
		for(Voiture val:listeVoitures) {
			System.out.println("******************************************");
			System.out.println(val);
		}
		System.out.println("******************************************");
		System.out.println("Voiture la plus récente : " + laVoitureLaPlusRecente().getNumId());
		System.out.println("*******************FIN********************\n");
	}
	public void ajouterVoiture(Voiture v) {
		if (listeVoitures.size() < nbMaxVoitures) {
			listeVoitures.add(v);
		} else {
			System.out.println("Erreur : Aucune place disponible.");
		}
	}
	public Voiture laPlusPuissanteVoiture() {
		int indMax = 0;
		for(int i=0; i<listeVoitures.size(); i++) {
			if (listeVoitures.get(i).puissance()>listeVoitures.get(indMax).puissance()) {
				indMax = i;
			}
		}
		return listeVoitures.get(indMax);
	}
	public Voiture laVoitureLaPlusRecente() {
		int indRecent = 0;
		for (int i=0; i<listeVoitures.size(); i++) {
			if(listeVoitures.get(i).estPlusRecente(listeVoitures.get(indRecent))) {
				indRecent = i;
			}
		}
		return listeVoitures.get(indRecent);
	}
	public double valeurStock() {
		double sum = 0.0;
		for(Voiture val:listeVoitures) {
			sum += val.prix();
		}
		return sum;
	}
	
}
