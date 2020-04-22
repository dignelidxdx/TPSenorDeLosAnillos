package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import app.armas.Anduril;
import app.armas.ArcoYFlecha;
import app.armas.Arma;
import app.armas.Baculo;
import app.armas.Espada;
import app.armas.HachaDoble;
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
import app.reliquias.reliquias_anillos.AnilloUnico;
import app.reliquias.reliquias_fisicas.ChalecoDeMithril;




public class JuegoLOTR {
    ArrayList<Personaje> personajes = listaPersonajes();
    ArrayList<Arma> armas = listaArmas();
    public static Scanner Teclado = new Scanner(System.in);
    public static Random random = new Random();
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

        Arma anduril = new Anduril("Espada Anduril Magica", 40, 30);
        armas.add(anduril);

        Arma arcoFlecha = new ArcoYFlecha("Arco y Flecha", 35, 20);
        armas.add(arcoFlecha);

        Arma espada = new Espada("Espada Comun", 33, 25);
        armas.add(espada);

        Arma baculo = new Baculo("Baculo Magico", 34, 22);
        armas.add(baculo);

        Arma hachaDoble = new HachaDoble("Hacha doble", 33, 24);
        armas.add(hachaDoble);

        Arma sting = new Sting("Sting Espada Magica", 34, 25);
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

        Elfo personajesElfico1 = new Elfo("Legolas", 90, 30, 25);
        personajes.add(personajesElfico1);

        Elfo personajesElfico2 = new Elfo("Aegnor", 90, 30, 25);
        personajes.add(personajesElfico2);

        Elfo personajesElfico3 = new Elfo("Galadriel", 90, 30, 25);
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

    public void menuInicializacion() {

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
                    System.out.println("Elige una opcion!");
                    break;
            }

        } while (salir != 0);
    }

    public void combateContraBot() {

        Personaje player1 = new Personaje();
        Personaje cpuBot = new Personaje();
        int posicionRandom;
        int salir = 1;

        do {
            System.out.println("Eligue un personaje:");
            mostrarPersonaje();
            int respuesta = Teclado.nextInt();

            if (respuesta == 0) {
                menuInicializacion();
            } else if (respuesta > 0 || respuesta < personajes.size()) {

                player1 = personajes.get(respuesta - 1);
                System.out.println("Su personaje fue: " + player1.getNombre());
            }

            posicionRandom = random.nextInt(personajes.size()) + 1;
            cpuBot = personajes.get(posicionRandom);

            System.out.println("El cpu eligio: " + cpuBot.getNombre());

            iniciarCombateContraCPU(player1, cpuBot);
            salir = 0;

        } while (salir != 0);
    }

    public void combateContraPlayer() {

        ArrayList<Personaje> personajes = listaPersonajes();
        Personaje player1 = new Personaje();
        Personaje player2 = new Personaje();
        int salir = 1;

        do {
            System.out.println("Seleccione personaje player1: ");
            mostrarPersonaje();
            int respuesta = Teclado.nextInt();

            if (respuesta == 0) {
                menuInicializacion();
            } else if (respuesta > 0 || respuesta < personajes.size()) {

                player1 = personajes.get(respuesta - 1);
                System.out.println("Su personaje fue: " + player1.getNombre());
            }

            System.out.println("Seleccione arma:" + player1.getNombre());

            System.out.println("Seleccione personaje player2: ");
            mostrarPersonaje();

            int respuesta2 = Teclado.nextInt();

            if (respuesta2 == 0) {
                menuInicializacion();
            } else if (respuesta2 > 0 || respuesta2 < personajes.size()) {

                player2 = personajes.get(respuesta2 - 1);
                System.out.println("Su personaje fue: " + player2.getNombre());

            }

            iniciarCombate(player1, player2);
            salir = 0;

        } while (salir != 0);

    }

    public JuegoLOTR iniciarCombate(Personaje player1, Personaje player2) {

        System.out.println("Inicia el combate");
        Personaje ganadorCombate;
        String color;
        boolean turnoPlayer1 = true;

        if (player1 instanceof ILlevaReliquia) {

            Reliquia soyReliquia2 = new AnilloNarya("soyAnilloNarya", 0.20, 0.30, 1);
            ((ILlevaReliquia) player1).setReliquia(soyReliquia2);
        }
        if (player2 instanceof ILlevaReliquia) {

            Reliquia soyReliquia2 = new AnilloUnico("soyAnilloUnico", 0.20, 0.30, 1);
            ((ILlevaReliquia) player1).setReliquia(soyReliquia2);
        }

        while (player1.estaVivo() && player2.estaVivo()) {

            Personaje atacante;
            Personaje atacado;

            color = turnoPlayer1 ? ANSI_PURPLE : ANSI_YELLOW;
            atacante = turnoPlayer1 ? player1 : player2;
            atacado = turnoPlayer1 ? player2 : player1;

            System.out.println();
            System.out.println("Selecciona una arma " + atacante.getNombre() + " para usar:");
            System.out.println();

            int respuesta = seleccionarArmas();
            Arma armaActual = armas.get(respuesta - 1);

            System.out.println(color + "Ataca: " + atacante.getNombre() + " y tiene una vida de: " + atacante.getSalud()
                    + " y una stamina de: " + atacante.getStamina() + ANSI_RESET);

            if (armaActual instanceof IEsMagico && atacante instanceof IHaceMagia
                    && atacante instanceof ILlevaReliquia) {
                ((IHaceMagia) atacante).ataqueEpico(atacado, armaActual);
            } else if (atacante.getStamina() > armaActual.getStamina()) {

                atacante.atacar(atacado, armaActual);

            } else if (atacante.getStamina() < armaActual.getStamina()) {
                atacante.usarPosionStamina(atacante);
            }

            if (atacado.getSalud() < 1) {
                atacado.usarRevivir();
            }

            atacado.regeneracionVida();
            atacado.regeneracionStamina();

            turnoPlayer1 = !turnoPlayer1;
        }

        if (player1.getSalud() > 0) {
            ganadorCombate = player1;
        } else {
            ganadorCombate = player2;
        }
        ganadorDelCombate(ganadorCombate);
        return null;
    }

    public void iniciarCombateContraCPU(Personaje player, Personaje cpuBot) {

        System.out.println("Inicia el combate contra Bot");
        int turno = 1;
        Personaje ganadorCombate;

        if (player instanceof ILlevaReliquia) {

            Reliquia soyReliquia2 = new AnilloNarya("soyAnillo", 0.20, 0.30, 1);
            ((ILlevaReliquia) player).setReliquia(soyReliquia2);

        }

        while (player.estaVivo() && cpuBot.estaVivo()) {

            if (turno == 1) {

                System.out.println();
                System.out.println("Selecciona una arma " + player.getNombre() + " para usar:");
                System.out.println();
                for (int i = 0; i < armas.size(); i++) {
                    System.out.println(
                            i + 1 + ". " + armas.get(i).getNombre() + " Con danio de: " + armas.get(i).getDanio());
                }
                int respuesta = Teclado.nextInt();
                Arma armaActual;
                armaActual = armas.get(respuesta - 1);

                if (player instanceof IHaceMagia && player instanceof ILlevaReliquia) {

                    System.out.println("Hola soy Elfo o Wizard");
                    // entran los Elfos y Wizard nada mas
                    if ((((ILlevaReliquia) player).getReliquia() instanceof AnilloElfico
                            && armaActual instanceof IEsMagico)) {
                        System.out.println("Soy un elfo con anillo elfico");

                        ((IHaceMagia) player).ataqueEpico(cpuBot, armaActual);

                    } else
                        player.atacar(cpuBot, armaActual);

                } else if (player instanceof ILlevaReliquia) {
                    System.out.println("Soy un personaje con reliquia");
                    player.atacar(cpuBot, armaActual);
                    // entran los Humanos y los Hobbit

                } else if (player.getStamina() > armaActual.getStamina()) {
                    // entran los demas personajes Enano, Troll, Orco, Goblin que tengan stamina.

                    player.atacar(cpuBot, armaActual);
                    System.out.println(ANSI_PURPLE + "Soy: " + player.getNombre() + "Ataque a: " + cpuBot.getNombre()
                            + ANSI_RESET);
                    System.out.println("Quedo con vida: " + cpuBot.getSalud());
                } else if (player.getStamina() < armaActual.getStamina()) {
                    // entran los demas personajes Enano, Troll, Orco, Goblin para usar posion de
                    // stamina.

                    player.usarPosionStamina(player);
                    System.out.println("Me cure estamina" + player.getNombre());
                }

                turno = 0;
            } else if (turno == 0) {
                Arma armaActual;
                Random random = new Random();
                int posicionRandom = random.nextInt(armas.size()) + 1;
                armaActual = armas.get(posicionRandom);

                cpuBot.atacar(player, armaActual);

                System.out.println(
                        ANSI_GREEN + "Deje a: " + player.getNombre() + " con vida: " + player.getSalud() + ANSI_RESET);

                turno = 1;
            }

        }

        if (player.getSalud() > 0) {
            ganadorCombate = player;
        } else {
            ganadorCombate = cpuBot;
        }
        ganadorDelCombate(ganadorCombate);

    }

    public static void ganadorDelCombate(Personaje ganadorCombate) {

        System.out.println("Gano Player " + ganadorCombate.getNombre());

    }

    public Personaje buscarPersonaje(String nombre) {
        for (Personaje p : this.personajes) {
            if (p.getNombre().equals(nombre))
                return p;
        }
        return null;
    }

    public void mostrarPersonaje() {
        int acumulador = 0;
        for (Personaje p : this.personajes) {
            acumulador++;
            System.out.println(acumulador + ". " + p.getNombre() + " Esta vivo: " + p.estaVivo());
        }
        System.out.println("0. Regresar al Menu");
        System.out.println();
    }

    public static void imprimirPersonajes() {

        ArrayList<Personaje> personajes = JuegoLOTR.listaPersonajes();
        for (int i = 0; i < personajes.size(); i++) {
            System.out.println(
                    i + 1 + ". " + personajes.get(i).getNombre() + " Esta vivo: " + personajes.get(i).estaVivo());
        }
    }

    public int seleccionarArmas() {

        int acumulador = 0;
        for (Arma a : this.armas) {
            acumulador++;
            System.out.println(acumulador + ". " + a.getNombre() + " y tiene un dano de: " + a.getDanio());
        }
        int respuesta = Teclado.nextInt();

        return respuesta;
      
    }

    public int elegirArma() {

        for (int i = 0; i < armas.size(); i++) {
            System.out.println(i+1 + ". " + armas.get(i).getNombre() + 
            " Con danio de: " + armas.get(i).getDanio());
        }
        int respuesta = Teclado.nextInt();
        
        return respuesta;
    }

    public static void seleccionarReliquia() {

        ArrayList<Reliquia> reliquias = listaReliquias();
        for (int i = 0; i < reliquias.size(); i++) {
            System.out.println(i+1 + ". " + reliquias.get(i).getNombre());
        }
    }

    public void elegirReliquia() {

    }

    public void usoAtaqueEpico(Personaje atacado, Arma armaActual) {

        IHaceMagia atacanteSupremo = (IHaceMagia) this;
        IEsMagico armaPoderosa = (IEsMagico) armaActual;
        if(atacanteSupremo.getEnergiaMagica() > armaPoderosa.getEnergiaMagica()){
            atacanteSupremo.ataqueEpico(atacado, armaActual);
            int restaMagia = atacanteSupremo.getEnergiaMagica() - armaPoderosa.getEnergiaMagica();
            atacanteSupremo.setEnergiaMagica(restaMagia);
        } else System.out.println("Huy, no pudiste ejecutar ataque epico!! Te falta magia");
                
    }

}
