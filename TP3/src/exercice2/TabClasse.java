package exercice2;

import java.util.Arrays;

public class TabClasse {

	private int nbMax;
	private int nbEff;
	private int [] tab;
	
	public TabClasse(int nbMax) {
		this.nbMax = nbMax;
		this.nbEff = 0;
		tab = new int[nbMax];
	}
	
	public void remplirTableau() {
		// nbEff = Clavier.lireInt("Combien il y a-t-il d'élément dans le tableau actuellement ?");
		boolean boolContinue = (nbEff == nbMax ? false : true);
		while(boolContinue) {
			tab[nbEff] = Clavier.lireInt("Entrez un entier pour remplir le tableau. Vous pouvez rentrer encore " + (nbMax-nbEff) + " éléments. -> ");
			nbEff ++;
			if(nbEff == nbMax) {
				boolContinue = false;
			}
			int wantContinue = Clavier.lireInt("Continuer ? 0 pour non, 1 pour oui. -> ");
			if(wantContinue == 0) {
				boolContinue = false;
			}
		}
	}
	
	public int plusGrandElement() {
		int indMax = 0;
		for (int i = 1; i < tab.length; i++) {
			if (tab[i]>tab[indMax]) {
				indMax=i;
			}
		}
		return tab[indMax];
	}
	
	public int sommeElements() {
		int res = 0;
		for (int i = 0; i < tab.length; i++) {
			res += tab[i];
		}
		return res;
	}
	
    public void afficherTableau() {
        System.out.print("Tableau : [");
        for (int i = 0; i < nbEff; i++) {
            System.out.print(tab[i]);
            if (i < nbEff - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public void afficherTableau(int[] tab) {
        System.out.print("Tableau : [");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
            if (i < tab.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public void trierTableau() {
    	int[] tabTemp = Arrays.copyOf(tab, nbEff);
    	Arrays.sort(tabTemp);
    	afficherTableau(tabTemp);
    }

	public int [] getTab() {
		return tab;
	}
}
