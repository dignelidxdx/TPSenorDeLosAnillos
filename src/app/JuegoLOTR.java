package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import app.armas.Anduril;
import app.armas.Arma;
import app.armas.Espada;
import app.armas.Sting;
import app.interfaces.IEsMagico;
import app.interfaces.IHaceMagia;
import app.interfaces.ILlevaReliquia;
import app.personajes.Personaje;
import app.personajes.criaturas.Elfo;
import app.personajes.criaturas.Enano;
import app.personajes.criaturas.Goblin;
import app.personajes.criaturas.Hobbit;
import app.personajes.criaturas.Orco;
import app.personajes.humanos.Humano;
import app.personajes.humanos.Wizard;
import app.reliquias.reliquias_anillos.AnilloElfico;
import app.reliquias.reliquias_anillos.AnilloNenya;
import app.reliquias.*;




public class JuegoLOTR {
    public static Scanner Teclado = new Scanner(System.in);
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";


    public ArrayList<Personaje> personajesSeleccionados = new ArrayList<>();

    public static ArrayList<Personaje> listaPersonajes() {

		ArrayList<Personaje> personajes = new ArrayList<>();
        
        Humano humano1 = new Humano("Faramir", 100, 100);
        personajes.add(humano1);

        Humano humano2 = new Humano("Aragorn", 100, 100);
        personajes.add(humano2);

        Humano humano3 = new Humano("Enethor II", 100, 100);
        personajes.add(humano3);

        Wizard wizard1 = new Wizard();
        wizard1.setNombre("Gandalf");
        wizard1.setStamina(100);
        personajes.add(wizard1);

        Wizard wizard2 = new Wizard("Saruman", 100);
        personajes.add(wizard2);

        Wizard wizard3 = new Wizard("Sauron", 100);
        personajes.add(wizard3);

        Elfo personajesElfico1 = new Elfo("Legolas", 100, 150 , 120);
        personajes.add(personajesElfico1);

        Elfo personajesElfico2 = new Elfo("Aegnor", 100, 110, 100);
        personajes.add(personajesElfico2);

        Elfo personajesElfico3 = new Elfo("Galadriel", 100, 130, 130);
        personajes.add(personajesElfico3);

        Enano enano1 = new Enano("Durin", 100, 100);
        personajes.add(enano1);

        Enano enano2 = new Enano("Torin", 100, 100);
        personajes.add(enano2);

        Enano enano3 = new Enano("Gimli", 100, 100);
        personajes.add(enano3);

        Goblin goblin1 = new Goblin("Thirvia", 100, 100);
        personajes.add(goblin1);

        Hobbit hobbit1 = new Hobbit("Frodo", 100, 100);
        personajes.add(hobbit1);

        Hobbit hobbit2 = new Hobbit("Bilbo", 100, 100);
        personajes.add(hobbit2);

        Hobbit hobbit3 = new Hobbit("Sam", 100, 100);
        personajes.add(hobbit3);

        Orco orco1 = new Orco("Ugluk", 100, 100);
        personajes.add(orco1);

        Orco orco2 = new Orco("Mauhur", 100, 100);
        personajes.add(orco2);	
		
		return personajes;
    }
    
    public static ArrayList<Arma> listaArmas() { 

        ArrayList<Arma> armas = new ArrayList<>();
       
        Arma arma1 = new Anduril("Anduril1", 30, 20);
        armas.add(arma1);
        arma1 = new Anduril("Anduril2", 32, 20);
        armas.add(arma1);
        Arma arma2 = new Espada("Aguja", 35, 30);
        armas.add(arma2);
        Arma arma3 = new Sting("soySting", 37, 20);
        armas.add(arma3);
        
        return armas;

    }

    public static List<Reliquia> reliquias = new ArrayList<Reliquia>();

    public void aniadirListaReliquias() {

        AnilloElfico nenya = new AnilloNenya("Anillo Nenya", 0.03, 0.20, 20);
        reliquias.add(nenya);
    }

    public Personaje buscarPersonaje(String nombre){
        for (Personaje player1: this.personajesSeleccionados) {
			if (player1.getSalud() > 0)
				return player1;
		}
		return null;
    }

    public JuegoLOTR iniciarCombate(Personaje player1, Personaje player2) {
        
        ArrayList<Arma> armas = listaArmas();
        System.out.println("Inicia el combate");        
        Personaje ganadorCombate;
        String color;
        boolean turnoPlayer1 = true;     
       
        while(player1.estaVivo() && player2.estaVivo()){
            
            Personaje atacante;
            Personaje atacado;
            // atacante = turnoPlayer1 ? player1 : player2;
            // if(turnoPlayer1)
            //     atacante = player1;
            // else    
            //     atacante = player2;                       
            // if (turnoPlayer1)
            //     color = ANSI_PURPLE;
            // else    
            //     color = ANSI_YELLOW;

            color = turnoPlayer1 ? ANSI_PURPLE : ANSI_YELLOW;
            atacante = turnoPlayer1 ? player1 : player2;
            atacado = turnoPlayer1 ? player2 : player1;

            // Arma arma1 = new Arma("espada", 20, 100);
            System.out.println();
            System.out.println("Selecciona una arma " + atacante.getNombre() + " para usar:");
            System.out.println();
            for (int i = 0; i < armas.size(); i++) {
                System.out.println(i+1 + ". " + armas.get(i).getNombre() + " Con danio de: " + armas.get(i).getDanio());
            }
            int respuesta = Teclado.nextInt();
            Arma armaActual;
            Random random = new Random();
            armaActual = armas.get(respuesta-1);  
            
            System.out.println(color + "Ataca: " + atacante.getNombre() + " y tiene una vida de: " + atacante.getSalud() + " y una stamina de: " + atacante.getStamina() + ANSI_RESET);
            
            if(armaActual instanceof IEsMagico && atacante instanceof IHaceMagia) {                
                usoAtaqueEpico(atacante, atacado, armaActual);
            }             
            else if (atacante.getStamina() > armaActual.getStamina()) {
                atacante.atacar(atacado, armaActual, atacante);
            } else if (atacante.getStamina() < armaActual.getStamina()) {
                atacante.usarPosionStamina(atacante);
            }

                        

            if(atacado.getSalud() < 1){
                atacado.usarRevivir(atacado);
            }
            atacante.regeneracionVida(atacado);
            atacante.regeneracionStamina(atacado);

            turnoPlayer1 = !turnoPlayer1;
        }


        // int turno = 1;  
    //     while(player1.estaVivo() && player2.estaVivo()){
    //         if(turno == 1){

    //             // player1.getSalud() -= arma1.getDanio();

    //             if (player1 instanceof ILlevaReliquia){
    //             }
    //             player1.atacar(player1, arma1);            
    //             System.out.println(ANSI_RED + "Hola hice danio " + player1.getNombre() + ANSI_RESET);
    //             saludActual1 = saludActual1 - arma2.getDanio();
    //             player1.setSalud(saludActual1);
    //             player1.estaVivo();
    //             System.out.println("El player 1 esta vivo: " + player1.estaVivo());
                
    //             turno = 0;

    //         } else if(turno == 0){

    //             // player2.getSalud() -= arma2.getDanio();
    //             System.out.println(ANSI_BLUE + "Hola hice danio " + player2.getNombre() + ANSI_RESET);
    //             saludActual2 = saludActual2 - arma1.getDanio(); 
    //             player2.setSalud(saludActual1);
    //             player2.estaVivo();          
    //             System.out.println("El player 2 esta vivo: " + player2.estaVivo());  
    //             int min = 2;
    //             int max = 5;
    //             int danio = (int) (Math.random() * ((max-min)*1)) + min;
    //             turno = 1;
                
    //         }
        // }        
        
        if(player1.getSalud() > 0){
            ganadorCombate = player1;
        } else{
            ganadorCombate = player2;
        }
        ganadorDelCombate(ganadorCombate);
        return null;       
    }    

    public void finalizaCombate() {
        System.out.println("Cuando su vida llega a 0 o menos");
    }

    public static void ganadorDelCombate(Personaje ganadorCombate) {

        System.out.println("Gano Player " + ganadorCombate.getNombre());
        
       
    }

    // public Personaje buscarPersonaje(String nombre){
    //     for (Personaje p: this.personajes) {
	// 		if (p.getNombre().equals(nombre))
	// 			return p;
	// 	}
	// 	return null;
    // }

    public void elegirArma() {

    }

    public void elegirReliquia() {

    }

    public void usoAtaqueEpico(Personaje atacante, Personaje atacado, Arma armaActual) {
        IHaceMagia atacanteSupremo = (IHaceMagia) atacante;
        IEsMagico armaPoderosa = (IEsMagico) armaActual;
        if(atacanteSupremo.getEnergiaMagica() > armaPoderosa.getEnergiaMagica()){
            atacanteSupremo.ataqueEpico(atacado, armaActual);
            int restaMagia = atacanteSupremo.getEnergiaMagica() - armaPoderosa.getEnergiaMagica();
            atacanteSupremo.setEnergiaMagica(restaMagia);
        } else System.out.println("Huy, no pudiste ejecutar ataque epico!! Te falta magia");
                
    }

}