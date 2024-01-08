package controleur;

import java.util.List;

import modele.Objet;
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

    public void afficherInventaire() {
        List<Objet> inventaire = personnage.getInventaire();
        ihm.afficherInventaire(inventaire);
    }

    public void equiperObjet(ObjetEquipable objet) {
        personnage.equiperObjet(objet);
        ihm.afficherMessage("Objet équipé : " + objet);
    }

    public void jeterObjet() {
        int choix = ihm.demanderChoixObjet(personnage.getInventaire());

        // Vérifier si le choix est valide
        if (choix >= 0 && choix < personnage.getInventaire().size()) {
            Objet objetAJetee = personnage.getInventaire().get(choix);
            personnage.jeterObjet(objetAJetee);
            ihm.afficherMessage("Vous avez jeté : " + objetAJetee);
        } else {
            ihm.afficherMessage("Choix invalide.");
        }
    }

    

}

