import Animaux.Animal;
import Animaux.TypeAnimal;
import Exception.*;
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
    public void ajouterSecteur (TypeAnimal T){
        secteurAnimaux.add(new Secteur(T));
    }
    public void nouveauVisiteur() throws LimiteVisiteurException {
        if (this.visiteurs==5){
            throw new LimiteVisiteurException("limite visiteurs est atteint");
        }
        visiteurs++;

    }
    public int getLimitVisiteurs(){
       return visiteurs;
    }
    public void nouvelAnimal(Animal a) throws AnimalDansMauvaisSecteurException {
        getSecteurFromType(a.getTypeAnim()).ajouterAnimal(a);
    }

    public int nombreAnimaux() {
        return secteurAnimaux.stream().mapToInt(x->x.getNombreAnimaux()).sum();
    }

    private Secteur getSecteurFromType(TypeAnimal type) {
        return secteurAnimaux.stream().filter(s -> s.obtenirType() == type).findFirst().orElse(null);
    }
}
