package app.personajes.criaturas;

import app.interfaces.IHaceMagia;
import app.interfaces.ILlevaReliquia;

public class Elfo extends Criatura implements IHaceMagia, ILlevaReliquia {

    private int energiaMagica;

    public int getEnergiaMagica() {
        return energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }
}