package modele;

import java.util.List;

public interface Theme {
    Personnage configurerPersonnage();
    List<Zone> configurerZones();
    List<Objet> configurerObjets();
}

