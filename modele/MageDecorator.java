package modele;

public class MageDecorator extends PersonnageDecorator {
    private int magie;

    public MageDecorator(Personnage personnage) {
        super(personnage);
        this.magie = 0; // Initialiser avec la valeur appropriée
    }

    
    public void changeIntelligence() {
        // Logique spécifique pour augmenter l'intelligence d'un mage
    }

    public int getMagie() {
        return magie;
    }

    public void setMagie(int magie) {
        this.magie = magie;
    }
}

