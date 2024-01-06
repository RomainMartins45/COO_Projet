package modele;

import java.util.List;

public class Jeu {
    private Theme theme;

    public Jeu(Theme theme) {
        this.theme = theme;
    }

    public void demarrerJeu() {
        // Logique de démarrage du jeu avec le thème choisi
        Personnage personnage = theme.configurerPersonnage();
        List<Zone> zones = theme.configurerZones();
        List<Objet> objets = theme.configurerObjets();
        
        // Vous pouvez continuer à initialiser le jeu ici en utilisant les personnages, zones et objets
    }
}

