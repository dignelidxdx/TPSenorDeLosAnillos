package app.personajes.humanos;

import app.armas.Arma;
import app.interfaces.IHaceMagia;
import app.personajes.Personaje;
import app.reliquias.Reliquia;

public class Wizard extends Humano implements IHaceMagia {

    private int energiaMagica;
    
    public Wizard() {
        this.setSalud(70);
        this.setEnergiaMagica(90);
    }

    public Wizard(String nombre, int salud, int stamina, Reliquia reliquia, int energiaMagica) {
        super(nombre, salud, stamina, reliquia);
        this.setEnergiaMagica(90);
    }
    public Wizard(String nombre, int stamina) {
        super(nombre, stamina);
        super.setSalud(70);
        this.setEnergiaMagica(90);
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

        int vidaActual = 0;
        vidaActual = personaje.getSalud() - arma.getDanio() -10; 
        personaje.setSalud(vidaActual);

        System.out.println("Ejecute un ataque epico a: " + personaje.getNombre() + " y quedo con vida: " 
        + personaje.getSalud());

    }
}
