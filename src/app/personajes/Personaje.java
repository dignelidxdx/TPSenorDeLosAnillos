package app.personajes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import app.JuegoLOTR;
import app.armas.Arma;
import app.interfaces.ILlevaArma;

/**
 * Personaje
 */
public class Personaje implements ILlevaArma {

    public static Scanner Teclado = new Scanner(System.in);    
    public static Random random = new Random();
    private String nombre;
    private int salud;
    private int stamina;
    private int defensaBase;
    private boolean seleccionado;
    private double factorDeVelocidadDeAtaque;
    private double factorRegeneracionSalud;
    private double factorRegeneracionStamina;
    private int danioDeAtaque;
    private Arma arma;
    private List<Arma> armas = new ArrayList<>();

    public Personaje() {
    }

    public Personaje(String nombre, int salud, int stamina) {
        this.nombre = nombre;
        this.salud = salud;
        this.stamina = stamina;
    }

    public Personaje(String nombre, int stamina) {
        this.nombre = nombre;
        this.stamina = stamina;
    }

    // agrego factorDeVelocidadDeAtaque. Aca seria la base necesaria para que el
    // ataqueEpico de Vilya tenga sentido y, por cierto, funcione jaja.

    public double getFactorDeVelocidadDeAtaque() {
        return factorDeVelocidadDeAtaque;
    }

    public void setFactorDeVelocidadDeAtaque(double factorDeVelocidadDeAtaque) {
        this.factorDeVelocidadDeAtaque = 0.15;
    }

    // agrego factorRegeneracionSalud.

    public double getFactorRegeneracionSalud() {
        return factorRegeneracionSalud;
    }

    public void setFactorRegeneracionSalud(double factorRegeneracionSalud) {
        this.factorRegeneracionSalud = factorRegeneracionSalud;
    }

    // agrego factorRegeneracionStamina

    public double getFactorRegeneracionStamina() {
        return factorRegeneracionStamina;
    }

    public void setFactorRegeneracionStamina(double factorRegeneracionStamina) {
        this.factorRegeneracionStamina = factorRegeneracionStamina;
    }

    // agrego danioDeAtaque

    public int getDanioDeAtaque() {
        return danioDeAtaque;
    }

    public void setDanioDeAtaque(int danioDeAtaque) {
        this.danioDeAtaque = danioDeAtaque;
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

    public int getDefensaBase() {
        return defensaBase;
    }

    public void setDefensaBase(int defensaBase) {
        this.defensaBase = defensaBase;
    }

    public List<Arma> getArmas() {
        return armas;
    }

    public void setArmas(List<Arma> armas) {
        this.armas = armas;
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

        if (this.getStamina() > armaAtacante.getStamina()) {

            atacado.setSalud(atacado.getSalud() - armaAtacante.getDanio());

            this.setStamina(this.getStamina() - armaAtacante.getStamina());

        } else
            usarPosion(this);

    }

    public void atacar(Personaje atacado) {

        if (this.getStamina() > this.getArma().getStamina()) {

            atacado.setSalud((atacado.getSalud() + atacado.getDefensaBase()) - this.getArma().getDanio());

            this.setStamina(this.getStamina() - this.getArma().getStamina());

            System.out.println("El personaje: " + atacado.getNombre() + " quedo con salud: " + atacado.getSalud());

        } else
            usarPosion(this);
    }

    public void ataqueDeBot(Personaje atacado) {


            atacado.setSalud((atacado.getSalud() - this.getArma().getDanio()));

            System.out.println("El personaje: " + atacado.getNombre() + " quedo con salud: " + atacado.getSalud());

    }

    public void atacarInnovandoNazgul(Personaje atacado) {

            int posicionRandom = random.nextInt(10) + 1;
            System.out.println("Numero random: " + posicionRandom);

        if (this.getStamina() > this.getArma().getStamina() && posicionRandom > 2) {

            atacado.setSalud((atacado.getSalud() + atacado.getDefensaBase()) - (this.getArma().getDanio() + 5));

            this.setStamina(this.getStamina() - this.getArma().getStamina());

            System.out.println("El personaje: " + atacado.getNombre() + " quedo con salud: " + atacado.getSalud());

        } else if(this.getStamina() < this.getArma().getStamina()) {
            usarPosion(this);
        } else System.out.println("Uhh! Fallaste!!");
    }

    public void atacarBolaMagica(Personaje atacado) {

        int posicionRandom = random.nextInt(10) + 1;
        System.out.println("Numero random: " + posicionRandom);

        if (this.getStamina() > this.getArma().getStamina() && posicionRandom > 3) {

            atacado.setSalud((atacado.getSalud() + atacado.getDefensaBase()) - ((this.getArma().getDanio() + 8) ));

            this.setStamina(this.getStamina() - this.getArma().getStamina());

            System.out.println("El personaje: " + atacado.getNombre() + " quedo con salud: " + atacado.getSalud());

        } else if(this.getStamina() < this.getArma().getStamina()) {
            usarPosion(this);
        } else System.out.println("Uhh! Fallaste!!");
    }

    public void clavarEspada(Personaje atacado, Personaje atacante) {
        System.out.println("¿Qué espada va a usar? 1. Anduril, 2. Sting o 3. Espada común");
        int choice = Teclado.nextInt();
        switch (choice) {
            case 1:
                atacante.setArma(JuegoLOTR.inventario.get(0));
                atacado.setSalud(atacado.getSalud() - this.getArma().getDanio());
                System.out.println("¡Te clavé un Anduril Mágico!");
                break;

            case 2:
                atacante.setArma(JuegoLOTR.inventario.get(5));
                atacado.setSalud(atacado.getSalud() - this.getArma().getDanio());
                System.out.println("¡Te clavé un Sting Mágico!");
                break;

            case 3:
                atacante.setArma(JuegoLOTR.inventario.get(4));
                atacado.setSalud(atacado.getSalud() - this.getArma().getDanio());
                System.out.println("¡Te clavé una Espada!");
                break;

            default:
                System.out.println("Opción inválida, ingrese 1 2 o 3.");
                break;
        }

    }

    public void dispararFlecha(Personaje personajeAtacado) {
        for (int flechas = 5; flechas > 1; flechas--) {
            personajeAtacado.setSalud(personajeAtacado.getSalud() - this.getArma().getDanio());
            System.out.println("¡Justo en el blanco! Daño: 2, Stamina: 1. Te quedan " + flechas + " "
                    + "flechas por usar." + "Vida del atacado actual: " + personajeAtacado.getSalud());

        }

    }

    public void clavarHacha(Personaje personajeAtacado) {
        personajeAtacado.setSalud(personajeAtacado.getSalud() - this.getArma().getDanio());
        System.out.println("¡Cortado en pedacitos!");

    }

    public void usarBaculo(Personaje personajeAtacado) {
        personajeAtacado.setStamina(personajeAtacado.getStamina() - this.getArma().getDanio());
        System.out.println("He usado un báculo");

    }

    public void atacarConOjoSauron(Personaje atacado) {

        if (this.getStamina() > this.getArma().getStamina()) {

            int vidaActual = 0;

            vidaActual = atacado.getSalud() - this.getArma().getDanio();
            atacado.setSalud(vidaActual);

            int staminaAtacante = 0;

            staminaAtacante = this.getStamina() - this.getArma().getStamina();
            this.setStamina(staminaAtacante);

        } else
            usarPosion(this);

    }

    public void regeneracionVida() {
        int regVida = this.getSalud() + 5;
        this.setSalud(regVida);
    }

    public void regeneracionStamina() {
        int regStamina = this.getStamina() + 5;
        this.setStamina(regStamina);
    }
    int cantidad = 3;
    public void usarRevivir() {
        

        if(cantidad > 0) {
            cantidad = cantidad - 1;
            this.setSalud(this.getSalud() + 20);
            System.out.println("Usaste revivir, quedaste con una vida de: " + this.getSalud());
            System.out.println("Cantidad de posion revivir disponible: " + cantidad);
        } else System.out.println("No tienes posion revivir! ");        
    }

    public void usarPosionStamina(Personaje atacante) {
        int usoPosion = atacante.getStamina() + 30;
        atacante.setStamina(usoPosion);
    }

    public void usarPosion(Personaje personaje) {

        System.out.println("Huy no tienes Stamina, quieres usar posion??");
        System.out.println("Elige 1. si estas de acuerdo!");

        int respuesta = Teclado.nextInt();
        switch (respuesta) {
            case 1:
                usarPosionStamina(personaje);
                break;
            default:
                break;
        }

    }

    public Arma getArma() {
        return arma;
    }

    @Override
    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void seleccionArmaPrincipal() {

        System.out.println("Selecciona tu arma " + this.getNombre());
        int respuesta = JuegoLOTR.seleccionarArmas();
        Arma armaActual = JuegoLOTR.inventario.get(respuesta - 1);
        this.setArma(armaActual);

        System.out.println(" Tu arma es: " + this.getArma().getNombre());
    }

}
