package modele;

public class PotionDeSoin implements ObjetConsommable {
    private String nom;
    @Override
    public void consommer(Personnage personnage) {
        personnage.setVie(personnage.getVie() + 30);
    }

    @Override
    public String toString(){
        return "Potion de soin";
    }
}

