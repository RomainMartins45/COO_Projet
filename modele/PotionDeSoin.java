package modele;

public class PotionDeSoin implements ObjetConsommable {
    @Override
    public void consommer(Personnage personnage) {
        personnage.setVie(personnage.getVie() + 30);
    }

    @Override
    public String toString(){
        return "Potion de soin";
    }
}

