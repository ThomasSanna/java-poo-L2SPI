package exercice1suite;

public class TestBanque {

	public static void main(String[] args) {
		
		System.out.println("TEST APPLICATION BANQUE");
		
		System.out.println("********** QUESTION 2 **********");

		Personne titi = new Personne("Titi", "Ajaccio");
		System.out.println(titi);
		
		System.out.println("********** QUESTION 4 **********");
		
		Personne toto = new Personne("Toto", "Corte");
		
		Compte compteToto = new Compte("1010 55 221 12", 100.0, toto);
		Compte compteTiti = new Compte("120 22 222 2", titi);
		
		System.out.println(compteToto);
	    compteToto.deposer(1500.0);
	    compteToto.retirer(1000.0);
	    System.out.println(compteToto);
	    
	    compteToto.faireUnVirement(600.0, compteTiti);
	    compteToto.retirer(100.0);
	    
	    System.out.println(compteTiti);
	    System.out.println(compteToto);
	    
	    System.out.println("********** EXO 1 SUITE QUESTION 9 **********");
	    
	    System.out.println("\n---- afficherDepots ----");
	    System.out.println("-- Titi --");
	    compteTiti.afficherDepots();
	    System.out.println("-- Toto --");
	    compteToto.afficherDepots();
	    
	    System.out.println("\n---- depotMax ----");
	    System.out.println("-- Titi --");
	    System.out.println(compteTiti.depotMax());
	    System.out.println("-- Toto --");
	    System.out.println(compteToto.depotMax());
	    
	    System.out.println("\n---- sommeDepots ----");
	    System.out.println("-- Titi --");
	    System.out.println(compteTiti.sommeDepots());
	    System.out.println("-- Toto --");
	    System.out.println(compteToto.sommeDepots());
	    
	    System.out.println("\n---- moyenneDepots ----");
	    System.out.println("-- Titi --");
	    System.out.println(compteTiti.moyenneDepots());
	    System.out.println("-- Toto --");
	    System.out.println(compteToto.moyenneDepots());
	    
	}

}
