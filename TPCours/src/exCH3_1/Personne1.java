package exCH3_1;

public class Personne1 {

	private String nom;
	private int age;
	private Voiture v;
	
	//DECLARATIONS DES ATTRIBUTS
	

	public Personne1(String nom, int age, Voiture v) {
		setNom(nom);
		setAge(age);
		setMaVoiture(v);
	}
	public Personne1(String nom, int age) {
		this(nom, age, null);
	}
	
	public boolean aVoiture() {
		return v != null;
	}
	
	public String toString() {
		if (aVoiture()) {
			return nom + ", " + age + " ans, conduit la " + v;
		} else {
			return nom + ", " + age + " ans, n'a pas de voiture." ;
		}
	}
	
	// SETTER GETTER
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setMaVoiture(Voiture v) {
		this.v = v;
	}
	
}
