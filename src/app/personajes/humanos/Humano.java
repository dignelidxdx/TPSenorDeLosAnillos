package app.personajes.humanos;

import app.interfaces.ILlevaReliquia;
import app.personajes.Personaje;
import app.reliquias.Reliquia;


public class Humano extends Personaje implements ILlevaReliquia {

    private Reliquia reliquia;

    public Humano() { }

    public Humano(String nombre, int salud, int stamina, Reliquia reliquia) {
        super(nombre, salud, stamina);
        this.reliquia = reliquia;
    }  
    public Humano(String nombre, int salud, int stamina) {
        super(nombre, salud, stamina);        
    }  
    public Humano(String nombre, int stamina) {
        super(nombre, stamina);        
    }  

    public Reliquia getReliquia() {
        return reliquia;
    }

    public void setReliquia(Reliquia reliquia) {
        this.reliquia = reliquia;
    }

    public void regeneracionVida(Humano personaje) {
        int regVida = personaje.getSalud() + 8; 
        personaje.setSalud(regVida);
    }

    public void usarRevivir() {
        
    }

    
}