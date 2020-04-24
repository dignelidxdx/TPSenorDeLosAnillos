package app.armas;

import java.util.Scanner;


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


}