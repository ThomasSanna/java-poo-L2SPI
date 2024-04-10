package exercice1;

import java.util.ArrayList;

public class Course {

	private String titre;
	private int nbBateaux;
	private Bateau[] listBateaux;
	private int nbGagnants;
	private ArrayList<Bateau> listGagnants;
	
	public Course (String titre) {
		this.titre = titre;
		listBateaux = new Bateau[20];
		nbBateaux = 0;
		nbGagnants = 0;
		listGagnants = new ArrayList<Bateau>();
	}
	
	public void inscrireBateau(Bateau b, Equipage e) {
		if (b.peutAffecterEquipage()) {
			b.affecterEquipage(e);
			listBateaux[nbBateaux] = b;
			nbBateaux ++;
		} else {
			System.out.println("Inscription impossible car le bateau " + b.getNom() + " a déjà été à un équipage.");
		}
	}
	
	public void inscrireBateau(Bateau b) {
		if (b.peutAffecterEquipage()) {
			System.out.println("Vous devez d'abord assigner un équipage !");
		} else {
			listBateaux[nbBateaux] = b;
			nbBateaux ++;
		}
	}
	
	public void trouverGagnants() {
		float tempsMin = 999999;
		for (int i = 0; i<nbBateaux; i++) {
			if (tempsMin > listBateaux[i].tempsPondere()){
				tempsMin = listBateaux[i].tempsPondere();
			}
		}
		for (int i = 0; i<nbBateaux; i++) {
			if (listBateaux[i].tempsPondere() == tempsMin) {
				listGagnants.add(listBateaux[i]);
				nbGagnants ++;
			}
		}
	}
	
	public void afficherGagnants() {
		if (nbGagnants == 1) {
			System.out.println("Le grand gagnant est " + listGagnants.get(0));
		} else {
			String nomBatGagnants = "";
			for(int i = 0; i<nbGagnants; i++) {
				if (i == nbGagnants-1) {
					nomBatGagnants += listGagnants.get(i).getNom();
				} else {
					nomBatGagnants += listGagnants.get(i).getNom() + " - ";
				}
			}
			System.out.println("Il y a " + nbGagnants + " gagnants ex-aequo : " + nomBatGagnants );
		}
	}
	
	public void afficherResultats() {
		System.out.println("Résultats de la regate : " + titre);
		afficherGagnants();
		System.out.println("Il y avait " + nbBateaux + " participants");
		for (int i=0; i<nbBateaux; i++) {
			System.out.println(listBateaux[i].resultat());
		}
	}
	
	public Bateau[] getListBateaux() {
		return listBateaux;
	}
	
	public int getNbBat() {
		return nbBateaux;
	}
	
	
}
