package exercice1;

public class GestionCourse {

	public static void main(String[] args) {
/* Question 5 */


		Bateau java = new MonoCoque("Java");
		Bateau tango = new MultiCoque("Tango");
		
		Equipier jean = new Equipier("Jean", "barreur");
		Equipier pierre = new Equipier("Pierre", "barreur");
		Equipier marie = new Equipier("Marie", "mousse");
		
		Equipage fineEquipe = new Equipage("fineEquipe", jean);
		fineEquipe.ajoutEquipier(marie);
		Equipage solitaire = new Equipage("solitaire", pierre);
		
		Course vent = new Course("Course du vent");
		vent.inscrireBateau(java, fineEquipe);
		vent.inscrireBateau(tango, solitaire);
		
		java.enregistrerTemps(120);
		tango.enregistrerTemps(150);
		
		vent.trouverGagnants();
		vent.afficherResultats();
		

		
/* Question 6 */
	/*	
		IHMCourse i = new IHMCourse();
		i.creerCourse();
		i.saisirTemps();
		i.afficherResultats();
	*/
	}

}
