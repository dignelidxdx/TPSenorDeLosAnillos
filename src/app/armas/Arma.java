package app.armas;

import java.util.ArrayList;
import java.util.Scanner;

import app.personajes.Personaje;

public class Arma {
    public static Scanner Teclado = new Scanner(System.in);

    // atributos

    private String nombre;
    private int danio;
    private int stamina;

    // constructores

    public Arma() {

    }

    public Arma(String nombre, int danio, int stamina) {

        this.nombre = nombre;
        this.danio = danio;
        this.stamina = stamina;

    }

    public ArrayList<Arma> inventario = new ArrayList<>();

    private int energiaMagica;

    public Arma chequearInventario(Arma chequeoDeInventario) {

        Anduril anduril = new Anduril("Anduril", 25, 15, 15);
        inventario.add(anduril);
        ArcoYFlecha arcoYFlecha = new ArcoYFlecha("Arco y Flecha", 10, 8);
        inventario.add(arcoYFlecha);
        Baculo baculo = new Baculo("Baculo", 50, 30, 50);
        inventario.add(baculo);
        Espada espada = new Espada("Espada", 35, 20);
        inventario.add(espada);
        HachaDoble hachaDoble = new HachaDoble("Hacha Doble", 30, 30);
        inventario.add(hachaDoble);
        Sting sting = new Sting("Sting", 20, 20, 25);
        inventario.add(sting);
        return chequeoDeInventario;

    }


    public void clavarEspada(Personaje personajeAtacado) {
        System.out.println("¿Qué espada va a usar? 1. Anduril, 2. Sting o 3. Espada común");
        int choice = Teclado.nextInt();
        switch (choice) {
            case 1:
            personajeAtacado.setSalud(personajeAtacado.getSalud() - this.danio);
            personajeAtacado.setEnergiaMagica(personajeAtacado.getEnergiaMagica() - this.energiaMagica);
            System.out.println("¡Te clavé un Anduril Mágico!");
                break;
        
            case 2:
            personajeAtacado.setSalud(personajeAtacado.getSalud() - this.danio);
            personajeAtacado.setEnergiaMagica(personajeAtacado.getEnergiaMagica() - this.energiaMagica);
            System.out.println("¡Te clavé un Sting Mágico!");
            break;

            case 3:
            personajeAtacado.setSalud(personajeAtacado.getSalud() - this.danio);
            System.out.println("¡Te clavé una Espada!");
            break;

            default: 
            System.out.println("Opción inválida, ingrese 1 2 o 3.");
                break;
        }        
        

    }

    public void dispararFlecha(Personaje personajeAtacado) {
        for (int flechas = 5; flechas < 1; flechas--) {
            personajeAtacado.setSalud(personajeAtacado.getSalud()- this.danio);
            System.out.println("¡Justo en el blanco! Daño: 10, Stamina: 8. Te quedan " + flechas + "flechas por usar.");

        }

    }

    public void clavarHacha(Personaje personajeAtacado) { 
        personajeAtacado.setSalud(personajeAtacado.getSalud() - this.danio);
        System.out.println("¡Cortado en pedacitos!");

    }

    public void usarBaculo(Personaje personajeAtacado) { 
        personajeAtacado.setStamina(personajeAtacado.getStamina() - this.danio);
        System.out.println("He usado un báculo");


    }

    // atributos con getters and setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public int getDanio() {
        return danio;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }

    public static Scanner getTeclado() {
        return Teclado;
    }

    public static void setTeclado(Scanner teclado) {
        Teclado = teclado;
    }

    public ArrayList<Arma> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Arma> inventario) {
        this.inventario = inventario;
    }

}