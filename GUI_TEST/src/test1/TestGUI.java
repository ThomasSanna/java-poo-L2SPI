package test1;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class TestGUI {
    public static void main(String args[]) {

        // Création de la fenêtre
        final JFrame fenetre = new JFrame("Exemple Bouton");
        fenetre.setSize(400, 200);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Création d'une ArrayList pour stocker les boutons
        ArrayList<JButton> boutons = new ArrayList<>();

        // Création du label
        final JLabel label = new JLabel("Aucun clic pour le moment.");

        // Création d'un panneau pour organiser les composants
        JPanel panel = new JPanel();

        // Classe interne pour le compteur
        class ClicCounter {
            int compteurClics = 0;

            void incrementer() {
                compteurClics++;
                label.setText("Aucun clic pour le moment. Total clics : " + compteurClics);
            }
        }

        final ClicCounter clicCounter = new ClicCounter();

        for (int i = 0; i < 3; i++) {
            // Initialisation des boutons avec un texte spécifique
            JButton bouton = new JButton("Réponse n°" + i);

            // Ajout d'un écouteur d'événements à chaque bouton
            bouton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Modification du texte du label en fonction du bouton cliqué
                    label.setText(((JButton) e.getSource()).getText() + " cliquée !");
                    
                    // Incrémentation du compteur
                    clicCounter.incrementer();
                }
            });

            // Ajout du bouton à l'ArrayList
            boutons.add(bouton);

            // Ajout du bouton au panneau
            panel.add(bouton);
        }

        // Ajout du label au panneau
        panel.add(label);

        // Ajout du panneau à la fenêtre
        fenetre.getContentPane().add(panel);

        // Affichage de la fenêtre
        fenetre.setVisible(true);
    }
}
