package modele;

import java.util.List;

public interface Theme {
    Personnage configurerPersonnage(String typePersonnage);
    List<Zone> configurerZones();
    List<Objet> configurerObjets();
}

