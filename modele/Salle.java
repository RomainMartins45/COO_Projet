package modele;

import java.util.List;

public class Salle {
    private List<Objet> objets;
    private List<Ennemi> ennemis;

    public Salle(List<Objet> objets, List<Ennemi> ennemis) {
        this.objets = objets;
        this.ennemis = ennemis;
    }

    public void lancerCombat(Personnage personnage) {
        // Logique pour lancer un combat dans la salle
    }

    public boolean ennemisVaincu() {
        // Logique pour déterminer si tous les ennemis dans la salle ont été vaincus
        return ennemis.stream().allMatch(Ennemi::aPerdu);
    }

    // Getters et setters si nécessaire
}

