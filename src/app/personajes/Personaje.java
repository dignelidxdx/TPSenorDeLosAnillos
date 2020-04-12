package app.personajes;

import java.util.ArrayList;
import java.util.List;
import app.armas.Arma;

/**
 * Personaje
 */
public class Personaje {

    private String nombre;
    private int salud;
    private int stamina;

    private List<Arma> armas = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public List<Arma> getArmas() {
        return armas;
    }

    public void setArmas(List<Arma> armas) {
        this.armas = armas;
    }

    public boolean estaVivo() {
        return false;

    }

    public void atacar(Personaje personaje) {
        System.out.println("El personaje empezo a atacar");
}

}





    

     

    

    

    