package controleur;

import modele.*;
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
        while (enCours) {
            ihm.afficherMenuPrincipal();
            int choixPrincipal = ihm.recueillirChoixUtilisateur();
            switch (choixPrincipal) {
                case 1:
                    // Processus de démarrage d'une nouvelle partie
                    demarrerNouvellePartie();
                    afficherMenuSecondaire();
                    break;
                case 2:
                    enCours = false;  // Quitter le jeu
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
                    break;
            }
        }
    }

    private void demarrerNouvellePartie() {
        Theme theme = ihm.demanderTheme();
        jeu.setTheme(theme);
        Personnage personnage = configurerPersonnage(theme);
        jeu.setPersonnage(personnage);
        jeu.demarrerJeu();
    }

    private void afficherMenuSecondaire() {
        boolean menuActif = true;
        while (menuActif) {
            ihm.afficherMenuSecondaire();
            int choix = ihm.recueillirChoixUtilisateur();
            switch (choix) {
                case 1:
                    entrerDansDonjon();
                    break;
                case 2:
                    gererInventaire();
                    break;
                case 3:
                    afficherStatistiquesPersonnage();
                    break;
                case 4:
                    menuActif = false; // Revenir au menu principal
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
                    break;
            }
        }
    }

    private void afficherStatistiquesPersonnage() {
        if (jeu.getPersonnage() != null) {
            ihm.afficherStatistiquesPersonnage(jeu.getPersonnage());
        } else {
            System.out.println("Aucun personnage n'est actuellement chargé dans le jeu.");
        }
    }

    private void entrerDansDonjon() {
        // Logique pour entrer dans un donjon
    }

    private void gererInventaire() {
        if (jeu.getPersonnage() == null) {
            System.out.println("Aucun personnage n'est actuellement chargé dans le jeu.");
            return;
        }

        int choixObjet = ihm.choisirObjetDansInventaire(jeu.getPersonnage().getInventaire());
        if (choixObjet < 0 || choixObjet >= jeu.getPersonnage().getInventaire().size()) {
            return; // Retour si choix invalide ou retour en arrière
        }

        Objet objetChoisi = jeu.getPersonnage().getInventaire().get(choixObjet);
        int action = ihm.demanderActionObjet();

        if (action == 1) {
            jeu.getPersonnage().jeterObjet(objetChoisi);
        } else if (action == 2) {
            if (objetChoisi instanceof ObjetConsommable) {
                jeu.getPersonnage().consommerObjet((ObjetConsommable) objetChoisi);
            } else if (objetChoisi instanceof ObjetEquipable) {
                jeu.getPersonnage().equiperObjet((ObjetEquipable) objetChoisi);
            }
        }
    }

    private Personnage configurerPersonnage(Theme theme) {
        String typePersonnage;
        if (theme instanceof ThemeMedieval) {
            typePersonnage = ihm.demanderTypePersonnageMédieval();
        } else if (theme instanceof ThemePrehistorique) {
            typePersonnage = ihm.demanderTypePersonnagePrehistorique();
        } else {
            return new Personnage(100, 10, 10, 10); // Valeur par défaut si aucun thème n'est reconnu
        }
        return theme.configurerPersonnage(typePersonnage);
    }

}



