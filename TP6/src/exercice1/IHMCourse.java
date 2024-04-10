package exercice1;

@SuppressWarnings("unused")
public class IHMCourse {
	
	private Course c;

	private Equipier creerEquipier() {
		String nom = Clavier.lireString("Nom de l'équipier : ");
		String role = Clavier.lireString("Role de l'équipier : ");
		return new Equipier(nom, role);
	}
	
	private Equipage creerEquipage() {
		String nom = Clavier.lireString("Nom de l'équipage : ");
		System.out.println("Création du capitaine.");
		Equipier capitaine = creerEquipier();
		
		return new Equipage(nom, capitaine);
	}
	private Bateau creerBateau() {
		String nom = Clavier.lireString("Nom du bateau : ");
		int multiOuMono = Clavier.lireInt("MultiCoque (0) ou MonoCoque (1) : ");
		if (multiOuMono == 1) {
			return new MultiCoque(nom);
		}
		return new MonoCoque(nom);
	}
	
	public void creerCourse() {
		if (c == null) {
			String nomCourse = Clavier.lireString("Nom de la course : ");
			this.c = new Course(nomCourse);
			int nbParticipants = Clavier.lireInt("Nombre de participant : ");
			for (int i = 0; i<nbParticipants; i++) {
				Bateau b = creerBateau();
				Equipage e = creerEquipage();
				c.inscrireBateau(b, e);
			}
		}
	}
	
	public void saisirTemps() {
		Bateau[] listBat = c.getListBateaux();
		int nbBat = c.getNbBat();
		for (int i = 0; i<nbBat ; i++) {
			float temps = Clavier.lireFloat("Temps du bateau " + listBat[i].getNom() + " : ");
			listBat[i].enregistrerTemps(temps);
		}
	}
	
	public void afficherResultats() {
		c.trouverGagnants();
		c.afficherResultats();
	}
	
}
