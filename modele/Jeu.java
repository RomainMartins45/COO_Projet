package modele;

import java.util.List;

public class Jeu {
    private Theme theme;
    private Personnage personnage;

    public Jeu(Theme theme) {
        this.theme = theme;
    }

    public void demarrerJeu() {

        // List<Zone> zones = theme.configurerZones();
        // List<Objet> objets = theme.configurerObjets();
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public void setPersonnage(Personnage personnage) {
        this.personnage = personnage;
    }

    public Personnage getPersonnage() {
        return personnage;
    }
}

