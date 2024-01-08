package controleur;

import modele.GuerrierDecorator;
import modele.Jeu;
import modele.MageDecorator;
import modele.Personnage;
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

    public Personnage configurerPersonnageMédieval() {
        String choix = ihm.demanderTypePersonnageMédieval();
        switch (choix) {
            case "Mage":
                return new MageDecorator(new Personnage(100, 10, 10, 20),50);
            case "Guerrier":
                return new GuerrierDecorator(new Personnage(100, 20, 15, 5));
            default:
                return new Personnage(100, 10, 10, 10); // Valeurs par défaut si le choix est invalide
        }
    }
}

