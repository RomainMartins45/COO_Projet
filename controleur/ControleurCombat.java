package controleur;

import java.util.List;

import modele.Ennemi;
import modele.Personnage;
import vue.Ihm;

public class ControleurCombat {
    private Personnage joueur;
    private List<Ennemi> ennemis;
    private Ihm ihm;

    public ControleurCombat(Personnage joueur, List<Ennemi> ennemis, Ihm ihm) {
        this.joueur = joueur;
        this.ennemis = ennemis;
        this.ihm = ihm;
    }

    public void lancerCombat() {
        while (joueur.estVivant() && ennemisRestants()) {
            ihm.afficherEtatCombat(joueur, ennemis);
            
            // Jouer un tour
            jouerTour();

            // Vérifier si le combat est terminé
            if (!joueur.estVivant()) {
                System.out.println("Vous avez perdu le combat !");
                break;
            } else if (!ennemisRestants()) {
                System.out.println("Vous avez gagné le combat !");
                break;
            }
        }
        // Gérer la fin du combat
        finirCombat();
    }

    private void jouerTour() {
        // Le joueur attaque un ennemi
        Ennemi ennemi = choisirEnnemi(); // Choisissez un ennemi cible
        joueur.attaquer(ennemi);

        // Chaque ennemi encore en vie attaque le joueur
        for (Ennemi en : ennemis) {
            if (en.estVivant()) {
                en.attaque(joueur);
            }
        }
    }

    private Ennemi choisirEnnemi() {
        // Implémenter la logique pour choisir un ennemi à attaquer
        // Pour simplifier, retournons simplement le premier ennemi vivant
        for (Ennemi en : ennemis) {
            if (en.estVivant()) {
                return en;
            }
        }
        return null; // ou gérer d'une autre manière
    }

    private boolean ennemisRestants() {
        for (Ennemi en : ennemis) {
            if (en.estVivant()) {
                return true;
            }
        }
        return false;
    }

    private void finirCombat() {
        if (!joueur.estVivant()) {
            // Gérer la défaite du joueur
        } else if (!ennemisRestants()) {
            // Gérer la victoire du joueur
            // Peut-être accorder de l'expérience, des objets, etc.
        }
    }
}


