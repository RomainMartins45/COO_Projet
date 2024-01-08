package vue;

import java.util.Scanner;

import modele.Ennemi;
import modele.Objet;
import modele.Personnage;
import modele.Zone;

import java.util.List;

public class Ihm {
    private Scanner scanner;
    private Personnage personnage;

    public Ihm(Personnage p) {
        this.scanner = new Scanner(System.in);
    }

    public void afficherMenuPrincipal() {
        System.out.println("Bienvenue dans le RPG!");
        System.out.println("1. Commencer une nouvelle partie");
        System.out.println("2. Charger une partie");
        System.out.println("3. Quitter");
        System.out.print("Choisissez une option: ");
    }

    public int recueillirChoixUtilisateur() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1; // Retourner une valeur qui indique une entrée invalide
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

    public void afficherInventaire(List<Objet> inventaire) {
        if (inventaire.isEmpty()) {
            System.out.println("Votre inventaire est vide.");
        } else {
            System.out.println("Inventaire :");
            for (Objet objet : inventaire) {
                System.out.println("- " + objet);
            }
        }
    }

    public void afficherEtatCombat(String etat) {
        System.out.println(etat);
    }

    public void afficherFinJeu(String message) {
        System.out.println(message);
    }

    public void nettoyerEcran() {
        // Ceci est une façon simpliste de "nettoyer" la console en Java, 
        // cela ne fonctionnera pas dans toutes les consoles ou environnements.
        for (int i = 0; i < 50; i++) System.out.println();
    }

    public void fermer() {
        scanner.close();
    }

    public void afficherEtatExploration(Zone zoneActuelle) {
    System.out.println("Vous explorez: " + zoneActuelle.getNom());
    }

    public int demanderChoixObjet(List<Objet> inventaire) {
        if (inventaire.isEmpty()) {
            System.out.println("Votre inventaire est vide.");
            return -1; // Retourne -1 pour indiquer qu'il n'y a pas de choix disponible
        }

        System.out.println("Sélectionnez un objet à jeter:");
        for (int i = 0; i < inventaire.size(); i++) {
            System.out.println(i + 1 + ". " + inventaire.get(i)); // Affiche chaque objet avec un index
        }

        System.out.println("Entrez le numéro de l'objet à jeter (ou 0 pour annuler):");
        int choix = scanner.nextInt() - 1; // Soustrait 1 pour obtenir l'index basé sur zéro

        // Vérification de la validité de l'entrée
        if (choix >= 0 && choix < inventaire.size()) {
            return choix; // Retourne l'index valide de l'objet choisi
        } else {
            return -1; // Retourne -1 si le choix est invalide
        }
    }
    
    public void afficherResultatAction(String resultat) {
        System.out.println(resultat);
    }

    public void afficherMessage(String message) {
        System.out.println(message);
    }

}

