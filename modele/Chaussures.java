package modele;

public class Chaussures implements ObjetEquipable {
    private String nom;
    private int bonusAgilite;

    public Chaussures(String nom,int bonusAgilite) {
        this.nom = nom;
        this.bonusAgilite = bonusAgilite;
    }

    @Override
    public void equiper(Personnage personnage) {
        if (personnage.getChaussures() != null) {
            personnage.getInventaire().add(personnage.getChaussures());
        }
        personnage.setChaussures(this);
        personnage.setDexterite(personnage.getDexterite() + bonusAgilite); 
    }
}

