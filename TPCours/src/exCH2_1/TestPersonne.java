package exCH2_1;

public class TestPersonne {

	public static void main(String[] args) {

		Personne p=new Personne("Titi", "Corte", 2000);

		p.afficher();
		p.changerAdresse("Ajaccio");
		p.afficher();
		p.salaireAnnuel();
		p.salaireEstSupp2000();
		
		Personne e = new Personne("Michelle", "Madrid", 1000);
		
		System.out.println(Personne.affichermasseSalariale());
		e.afficher();
		e.setSalaire(3200);
		
		System.out.println(Personne.nbPersonne);
		System.out.println(Personne.affichermasseSalariale());
		System.out.println(Personne.salaireMoyen());
		
		Personne machin = new Personne("Machin", 2000);
		machin.afficher();
		
	}
}
  