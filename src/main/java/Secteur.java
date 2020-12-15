
import Animaux.*;

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
    public void ajouterAnimal(Animal A){
        this.animauxDansSecteur.add(A);
    }
    public int getNombreAnimaux(){
        return this.animauxDansSecteur.size();
    }
    public TypeAnimal obtenirType(){
        return this.typeAnimauxDansSecteur;
    }


}
