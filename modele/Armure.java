package modele;

public class Armure implements ObjetEquipable {
    private String nom;
    private int bonusVie;

    public Armure(String nom,int bonusVie) {
        this.nom = nom;
        this.bonusVie = bonusVie;
    }

    @Override
    public void equiper(Personnage personnage) {
        if (personnage.getArmure() != null) {
            personnage.getInventaire().add(personnage.getArmure());
        }
        personnage.setArmure(this);
        personnage.setVie(personnage.getVie() + bonusVie);
    }
}


