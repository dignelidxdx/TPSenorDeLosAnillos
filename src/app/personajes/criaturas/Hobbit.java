package app.personajes.criaturas;

import app.interfaces.ILlevaReliquia;
import app.reliquias.Reliquia;


public class Hobbit extends Criatura implements app.interfaces.ILlevaReliquia {

    private Reliquia reliquia;

    public Reliquia getReliquia() {
        return reliquia;
    }

    public void setReliquia(Reliquia reliquia) {
        this.reliquia = reliquia;
    }
    

}