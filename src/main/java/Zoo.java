import Animaux.TypeAnimal;

import java.util.List;

public class Zoo {
    private int visiteurs;
    private List<Secteur> secteurAnimaux;
    //Constructeur
    public Zoo(int visiteur, List<Secteur> secteurAnimaux) {
        this.visiteurs = visiteur;
        this.secteurAnimaux = secteurAnimaux;
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
}
