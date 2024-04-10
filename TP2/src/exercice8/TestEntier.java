package exercice8;

public class TestEntier {

	public static void main(String[] args) {

		Entier int1 = new Entier(20); // n'est pas dans la borne automatique.
		System.out.println(int1);
		
		int1.incremente();
		System.out.println(int1);
		
		int1.incremente(5);
		System.out.println(int1);
		
		int1.incremente(20); // n'est pas dans la borne automatique
		System.out.println(int1);
		
		int1.incremente(-6);
		System.out.println(int1);
		
		int1.incremente(-10);
		System.out.println(int1);
		
		System.out.println(Entier.getBorneInf() + " est la borne inférieure et " + Entier.getBorneSup() + " est la borne supérieure.");
		
	}

}
