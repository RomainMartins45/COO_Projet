package modele;

public class GuerrierDecorator extends PersonnageDecorator {
    public GuerrierDecorator(Personnage personnage) {
        super(personnage);
    }

    @Override
    public void changeForce(int amount) {
        int currentForce = personnage.getForce();
        personnage.setForce(currentForce + amount);
    }

    @Override
    public void changeDexterite(int amount) {
        int currentDexterite = personnage.getDexterite();
        personnage.setDexterite(currentDexterite + amount);
    }

    @Override
    public void changeVie(int amount) {
        int currentVie = personnage.getVie();
        personnage.setVie(currentVie + amount);
    }

    @Override
    public void changeIntelligence(int amount) {
        // L'intelligence ne change pas
    }
}


