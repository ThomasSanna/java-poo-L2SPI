package exercice1;

public class Personne {
	private String nom;
	private double salaire;
	
	public Personne(String nom){
		this.nom=nom;
		salaire=0;
	}
	public void setSalaire(double salaire){
		this.salaire=salaire; 
	}
	public double getSalaire(){
		return salaire; 
	}
}
