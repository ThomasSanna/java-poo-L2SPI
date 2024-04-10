package exercice2;

public class TestTabClasse {

	public static void main(String[] args) {

		TabClasse t = new TabClasse(5);
		System.out.println(t.sommeElements());
		t.remplirTableau();
		t.afficherTableau();
		t.trierTableau();
		System.out.println(t.sommeElements());
		System.out.println(t.plusGrandElement());
		t.afficherTableau();
	}

}
