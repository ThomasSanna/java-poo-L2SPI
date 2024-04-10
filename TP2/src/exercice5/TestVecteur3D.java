package exercice5;

public class TestVecteur3D {

	public static void main(String[] args) {
		
		Vecteur3D v1 = new Vecteur3D(1.0, 2.0, 3.0);
		Vecteur3D v2 = new Vecteur3D(3.0, 4.0, 5.0);
		
		v1.afficheCoordonnees();
		v2.afficheCoordonnees();
		
		System.out.println(v1.normeVect());
		System.out.println(v2.normeVect());
		
		System.out.println(v1.produitScalaire(v2));
		System.out.println(Vecteur3D.produitScalaire(v1, v2));
		
		System.out.println(v1.somme(v2));
		System.out.println(Vecteur3D.somme(v1, v2));
		
		System.out.println(v1);
	}

}
