package app;

import java.util.ArrayList;
import java.util.List;

import app.armas.Arma;
import app.personajes.Personaje;
import app.personajes.criaturas.Elfo;
import app.personajes.criaturas.Enano;
import app.personajes.criaturas.Goblin;
import app.personajes.criaturas.Hobbit;
import app.personajes.criaturas.Orco;
import app.personajes.humanos.Humano;
import app.personajes.humanos.Wizard;

public class JuegoLOTR {


    public ArrayList<Personaje> personajesSeleccionados = new ArrayList<>();

    public static ArrayList<Personaje> listaPersonajes() {

		ArrayList<Personaje> personajes = new ArrayList<>();
        
        Humano humano1 = new Humano("Faramir", 100, 100);
        personajes.add(humano1);

        Humano humano2 = new Humano("Aragorn", 100, 100);
        personajes.add(humano2);

        Humano humano3 = new Humano("Enethor II", 100, 100);
        personajes.add(humano3);

        Wizard wizard1 = new Wizard("Gandalf", 100, 100, 100);
        personajes.add(wizard1);

        Wizard wizard2 = new Wizard("Saruman", 100, 100, 100);
        personajes.add(wizard2);

        Wizard wizard3 = new Wizard("Sauron", 100, 100, 100);
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
        for (Personaje player1: this.personajesSeleccionados) {
			if (player1.getSalud() > 0)
				return player1;
		}
		return null;
    }

    public JuegoLOTR iniciarCombate(Personaje player1, Personaje player2) {
        Arma arma1 = new Arma("espada", 20, 100);
        Arma arma2 = new Arma("Sting", 30, 100);

        int saludActual1 = player1.getSalud();
        int saludActual2 = player1.getSalud();
        Personaje ganadorCombate;

        System.out.println("Inicia el combate");

        int turno = 1;   
        
        while(player1.estaVivo() && player2.estaVivo()){
            if(turno == 1){

                // player1.getSalud() -= arma1.getDanio();
            
                System.out.println("Hola hice danio " + player1.getNombre());
                saludActual1 = saludActual1 - arma2.getDanio();
                player1.setSalud(saludActual1);
                player1.estaVivo();
                System.out.println("El player 1 esta vivo: " + player1.estaVivo());
                
                turno = 0;

            } else if(turno == 0){

                // player2.getSalud() -= arma2.getDanio();
                System.out.println("Hola hice danio " + player2.getNombre());
                saludActual2 = saludActual2 - arma1.getDanio(); 
                player2.setSalud(saludActual1);
                player2.estaVivo();          
                System.out.println("El player 2 esta vivo: " + player2.estaVivo());     
                turno = 1;
                
            }
        }        
        
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

}