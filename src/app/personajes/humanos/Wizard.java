package app.personajes.humanos;

import app.interfaces.IHaceMagia;

public class Wizard extends Humano implements IHaceMagia {

    public Wizard(){
        this.energiaMagica = 100;    }


    private int energiaMagica;

    public int getEnergiaMagica() {
        return energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }
}
