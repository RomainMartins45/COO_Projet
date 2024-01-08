package modele;

public class ChasseurDecorator extends PersonnageDecorator {
    public ChasseurDecorator(Personnage personnage) {
        super(personnage);
    }

    @Override
    public void changeForce(int amount) {
        personnage.setForce(personnage.getForce() + amount);
    }

    @Override
    public void changeDexterite(int amount) {
        personnage.setDexterite(personnage.getDexterite() + amount);
    }

    @Override
    public void changeVie(int amount) {
        personnage.setVie(personnage.getVie() + amount);
    }

    @Override
    public void changeIntelligence(int amount) {
        personnage.setIntelligence(personnage.getIntelligence() + amount);
    }
}
