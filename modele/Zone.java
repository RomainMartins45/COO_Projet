package modele;

import java.util.List;

public class Zone {
    private int salleActuelle;
    private List<Salle> salles;

    public Zone(List<Salle> salles) {
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

    // Getters et setters si nécessaire
}

