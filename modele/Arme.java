package modele;

public class Arme implements ObjetEquipable {
    private String nom;
    private int bonusDegats;

    public Arme(String nom,int bonusDegats) {
        this.nom = nom;
        this.bonusDegats = bonusDegats;
    }

    @Override
    public void equiper(Personnage personnage) {
        if (personnage.getArme() != null) {
            personnage.getInventaire().add(personnage.getArme());
        }
        personnage.setArme(this);
        personnage.setForce(personnage.getForce() + bonusDegats);
    }
}


