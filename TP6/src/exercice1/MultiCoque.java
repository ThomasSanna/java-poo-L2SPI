package exercice1;

public class MultiCoque extends Bateau {
    
    public MultiCoque(String nom) {
        super(nom);
    }

    public float tempsPondere() {
    	return 5*temps;
    }
}
