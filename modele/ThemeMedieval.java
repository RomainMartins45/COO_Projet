package modele;

import java.util.List;

public class ThemeMedieval implements Theme {

    @Override
    public Personnage configurerPersonnage(String typePersonnage) {
        switch (typePersonnage) {
            case "Mage":
                return new MageDecorator(new Personnage(100, 10, 10, 20), 50);
            case "Guerrier":
                return new GuerrierDecorator(new Personnage(100, 20, 15, 5));
            default:
                return new Personnage(100, 10, 10, 10);
        }
    }

    @Override
    public List<Zone> configurerZones() {
        // Retourne une liste de zones configurées pour un thème médiéval
    }

    @Override
    public List<Objet> configurerObjets() {
        // Retourne une liste d'objets configurés pour un thème médiéval
    }
}

