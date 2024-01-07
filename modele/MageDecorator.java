package modele;

public class MageDecorator extends PersonnageDecorator {
    private int puissanceMagique; // Cela pourrait représenter le bonus de puissance magique

    public MageDecorator(Personnage personnage, int puissanceMagique) {
        super(personnage);
        this.puissanceMagique = puissanceMagique;
    }

    @Override
    public void changeForce(int amount) {
        // Ne change pas la force
    }

    @Override
    public void changeDexterite(int amount) {
        // Ne change pas la dexterite
    }

    @Override
    public void changeVie(int amount) {
        int currentVie = personnage.getVie();
        personnage.setVie(currentVie + amount);
    }

    @Override
    public void changeIntelligence(int amount) {
        int currentIntelligence = personnage.getIntelligence();
        personnage.setIntelligence(currentIntelligence + amount + puissanceMagique);
    }

    public int getPuissanceMagique() {
        return puissanceMagique;
    }

    public void setPuissanceMagique(int puissanceMagique) {
        this.puissanceMagique = puissanceMagique;
    }
}



