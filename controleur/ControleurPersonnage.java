package controleur;

import java.util.List;

import modele.Objet;
import modele.Personnage;
import vue.Ihm;

public class ControleurPersonnage {
    private Personnage personnage;
    private Ihm ihm;

    public ControleurPersonnage(Personnage personnage, Ihm ihm) {
        this.personnage = personnage;
        this.ihm = ihm;
    }

    public void afficherInventaire() {
        List<Objet> inventaire = personnage.getInventaire();
        ihm.afficherInventaire(inventaire);
    }
}

