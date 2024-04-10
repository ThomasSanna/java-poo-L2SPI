package exercice2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Voiture {
	private static int nbVoitures;
	private String numId;
	private Roue mesRoues;
	private Moteur monMoteur;
	private LocalDate dateFab;
	
	public Voiture (int puissance, double prix, double diam, double larg, double prixRoue, int year, int month, int day){
		nbVoitures ++;
		numId = "V"+nbVoitures;
		monMoteur = new Moteur(puissance, prix);
		mesRoues = new Roue(diam, larg, prixRoue);
		dateFab = LocalDate.of(year, month, day);
	}
	public LocalDate getDateFab() {
		return dateFab;
	}
	public boolean estPlusPuissante(Voiture v) {
		return monMoteur.getPuissance()>v.monMoteur.getPuissance();
	}
	public String getNumId() {
		return numId;
	}
	public double prix() {
		return mesRoues.getPrix()*4 + monMoteur.getPrix();
	}
	public int puissance() {
		return monMoteur.getPuissance();
	}
	public String toString() {
		return(
				"VOITURE Numéro : " + numId +
				"\n Fabriquée le : " + formatDateFab1() +
				"\nPrix : " + prix() + " euros" +
				"\nMoteur : " + monMoteur +
				"\nRoues normales : " + mesRoues
				);
	}
	public boolean estPlusRecente(Voiture v) {
		return dateFab.isBefore(v.dateFab);
	}
	public String formatDateFab1() {
		int day = dateFab.getDayOfMonth();
		int month = dateFab.getMonthValue();
		int year = dateFab.getYear();
		return day + "/" + month + "/" + year; 
	}
	public String formatDateFab2() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return dateFab.format(formatter);
	}
}









