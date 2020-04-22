package app.personajes.humanos;

import app.armas.Arma;
import app.interfaces.IHaceMagia;
import app.personajes.Personaje;
import app.reliquias.Reliquia;
import app.reliquias.reliquias_anillos.AnilloNarya;

public class Wizard extends Humano implements IHaceMagia {

    private int energiaMagica;
    
    public Wizard() {
        this.setSalud(70);
        this.setEnergiaMagica(25);
    }

    public Wizard(String nombre, int salud, int stamina, Reliquia reliquia, int energiaMagica) {
        super(nombre, salud, stamina, reliquia);
        this.setEnergiaMagica(90);
    }
    public Wizard(String nombre, int stamina) {
        super(nombre, stamina);
        super.setSalud(70);
        this.setEnergiaMagica(25);
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
        if(this.getStamina() > 10 && this.getEnergiaMagica() > 5) {
            return true;
        } else return false;      
    }

    int cont = 2;

    public void usarRevivir() {
        
        if(cont > 0) {
            int vidaxCurar = (int) (this.getSalud() + 15);
            this.setSalud(vidaxCurar);
            cont--;
        } else System.out.println("Uhh ya no tienes revivir!");
        
    }

    @Override
    public void ataqueEpico(Personaje personaje, Arma arma) {

        if(puedoEjecutarAtaqueEpico()) {        
         
            int vidaActual = 0;
            vidaActual = (int) (personaje.getSalud()
                    - (arma.getDanio() * (this.getReliquia().getFactorDeAtaque() + 1)));
            personaje.setSalud(vidaActual);

            int staminaRestante = this.getStamina() - 10;
            this.setStamina(staminaRestante);

            int magiaRestante = this.getEnergiaMagica() - 5;
            this.setEnergiaMagica(magiaRestante);

            System.out.println("Ejecute un ataque epico a: " + personaje.getNombre() + " y quedo con vida: " 
            + personaje.getSalud() + " Soy un wizard feliz");

        } else System.out.println("Uhh no tienes magia o stamina!!");
    }
    



}
