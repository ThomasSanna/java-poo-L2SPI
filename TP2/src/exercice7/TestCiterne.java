package exercice7;

public class TestCiterne {

	public static void main(String[] args) {
		
		// String nomCiterne, int capaciteL, double contenuEffectifL
		Citerne c1 = new Citerne ("UDC", 100, 0.0);
		Citerne c2 = new Citerne ("UDC", 100, 0.0);
		Citerne c3 = new Citerne ("UDC", 150, 0.0);
		
		System.out.println(
				c1 + "\n" +
				c2 + "\n" +
				c3 + "\n"
				);
		
		System.out.println("*******OPERATIONS DE VIDAGE/REMPLISSAGE*********");
		c1.remplirCiterne(200.0);
		c1.remplirCiterne(80.0);
		c2.remplirCiterne(100.0);
		c2.viderCiterne(150.0);
		c2.viderCiterne(20.0);
		
		System.out.println(
				c1 + "\n" +
				c2 + "\n" +
				c3
				);
		
		if (Citerne.citerneEqual(c1, c2)) {
			System.out.println("c1 et c2 sont égales");
		}
		if (!Citerne.citerneEqual(c1, c3)) {
			System.out.println("c1 et c3 ne sont pas égales");
		}
	}

}
