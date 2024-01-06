package modele;

import java.util.List;

public class Personnage {
    private int vie;
    private int force;
    private int dexterite;
    private int intelligence;
    private Arme arme;
    private Armure armure;
    private Chaussures chaussures;
    private List<Objet> inventaire;

    public Personnage() {
        // Initialisation des attributs si nécessaire
    }

    public void attaquer(Ennemi ennemi) {
        // Implémentation de l'attaque
    }

    public void afficherInventaire() {
        // Afficher l'inventaire
    }

    public void consommerObjet(ObjetConsommable objet) {
        // Consommer l'objet
    }

    public void equiperObjet(ObjetEquipable objet) {
        // Équiper l'objet
    }

    public void jeterObjet(Objet objet) {
        // Jeter l'objet de l'inventaire
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

    public int getDexterite() {
        return dexterite;
    }

    public void setDexterite(int dexterite) {
        this.dexterite = dexterite;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public Arme getArme() {
        return arme;
    }

    public void setArme(Arme arme) {
        this.arme = arme;
    }

    public Armure getArmure() {
        return armure;
    }

    public void setArmure(Armure armure) {
        this.armure = armure;
    }

    public Chaussures getChaussures() {
        return chaussures;
    }

    public void setChaussures(Chaussures chaussures) {
        this.chaussures = chaussures;
    }

    public List<Objet> getInventaire() {
        return inventaire;
    }

    public void setInventaire(List<Objet> inventaire) {
        this.inventaire = inventaire;
    }
}

