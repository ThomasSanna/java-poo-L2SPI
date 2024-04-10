//SANNA THOMAS L2SPI
package exercice4;

public class ManipRob {

	public static void main(String[] args) {

		Robot r1 = new Robot("Toto", 10, 20, 3); // nom, x, y, orientation
		Robot r2 = new Robot("Titi", 0, 0, 4);
		
		r1.deplacer();
		r2.deplacer(); // Erreur : On ne peut pas aller à des coordonnées négatives.
		r1.setOrientationRobot(1);
		r2.setOrientationRobot(0); // Erreur : Impossible de mettre des orientations autres que 1, 2, 3 ou 4.
		
		System.out.println( r1.chaineOrientation() );
		
		/*
		r1.afficheToi();
		r2.afficheToi();
		*/
		
		System.out.println(r1);
		System.out.println(r2);
	}

}
