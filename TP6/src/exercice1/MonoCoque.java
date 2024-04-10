package exercice1;

public class MonoCoque extends Bateau {
    
    public MonoCoque(String nom) {
        super(nom);
    }

    public float tempsPondere() {
        return 2*temps;
    }
}
