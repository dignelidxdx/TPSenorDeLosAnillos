package app;

import java.util.ArrayList;
import java.util.Scanner;

import app.personajes.Personaje;

public class App {

    public static Scanner Teclado = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {

        menuInicializacion();       
        
    }

    public static void menuInicializacion(){
        int salir = 0;
        do {
            System.out.println("Bienvenido al mejor juego del mundo, LORD OF THE RING");
            System.out.println("Sientese en la libertad de elegir un personaje:");
            System.out.println("...............................................");
            System.out.println("Sos unico player o juegan 2?");
            System.out.println("1. Para jugar contra BOT");
            System.out.println("2. Para jugar 1vs1");
            System.out.println("0. Si se arrepintio");

            int respuesta = Teclado.nextInt();

            switch (respuesta) {
                case 1:

                    combateContraBot();
                    
                    break;
                case 2:

                    combateContraPlayer();
                    
                    break;            
                default:
                System.out.println("Elije una opcion!");
                    break;
            }

        }while(salir != 0);
    }

    private static void combateContraBot() {

    }

    private static void combateContraPlayer() {
        ArrayList<Personaje> personajes = JuegoLOTR.listaPersonajes();
        JuegoLOTR juego = new JuegoLOTR();        
        Personaje player1 = new Personaje();
        Personaje player2 = new Personaje();
        int salir = 1;

        do{
            System.out.println("Seleccione personaje player1:");
            for (int i = 0; i < personajes.size(); i++) {
                System.out.println(i+1 + ". " + personajes.get(i).getNombre() + " Esta vivo: " + personajes.get(i).estaVivo());
                
            }
            System.out.println("0. Regresar al Menu");
            System.out.println();
            int respuesta = Teclado.nextInt();

            if(respuesta == 0) {
            menuInicializacion();
            } 
            else if(respuesta > 0 || respuesta < personajes.size()){

                player1 = personajes.get(respuesta-1);                
                System.out.println("Su personaje fue: " + player1.getNombre());                        
            }

            System.out.println("Seleccione personaje player2:");

            for (int i = 0; i < personajes.size(); i++) {
                System.out.println(i+1 + ". " + personajes.get(i).getNombre() + " Esta vivo: " + personajes.get(i).estaVivo());
                
            }
            System.out.println("0. Regresar al Menu");
            System.out.println();
            int respuesta2 = Teclado.nextInt();

            if(respuesta2 == 0) {
            menuInicializacion();
            } 
            else if(respuesta2 > 0 || respuesta2 < personajes.size()){

                player2 = personajes.get(respuesta2-1);                
                System.out.println("Su personaje fue: " + player2.getNombre());   

            }

            juego.iniciarCombate(player1, player2);
            salir = 0;
            

        } while(salir != 0);   


    }
    
}