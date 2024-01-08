import controleur.ControleurPrincipal;
import modele.*;
import vue.Ihm;

public class Main {
    public static void main(String[] args) {
        Ihm ihm = new Ihm();
        Theme themeMedieval = new ThemeMedieval(); 

        Jeu jeu = new Jeu(themeMedieval);

        ControleurPrincipal controleur = new ControleurPrincipal(jeu, ihm);

        controleur.demarrer(); 
    }
}
