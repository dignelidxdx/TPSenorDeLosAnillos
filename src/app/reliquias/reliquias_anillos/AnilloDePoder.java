package app.reliquias.reliquias_anillos;

import app.interfaces.IEsMagico;
import app.reliquias.Reliquia;

public class AnilloDePoder extends Reliquia implements IEsMagico {

    //**Constructor */

    public AnilloDePoder() {
        
    }

    public AnilloDePoder(String nombre, double factorDeAtaque, double factorDeDefensa, int energiaMagica) {
        super(nombre, factorDeAtaque, factorDeDefensa);
        this.setEnergiaMagica(energiaMagica);
    }

    //Atributo, getter y setter
    
    private int energiaMagica;
    public int getEnergiaMagica() {
        return energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = 20;
    }
}