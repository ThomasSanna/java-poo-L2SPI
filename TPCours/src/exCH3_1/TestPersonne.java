package exCH3_1;

public class TestPersonne {

	public static void main(String[] args) {
		
		// PERSONNE 1
		
		Voiture v1 = new Voiture("XIML13", 5);
		Voiture v2 = new Voiture("AMOLP22", 120000);
		
		Personne1 titi = new Personne1("Titi", 19, v1);
		Personne1 marelle = new Personne1("Marelle", 75, v2);
		Personne1 michel = new Personne1("Michel", 12);

		System.out.println("---------- PERSONNE 1 ----------");
		System.out.println(v1);
		System.out.println(titi);
		System.out.println(v2);
		System.out.println(marelle);
		System.out.println(michel);
		
		// PERSONNE 2
		
		System.out.println("---------- PERSONNE 2 ----------");
		Personne2 david = new Personne2("David", 320, "IGHS30", 21);
		System.out.println(david);

	}

}
