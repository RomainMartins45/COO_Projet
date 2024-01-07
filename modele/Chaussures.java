package modele;

public class Chaussures implements ObjetEquipable {
    private int bonusAgilite;

    public Chaussures(int bonusAgilite) {
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

