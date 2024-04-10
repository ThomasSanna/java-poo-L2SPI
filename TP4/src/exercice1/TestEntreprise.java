package exercice1;

public class TestEntreprise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entreprise e=new Entreprise("TP4");
		Personne p1=new Personne("Toto");
		Personne p2=new Personne("Titi");
		e.embaucher(p1,1000);
		e.embaucher(p2,2000);
		System.out.println(e.sommeSalaire1());
	}

}
