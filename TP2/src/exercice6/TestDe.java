package exercice6;

public class TestDe {

	public static void main(String[] args) {
		
		De d1 = new De();
		De d2 = new De();
		De d3 = new De();
				

		d1.lancer();
		d2.lancer();
		d3.lancer();
		
		System.out.println(d1.getValeur() + d2.getValeur() + d3.getValeur());
		
	}

}
