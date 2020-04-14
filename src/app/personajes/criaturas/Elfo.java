package app.personajes.criaturas;

import app.armas.Arma;
import app.interfaces.IHaceMagia;
import app.interfaces.ILlevaReliquia;
import app.personajes.Personaje;
import app.reliquias.Reliquia;

public class Elfo extends Criatura implements IHaceMagia, ILlevaReliquia {

    private int energiaMagica;
    private Reliquia reliquia;

    public Elfo() {
        
    }

    public Elfo(String nombre, int salud, int stamina) {
        super(nombre, salud, stamina);
        
    }

    public Elfo(String nombre, int salud, int stamina, int energiaMagica, Reliquia reliquia) {
        super(nombre, salud, stamina);
        this.energiaMagica = energiaMagica;
        this.reliquia = reliquia;
    }

    public Elfo(String nombre, int salud, int stamina, int energiaMagica) {
        super(nombre, salud, stamina);
        this.energiaMagica = energiaMagica;
    }

    public int getEnergiaMagica() {
        return energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }   

    public Reliquia getReliquia() {
        return reliquia;
    }

    public void setReliquia(Reliquia reliquia) {
        this.reliquia = reliquia;
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