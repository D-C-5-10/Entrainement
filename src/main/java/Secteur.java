
import Animaux.*;
import Exception.*;
import java.util.ArrayList;
import java.util.List;

public class Secteur {
   private TypeAnimal typeAnimauxDansSecteur;
   private List<Animal> animauxDansSecteur ;
   //constructeur
    public Secteur(TypeAnimal typeAnimauxDansSecteur) {
        this.typeAnimauxDansSecteur = typeAnimauxDansSecteur;
        this.animauxDansSecteur = new ArrayList<Animal>();
    }
    //Methodes
    public void ajouterAnimal(Animal A) throws AnimalDansMauvaisSecteurException{
        if(A.getTypeAnim() != typeAnimauxDansSecteur){
            throw new AnimalDansMauvaisSecteurException("Animal dans le mauvais secteur");
        }
        this.animauxDansSecteur.add(A);
    }
    public int getNombreAnimaux(){
        return this.animauxDansSecteur.size();
    }
    public TypeAnimal obtenirType(){
        return this.typeAnimauxDansSecteur;
    }


}
