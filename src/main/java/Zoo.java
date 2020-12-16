import Animaux.Animal;
import Animaux.TypeAnimal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private int visiteurs;
    private List<Secteur> secteurAnimaux;
    //Constructeur
    public Zoo() {
        visiteurs = 0;
        this.secteurAnimaux = new ArrayList<Secteur>();
    }
    //Methodes
    public void ajouterSecteur(TypeAnimal T){
        secteurAnimaux.add(new Secteur(T));
    }
    public void nouveauVisiteur(){
        visiteurs++;
    }
    public int getLimitVisiteurs(){
       return visiteurs;
    }
    public void nouvelAnimal(Animal a) {
        getSecteurFromType(a.getTypeAnim()).ajouterAnimal(a);
    }

    public int nombreAnimaux() {
        return secteurAnimaux.stream().mapToInt(x->x.getNombreAnimaux()).sum();
    }

    private Secteur getSecteurFromType(TypeAnimal type) {
        return secteurAnimaux.stream().filter(s -> s.obtenirType() == type).findFirst().orElse(null);
    }
}
