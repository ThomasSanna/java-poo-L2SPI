package exercice1;

import java.util.ArrayList;

public class Entreprise {
	private String nom;
	// private ArrayList<Personne> employes;
	private Personne[] employes;
	private int totalEmployes = 0;
	public Entreprise(String nom){
		this.nom=nom;
		this.employes = new Personne[100];
	}
	
	public void embaucher(Personne p, double salaire){
		employes[totalEmployes] = p;
		p.setSalaire(salaire);
		totalEmployes ++;
	}
	
	public double sommeSalaire1() {
		double sum = 0.0;
		for (int i=0; i < totalEmployes; i++) {
			sum += employes[i].getSalaire();
		}
		return sum;
	}
	public double sommeSalaire2() {
		double sum = 0.0;
		for(Personne employe:employes) {
			sum += employe.getSalaire();
		}
		return sum;
	}
}