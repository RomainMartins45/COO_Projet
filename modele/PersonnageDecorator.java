package modele;

public abstract class PersonnageDecorator extends Personnage {
    protected Personnage personnage;

    public PersonnageDecorator(Personnage personnage) {
        this.personnage = personnage;
    }

    public void changeForce() {
        // Modifier la force
    }

    public void changeDexterite() {
        // Modifier la dextérité
    }

    public void changeComposition() {
        // Modifier la composition
    }

    public void changeVie() {
        // Modifier la vie
    }

    public Personnage getPersonnage() {
        return personnage;
    }

    public void setPersonnage(Personnage personnage) {
        this.personnage = personnage;
    }
}

