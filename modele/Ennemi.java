package modele;

public class Ennemi {
    private int vie;
    private int force;

    public Ennemi(int vie, int force) {
        this.vie = vie;
        this.force = force;
    }

    public void attaque(Personnage personnage) {
        // Logique d'attaque contre le personnage
    }

    public boolean aPerdu() {
        // Logique pour déterminer si l'ennemi a perdu (vie <= 0)
        return vie <= 0;
    }

    // Getters et setters si nécessaire
}

