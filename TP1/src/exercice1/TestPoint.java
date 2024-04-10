package exercice1;

public class TestPoint {
	
	public static void main(String[] args) {
		

		/* Question 1-2
		Point monPoint = new Point();
		monPoint.abscisse = 2.5; // ERREUR : impossible de modifier comme ceci depuis que les variables sont en private.
		monPoint.nom = 'C';
		monPoint.affiche();
		monPoint.abscisse = 3;
		monPoint.affiche(); */

	/* Question 3-4
		Point monPoint = new Point();
		monPoint.setAbscisse(3.0);
		monPoint.setNom('C');
		monPoint.affiche();
		System.out.println("Mon point a pour nom : " + monPoint.getNom());
		
		monPoint.translate(5);
		monPoint.affiche();*/

		
		Point monPoint = new Point('C', 3.0);
		monPoint.affiche();
		System.out.println("Mon point a pour nom : " + monPoint.getNom());
		
		monPoint.translate(5);
		monPoint.affiche();
		
	}
}
