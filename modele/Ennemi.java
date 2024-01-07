package modele;

public class Ennemi {
    private int vie;
    private int force;

    public Ennemi(int vie, int force) {
        this.vie = vie;
        this.force = force;
    }

    public void attaque(Personnage personnage) {
        int degats = this.force; 
        personnage.recevoirDegats(degats);
    }

    public void recevoirDegats(int degats) {
        this.vie -= degats;
        if (this.vie <= 0) {
            this.vie = 0;

        }
    }

    public boolean estVivant() {
        return this.vie > 0;
    }

    public boolean aPerdu() {
        return vie <= 0;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }
}

