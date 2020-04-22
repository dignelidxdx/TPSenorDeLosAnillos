package app.personajes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.armas.Arma;
import app.interfaces.IEsMagico;
import app.interfaces.IHaceMagia;
import app.interfaces.ILlevaReliquia;
import app.reliquias.Reliquia;

/**
 * Personaje
 */
public class Personaje {

    public static Scanner Teclado = new Scanner(System.in);

    private String nombre;
    private int salud;
    private int stamina;
    private int defensa;
    private boolean seleccionado;
    private Arma llevaArma;

    private List<Arma> armas = new ArrayList<>();

    public Personaje() {    }

    public Personaje(String nombre, int salud, int stamina) {
        this.nombre = nombre;
        this.salud = salud;
        this.stamina = stamina;
    }
    public Personaje(String nombre, int stamina) {
        this.nombre = nombre;
        this.stamina = stamina;
    }

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

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public boolean isSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(boolean seleccionado) {
        this.seleccionado = seleccionado;
    }

    public boolean estaVivo() {

        if (this.getSalud() == 0 || this.getSalud() < 1) {
            return false;
        }
        return true;
    }

    public void atacar(Personaje atacado, Arma armaAtacante) {
       
        if(this.getStamina() > armaAtacante.getStamina()){

            int vidaActual = 0;

            vidaActual = atacado.getSalud() - armaAtacante.getDanio(); 
            atacado.setSalud(vidaActual);

            int staminaAtacante = 0;

            staminaAtacante = this.getStamina() - armaAtacante.getStamina();
            this.setStamina(staminaAtacante);

        } else usarPosion(this);         

    }

   
    public void regeneracionVida() {
        int regVida = this.getSalud() + 5; 
        this.setSalud(regVida);
    }

    public void regeneracionStamina() {
        int regStamina = this.getStamina() + 5; 
        this.setStamina(regStamina);
    }

	public void usarRevivir() {
        int vidaxCurar = (int) (this.getSalud() + 20);
        this.setSalud(vidaxCurar);
    }
    
    public void usarPosionStamina(Personaje atacante) {
        int usoPosion = atacante.getStamina() + 50; 
        atacante.setStamina(usoPosion);
    }

    public void usarPosion(Personaje personaje){

        System.out.println("Huy no tienes Stamina, quieres usar posion??");
        System.out.println("Elige 1. si estas de acuerdo!");
        
        int respuesta = Teclado.nextInt();
        switch(respuesta){
            case 1:
                usarPosionStamina(personaje);
            break;
            default:
            break;
        }

    }

}





    

     

    

    

    