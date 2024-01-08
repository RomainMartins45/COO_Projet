package modele;

import java.util.List;

public class Zone {
    private String nom;
    private int salleActuelle;
    private List<Salle> salles;

    public Zone(String nom,List<Salle> salles) {
        this.nom = nom;
        this.salles = salles;
        this.salleActuelle = 0; // Commencez à la première salle par défaut
    }

    public void enterZone(Personnage personnage) {
        // Logique pour entrer dans la zone
    }

    public void sortirZone(Personnage personnage) {
        // Logique pour sortir de la zone
    }

    public void entrerSalle(int numeroSalle) {
        // Logique pour entrer dans une salle spécifique
        this.salleActuelle = numeroSalle;
        // Vous devriez ajouter une validation ici pour vous assurer que le numéro de salle est valide
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getSalleActuelle() {
        return salleActuelle;
    }

    public void setSalleActuelle(int salleActuelle) {
        this.salleActuelle = salleActuelle;
    }

    public List<Salle> getSalles() {
        return salles;
    }

    public void setSalles(List<Salle> salles) {
        this.salles = salles;
    }

    // Getters et setters si nécessaire
}

