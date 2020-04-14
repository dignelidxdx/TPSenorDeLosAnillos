package app.personajes.humanos;

import app.armas.Arma;
import app.interfaces.IHaceMagia;
import app.personajes.Personaje;
import app.reliquias.Reliquia;

public class Wizard extends Humano implements IHaceMagia {

    private int energiaMagica;
    
    public Wizard() {
        this.energiaMagica = 100;
    }

    public Wizard(String nombre, int salud, int stamina, Reliquia reliquia, int energiaMagica) {
        super(nombre, salud, stamina, reliquia);
        this.energiaMagica = 100;
    }
    public Wizard(String nombre, int salud, int stamina, int energiaMagica) {
        super(nombre, salud, stamina);
        this.energiaMagica = 100;
    }
    
    public int getEnergiaMagica() {
        return energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }

    @Override
    public boolean puedoEjecutarAtaqueEpico() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void ataqueEpico(Personaje personaje, Arma arma) {
        // TODO Auto-generated method stub

    }
}
