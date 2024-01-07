package modele;

public abstract class PersonnageDecorator extends Personnage {
    protected Personnage personnage;

    public PersonnageDecorator(Personnage personnage) {
        super(personnage.getVie(), personnage.getForce(), personnage.getDexterite(), personnage.getIntelligence()); // Appel explicite au constructeur parent
        this.personnage = personnage;
    }

    public abstract void changeForce(int amount);
    public abstract void changeDexterite(int amount);
    public abstract void changeVie(int amount);
    public abstract void changeIntelligence(int amount);

    public Personnage getPersonnage() {
        return personnage;
    }

    public void setPersonnage(Personnage personnage) {
        this.personnage = personnage;
    }
}


