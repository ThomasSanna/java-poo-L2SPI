package exercice2;

public class TestGarage {

	public static void main(String[] args) {
		
		Voiture voit1 = new Voiture(15, 10000.0, 17.0, 165.0, 100.0, 2023, 10, 30);
		Voiture voit2 = new Voiture(9, 5000.0, 17.0, 155.0, 200.0, 2023, 11, 20);
		
		Garage paradiso = new Garage("PARADISO", "Corté", 2);
		
		paradiso.ajouterVoiture(voit1);
		paradiso.ajouterVoiture(voit2);
		paradiso.afficher();
		
		System.out.println("La voiture la plus puissante est la voiture " + paradiso.laPlusPuissanteVoiture().getNumId());
		System.out.println("La valeur total du stock de voitures est de " + paradiso.valeurStock() + " euros");
		
		System.out.println("--------------TEST AMELIORATIONS---------------");
		
		System.out.println(voit1.getDateFab());
		System.out.println(voit1.estPlusRecente(voit2));
		
		System.out.println(voit1.formatDateFab1());
		System.out.println(voit2.formatDateFab2());
		
		System.out.println(paradiso.laVoitureLaPlusRecente().getNumId());
		
	}

}
