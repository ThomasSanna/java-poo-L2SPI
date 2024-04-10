package exCH4_2;

//exercice 4.2
public class TestPersonne {
	public static void main(String[] args) {		
		Personne pers=new Personne("Marie",20);
		Personne etu=new Etudiant("Jean", 21,"20203433");
		Personne ens= new Enseignant("Pierre",54,3000,250);
		System.out.println(pers);
		System.out.println(etu);
		System.out.println(ens);
		pers.afficher();
		etu.afficher();
		ens.afficher();
		}

}
