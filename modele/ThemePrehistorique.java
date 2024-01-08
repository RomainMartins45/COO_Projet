package modele;

import java.util.List;

public class ThemePrehistorique implements Theme {

    @Override
    public Personnage configurerPersonnage(String typePersonnage) {
        switch (typePersonnage) {
            case "Chasseur":
                // Supposons que le Chasseur ait plus de force et de dextérité
                return new ChasseurDecorator(new Personnage(100, 20, 15, 5));
            case "Chamane":
                // Supposons que le Chamane ait plus d'intelligence et de capacités spéciales
                return new ChamaneDecorator(new Personnage(100, 5, 10, 20));
            default:
                // Retourne un personnage par défaut si le choix est invalide
                return new Personnage(100, 10, 10, 10);
        }
    }

    @Override
    public List<Zone> configurerZones() {
        // Retourne une liste de zones configurées pour un thème préhistorique
    }

    @Override
    public List<Objet> configurerObjets() {
        // Retourne une liste d'objets configurés pour un thème préhistorique
    }
}

