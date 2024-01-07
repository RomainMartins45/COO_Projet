package controleur;

import modele.Jeu;
import vue.Ihm;

public class ControleurPrincipal {
    private Jeu jeu;
    private Ihm ihm;

    public ControleurPrincipal(Jeu jeu, Ihm ihm) {
        this.jeu = jeu;
        this.ihm = ihm;
    }

    public void demarrer() {
        boolean enCours = true;
        ihm.afficherMenuPrincipal();
        while (enCours) {
            int choix = ihm.recueillirChoixUtilisateur();
            switch (choix) {
                case 1:
                    // Commencer une nouvelle partie
                    jeu.demarrerJeu();
                    break;
                case 2:
                    // Charger une partie
                    // ...
                    break;
                case 3:
                    // Quitter le jeu
                    enCours = false;
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
                    break;
            }
        }
    }
}

