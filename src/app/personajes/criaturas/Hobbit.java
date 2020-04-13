package app.personajes.criaturas;

import app.interfaces.ILlevaReliquia;
import app.reliquias.Reliquia;


public class Hobbit extends Criatura implements ILlevaReliquia {

    private Reliquia reliquia;

    public Hobbit(String nombre, int salud, int stamina) {
        super(nombre, salud, stamina);

    }

    public Reliquia getReliquia() {
        return reliquia;
    }

    public void setReliquia(Reliquia reliquia) {
        this.reliquia = reliquia;
    }
    

}