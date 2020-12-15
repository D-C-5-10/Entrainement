package Animaux;

public abstract class Animal {

    protected String nomAnimal;
    protected TypeAnimal typeAnim;

    //Getters et Setters
    public TypeAnimal getTypeAnim() {
        return typeAnim;
    }

    public void setTypeAnim(TypeAnimal typeAnim) {
        this.typeAnim = typeAnim;
    }

    public String getNomAnimal() {
        return nomAnimal;
    }

    public void setNomAnimal(String nomAnimal) {
        this.nomAnimal = nomAnimal;
    }


}
