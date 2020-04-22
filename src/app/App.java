package app;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import app.personajes.Personaje;

public class App {

    public static Scanner Teclado = new Scanner(System.in);   
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    public static void main(String[] args) throws Exception {
        JuegoLOTR juego = new JuegoLOTR();
        juego.menuInicializacion();
        
    }



    // private static void combateContraBot() {

        
    //     JuegoLOTR juego = new JuegoLOTR();        
    //     ArrayList<Personaje> personajes = juego.listaPersonajes();
    //     Personaje player1 = new Personaje();
    //     Personaje cpuBot = new Personaje();
    //     int posicionRandom;
    //     int salir = 1;

    //     do{
    //         System.out.println("Seleccione personaje: ");
    //         imprimirPersonajes();
    //         System.out.println("0. Regresar al Menu");
    //         System.out.println();
    //         int respuesta = Teclado.nextInt();

    //         if(respuesta == 0) {
    //         menuInicializacion();
    //         } 
    //         else if(respuesta > 0 || respuesta < personajes.size()){

    //             player1 = personajes.get(respuesta-1);                
    //             System.out.println("Su personaje fue: " + player1.getNombre());                        
    //         }


    //         Random random = new Random();
    //         posicionRandom = random.nextInt(personajes.size()) + 1;
    //         cpuBot = personajes.get(posicionRandom);

    //         System.out.println("El cpu eligio: " + cpuBot.getNombre());

    //         juego.iniciarCombateContraCPU(player1, cpuBot);
    //         salir = 0;
            

    //     } while(salir != 0);      
    // }

    // private static void combateContraPlayer() {
    //     ArrayList<Personaje> personajes = JuegoLOTR.listaPersonajes();
    //     JuegoLOTR juego = new JuegoLOTR();        
    //     Personaje player1 = new Personaje();
    //     Personaje player2 = new Personaje();
    //     int salir = 1;

    //     do{
    //         System.out.println("Seleccione personaje player1: ");
    //         imprimirPersonajes();
    //         System.out.println("0. Regresar al Menu");
    //         System.out.println();
    //         int respuesta = Teclado.nextInt();

    //         if(respuesta == 0) {
    //         menuInicializacion();
    //         } 
    //         else if(respuesta > 0 || respuesta < personajes.size()){

    //             player1 = personajes.get(respuesta-1);                
    //             System.out.println("Su personaje fue: " + player1.getNombre());                        
    //         }

    //         System.out.println("Seleccione arma:");


    //         System.out.println("Seleccione personaje player2: ");

    //         imprimirPersonajes();
    //         System.out.println("0. Regresar al Menu");
    //         System.out.println();
    //         int respuesta2 = Teclado.nextInt();

    //         if(respuesta2 == 0) {
    //         menuInicializacion();
    //         } 
    //         else if(respuesta2 > 0 || respuesta2 < personajes.size()){

    //             player2 = personajes.get(respuesta2-1);                
    //             System.out.println("Su personaje fue: " + player2.getNombre());   

    //         }

    //         juego.iniciarCombate(player1, player2);
    //         salir = 0;
            

    //     } while(salir != 0);   


    // }

    // public static void imprimirPersonajes() {
    //     ArrayList<Personaje> personajes = JuegoLOTR.listaPersonajes();
    //     for (int i = 0; i < personajes.size(); i++) {
    //         System.out.println(i+1 + ". " + personajes.get(i).getNombre() + " Esta vivo: " + personajes.get(i).estaVivo());
            
    //     }
    // }

    // public static void imprimirArmas() {
    //     JuegoLOTR juego = new JuegoLOTR(); 

    //         int acumulador = 0;

    //         for (Arma p: juego.armas) {
    //             acumulador++;
    //             System.out.println(acumulador + " " + p.getNombre());
    //         }
      
    // }
    
}