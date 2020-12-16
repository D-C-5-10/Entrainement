import Animaux.Chat;
import Animaux.TypeAnimal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import Exception.LimiteVisiteurException;
public class ZooTest {
    static Zoo Z;
    @BeforeClass
    public static void intTests(){
         Z= new Zoo();
        Z.ajouterSecteur(TypeAnimal.CHIEN);
    }
    /**
     * Test unitaire couvrant l'exigence de Limmmite de visiteurs
     * @throws LimiteVisiteurException
     */
    @Test
    public void testerLimitevisiteur() throws LimiteVisiteurException {

        try{
            for(int i=0;i<=10;i++){
                Z.nouveauVisiteur();
            }

        }catch(LimiteVisiteurException e){
            Assert.assertEquals("limite visiteurs est atteint",e.getMessage());
        }
    }
}