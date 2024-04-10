package exercice3;

class TestVoiture{
	 static public void main(String[] args){
		 
		 Voiture v = new Voiture("Titine", 7);
		 // création d'une voiture nommée "Titine" de 7 chevaux
		 System.out.println(v.donneVitesse());
		 // affiche : 0
		 v.passeVitesseSuperieure();
		 // passe la première vitesse
		 v.passeVitesseSuperieure();
		 // passe la seconde vitesse
		 v.passeVitesseSuperieure();
		 // passe la troisième vitesse
		 v.retrograde();
		 // retourne en seconde
		 System.out.println(v.donneVitesse());
		 // affiche : 2
		 v.affiche();
		 // affiche : Titine, 7 chevaux
		 v.retrograde();
		 v.retrograde();
		 System.out.println(v.estPointMort());
		 
	 }
}