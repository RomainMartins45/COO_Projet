package modele;

public class GuerrierDecorator extends PersonnageDecorator {

    public GuerrierDecorator(Personnage personnage) {
        super(personnage);
    }

    @Override
    public void changeForce() {
        // Logique spécifique pour augmenter la force d'un guerrier
    }
}

