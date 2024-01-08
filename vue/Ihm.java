package vue;

import java.util.Scanner;

import modele.Ennemi;
import modele.Objet;
import modele.Personnage;
import modele.Theme;
import modele.ThemeMedieval;
import modele.ThemePrehistorique;
import modele.Zone;

import java.util.List;

public class Ihm {
    private Scanner scanner;

    public Ihm() {
        this.scanner = new Scanner(System.in);
    }

    public void afficherMenuPrincipal() {
        System.out.println("Bienvenue dans le RPG!");
        System.out.println("1. Commencer une nouvelle partie");
        System.out.println("2. Quitter");
        System.out.print("Choisissez une option: ");
    }

    public int recueillirChoixUtilisateur() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

        public void afficherEtatCombat(Personnage joueur, List<Ennemi> ennemis) {
        System.out.println("État du joueur : ");
        System.out.println("Vie : " + joueur.getVie());

        System.out.println("Ennemis :");
        for (int i = 0; i < ennemis.size(); i++) {
            Ennemi ennemi = ennemis.get(i);
            if (ennemi.estVivant()) {
                System.out.println("Ennemi " + (i + 1) + " - Vie : " + ennemi.getVie());
            } else {
                System.out.println("Ennemi " + (i + 1) + " - Défait");
            }
        }

        System.out.println("---------------------------------------------------");
    }

    public void afficherCreationPersonnage() {
        System.out.println("Création du personnage:");
        System.out.print("Entrez le nom de votre personnage: ");
    }

    public String recueillirNomPersonnage() {
        return scanner.nextLine();
    }

    public void afficherChoixTheme(List<String> themes) {
        System.out.println("Choisissez un thème pour votre aventure:");
        for (int i = 0; i < themes.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, themes.get(i));
        }
        System.out.print("Choisissez un thème: ");
    }

    public String demanderTypePersonnageMédieval() {
        System.out.println("Choisissez votre classe de personnage : ");
        System.out.println("1. Mage");
        System.out.println("2. Guerrier");
        System.out.print("Votre choix (1 ou 2): ");

        int choix = scanner.nextInt();
        switch (choix) {
            case 1:
                return "Mage";
            case 2:
                return "Guerrier";
            default:
                System.out.println("Choix invalide. Choisissez 1 pour Mage ou 2 pour Guerrier.");
                return demanderTypePersonnageMédieval();
        }
    }

    public void afficherEtatCombat(String etat) {
        System.out.println(etat);
    }

    public void afficherFinJeu(String message) {
        System.out.println(message);
    }

    public void nettoyerEcran() {
        for (int i = 0; i < 50; i++) System.out.println();
    }

    public void fermer() {
        scanner.close();
    }

    public void afficherEtatExploration(Zone zoneActuelle) {
    System.out.println("Vous explorez: " + zoneActuelle.getNom());
    }

    public int choisirObjetDansInventaire(List<Objet> inventaire) {
        if (inventaire.isEmpty()) {
            System.out.println("Votre inventaire est vide.");
            return -1;
        }

        System.out.println("Votre inventaire :");
        for (int i = 0; i < inventaire.size(); i++) {
            System.out.println((i + 1) + ". " + inventaire.get(i));
        }

        System.out.print("Choisissez un objet (ou 0 pour revenir en arrière): ");
        return scanner.nextInt() - 1;
    }

    public int demanderActionObjet() {
        System.out.println("Choisissez une action :");
        System.out.println("1. Jeter l'objet");
        System.out.println("2. Consommer/Équiper l'objet");
        System.out.print("Votre choix (1 ou 2): ");
        return scanner.nextInt();
    }
    
    public void afficherResultatAction(String resultat) {
        System.out.println(resultat);
    }

    public void afficherMessage(String message) {
        System.out.println(message);
    }

    public Theme demanderTheme() {
        System.out.println("Veuillez choisir un thème pour votre jeu :");
        System.out.println("1. Thème Médiéval");
        System.out.println("2. Thème Préhistorique");
        System.out.print("Votre choix (1 ou 2): ");

        int choix = scanner.nextInt();
        switch (choix) {
            case 1:
                System.out.println("Vous avez choisi le thème Mediéval");
                return new ThemeMedieval();
            case 2:
                System.out.println("Vous avez choisi le thème Préhistorique");
                return new ThemePrehistorique();
            default:
                System.out.println("Choix invalide. Veuillez choisir 1 pour Médiéval ou 2 pour Préhistorique.");
                return demanderTheme();
        }
    }

    public String demanderTypePersonnagePrehistorique() {
        System.out.println("Choisissez votre classe de personnage pour le thème Préhistorique : ");
        System.out.println("1. Chasseur");
        System.out.println("2. Chamane");
        System.out.print("Votre choix (1 ou 2): ");

        int choix = scanner.nextInt();
        switch (choix) {
            case 1:
                System.out.println("Vous avez choisi la classe Chasseur");
                return "Chasseur";
            case 2:
                System.out.println("Vous avez choisi la classe Chamane");
                return "Chamane";
            default:
                System.out.println("Choix invalide. Veuillez choisir 1 pour Chasseur ou 2 pour Chamane.");
                return demanderTypePersonnagePrehistorique(); 
        }
    }

    public void afficherMenuSecondaire() {
        System.out.println("Menu Secondaire:");
        System.out.println("1. Entrer dans le donjon");
        System.out.println("2. Gérer l'inventaire");
        System.out.println("3. Voir les statistiques du personnage");
        System.out.println("4. Revenir au menu principal");
    }

    public void afficherStatistiquesPersonnage(Personnage personnage) {
        System.out.println("Statistiques du Personnage:");
        System.out.println("Vie: " + personnage.getVie());
        System.out.println("Force: " + personnage.getForce());
        System.out.println("Dextérité: " + personnage.getDexterite());
        System.out.println("Intelligence: " + personnage.getIntelligence());
        System.out.println("Arme: " + (personnage.getArme() != null ? personnage.getArme() : "Aucune"));
        System.out.println("Armure: " + (personnage.getArmure() != null ? personnage.getArmure() : "Aucune"));
        System.out.println("Chaussures: " + (personnage.getChaussures() != null ? personnage.getChaussures() : "Aucune"));
    }

}

