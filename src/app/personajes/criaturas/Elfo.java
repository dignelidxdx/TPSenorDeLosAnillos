package app.personajes.criaturas;

import app.armas.Arma;
import app.interfaces.IHaceMagia;
import app.interfaces.ILlevaReliquia;
import app.personajes.Personaje;
import app.reliquias.Reliquia;
import app.reliquias.reliquias_anillos.AnilloNarya;

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

        if(this.getStamina() > 10 && this.getEnergiaMagica() > 20) {
            return true;
        }
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void ataqueEpico(Personaje personaje, Arma arma) {
        // TODO Auto-generated method stub

        Reliquia reliquia = new AnilloNarya("soy anillo", 0.3, 0.3, 20);
        this.setReliquia(reliquia);

        if(this.getStamina() > 10 && this.getEnergiaMagica() > 20) {
         
            int vidaActual = 0;
            vidaActual = (int) (personaje.getSalud() - (arma.getDanio() * (this.getReliquia().getFactorDeAtaque() + 1))); 
            personaje.setSalud(vidaActual);

            int staminaRestante = this.getStamina() - 10;
            this.setStamina(staminaRestante);

            int magiaRestante = this.getEnergiaMagica() - 20;
            this.setEnergiaMagica(magiaRestante);

            System.out.println("Ejecute un ataque epico a: " + personaje.getNombre() + " y quedo con vida: " 
            + personaje.getSalud() + " Soy un elfo feliz");
        } else System.out.println("Uhhh no tienes energia magica o stamina para ejecutar el ataque!");
    }
    
}