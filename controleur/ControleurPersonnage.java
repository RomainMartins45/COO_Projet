package controleur;

import java.util.List;

import modele.Objet;
import modele.ObjetConsommable;
import modele.ObjetEquipable;
import modele.Personnage;
import vue.Ihm;

public class ControleurPersonnage {
    private Personnage personnage;
    private Ihm ihm;

    public ControleurPersonnage(Personnage personnage, Ihm ihm) {
        this.personnage = personnage;
        this.ihm = ihm;
    }

    public void gererInventaire() {
        int choixObjet = ihm.choisirObjetDansInventaire(personnage.getInventaire());
        if (choixObjet < 0 || choixObjet >= personnage.getInventaire().size()) {
            return;
        }

        Objet objetChoisi = personnage.getInventaire().get(choixObjet);
        int action = ihm.demanderActionObjet();

        if (action == 1) {
            personnage.jeterObjet(objetChoisi);
        } else if (action == 2) {
            if (objetChoisi instanceof ObjetConsommable) {
                personnage.consommerObjet((ObjetConsommable) objetChoisi);
            } else if (objetChoisi instanceof ObjetEquipable) {
                personnage.equiperObjet((ObjetEquipable) objetChoisi);
            }
        }
    }

}

