package exercice1;

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
	}

}
