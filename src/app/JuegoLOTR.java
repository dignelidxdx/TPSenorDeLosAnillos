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
import app.reliquias.Reliquia;
import app.reliquias.reliquias_anillos.AnilloElfico;
import app.reliquias.reliquias_anillos.AnilloNarya;
import app.reliquias.reliquias_fisicas.ChalecoDeMithril;




public class JuegoLOTR {
    ArrayList<Arma> armas = listaArmas();
    ArrayList<Personaje> personajes = listaPersonajes();
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


    public static ArrayList<Reliquia> listaReliquias() {
        ArrayList<Reliquia> reliquias = new ArrayList<>();

        return reliquias;
    }

    public static ArrayList<Arma> listaArmas() {

        ArrayList<Arma> armas = new ArrayList<>();
    
        Arma anduril = new Arma("Espada Anduril Magica", 550, -480);
        armas.add(anduril);

        Arma arcoFlecha = new Arma("Arco y flecha", 140, -89);
        armas.add(arcoFlecha);

        Arma espada = new Arma("Espada Comun", 200, -180);
        armas.add(espada);

        Arma baculo = new Arma("Baculo Magico", 680, -500);
        armas.add(baculo);

        Arma hachaDoble = new Arma("Hacha doble", 220, -190);
        armas.add(hachaDoble);

        Arma sting = new Arma("Sting Espada Magica", 350, -250);
        armas.add(sting);

        return armas;
    
    }

        
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
    
    

    public Personaje buscarPersonaje(String nombre){
        for (Personaje p: this.personajes) {
			if (p.getNombre().equals(nombre))
				return p;
		}
		return null;
    }

    public void mostrarPersonaje(){
        int acumulador = 0;
        for (Personaje p: this.personajes) {
            acumulador++;
			System.out.println(acumulador + p.getNombre());
		}
    }

    public JuegoLOTR iniciarCombate(Personaje player1, Personaje player2) {
        
        System.out.println("Inicia el combate");        
        Personaje ganadorCombate;
        String color;
        boolean turnoPlayer1 = true;   
          
       
        while(player1.estaVivo() && player2.estaVivo()){
            
            Personaje atacante;
            Personaje atacado;

            color = turnoPlayer1 ? ANSI_PURPLE : ANSI_YELLOW;
            atacante = turnoPlayer1 ? player1 : player2;
            atacado = turnoPlayer1 ? player2 : player1;

            System.out.println();
            System.out.println("Selecciona una arma " + atacante.getNombre() + " para usar:");
            System.out.println();
            
            int respuesta = elegirArma();
            Arma armaActual = armas.get(respuesta-1);  
            
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

        if(player1.getSalud() > 0){
            ganadorCombate = player1;
        } else{
            ganadorCombate = player2;
        }
        ganadorDelCombate(ganadorCombate);
        return null;       
    }    

    public static void ganadorDelCombate(Personaje ganadorCombate) {

        System.out.println("Gano Player " + ganadorCombate.getNombre());        
       
    }


    public int elegirArma() {

        for (int i = 0; i < armas.size(); i++) {
            System.out.println(i+1 + ". " + armas.get(i).getNombre() + 
            " Con danio de: " + armas.get(i).getDanio());
        }
        int respuesta = Teclado.nextInt();
        
        return respuesta;
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

	public void iniciarCombateConCPU(Personaje player1, Personaje cpuBot) {

    }
       

}
