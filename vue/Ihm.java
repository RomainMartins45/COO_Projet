package vue;

import java.util.Scanner;
import java.util.List;

public class Ihm {
    private Scanner scanner;

    public Ihm() {
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

    public void afficherInventaire(List<String> objets) {
        System.out.println("Votre inventaire:");
        for (int i = 0; i < objets.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, objets.get(i));
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

    // D'autres méthodes pour gérer les différents affichages et entrées utilisateur peuvent être ajoutées ici.
}

