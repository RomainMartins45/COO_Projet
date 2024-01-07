package modele;

import java.util.ArrayList;
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

    public Personnage(int vie, int force, int dexterite, int intelligence) {
        this.vie = vie;
        this.force = force;
        this.dexterite = dexterite;
        this.intelligence = intelligence;
        this.arme = null;
        this.armure = null;
        this.chaussures = null;
        this.inventaire = new ArrayList<>(); 
    }

    public void attaquer(Ennemi ennemi) {
        int degats = this.force;
        ennemi.recevoirDegats(degats);
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

    public void consommerObjet(ObjetConsommable objet) {
        if (inventaire.contains(objet)) {
            objet.consommer(this);
            inventaire.remove(objet);
        } else {
            System.out.println("Vous ne pouvez pas consommer un objet que vous n'avez pas !");
        }
    }

    public void equiperObjet(ObjetEquipable objet) {
        objet.equiper(this); 
    }

    public void jeterObjet(Objet objet) {
        if (inventaire.contains(objet)) {
            inventaire.remove(objet);
            System.out.println("Objet jeté : " + objet);
        } else {
            System.out.println("L'objet à jeter n'est pas dans l'inventaire.");
        }
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

