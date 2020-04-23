package app.personajes.humanos;

import app.JuegoLOTR;
import app.armas.Arma;
import app.interfaces.ILlevaReliquia;
import app.personajes.Personaje;
import app.reliquias.Reliquia;

public class Humano extends Personaje implements ILlevaReliquia {

    private Reliquia reliquia;

    public Humano() {
    }

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

    private Arma arma;
    @Override
    public Arma getArma() {
        // TODO Auto-generated method stub
        return arma;
    }

    @Override
    public void setArma(Arma arma) {

        this.arma = arma;

        // TODO Auto-generated method stub
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

    @Override
    public Reliquia getReliquia() {
        // TODO Auto-generated method stub
        return null;
    }

    public void seleccionReliquiaPrincipal() {
        System.out.println("Selecciona tu reliquia " + this.getNombre());
        int respuesta= JuegoLOTR.elegirReliquia();
        Reliquia reliquiaActual = JuegoLOTR.reliquias.get(respuesta - 1);
        this.setReliquia(reliquiaActual);

        System.out.println(" Tu reliquia es: " + this.getReliquia().getNombre());
    }
    
}