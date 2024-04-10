package exercice1;

public class Equipage {
	
	private String nom;
	private int nbEquipiers;
	private Equipier[] equipiers;
	
	public Equipage(String nom, Equipier capitaine) {
		this.nom = nom;
		this.equipiers = new Equipier[7];
		equipiers[0] = capitaine;
		nbEquipiers = 1;
	}
	
	public Equipier getCapitaine() {
		return equipiers[0];
	}
	
	public void ajoutEquipier(Equipier e) {
		if (nbEquipiers < 7) {
			equipiers[nbEquipiers] = e;
			nbEquipiers++;
		} else {
			System.out.println("Impossible d'ajouter un équipier : L'équipage est au complet !");
		}
	}
}
