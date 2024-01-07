package modele;

import java.util.List;

public class Jeu {
    private Theme theme;

    public Jeu(Theme theme) {
        this.theme = theme;
    }

    public void demarrerJeu() {
        Personnage personnage = theme.configurerPersonnage();
        List<Zone> zones = theme.configurerZones();
        List<Objet> objets = theme.configurerObjets();
    }
}

