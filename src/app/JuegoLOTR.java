package app;

import java.util.ArrayList;
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
import app.reliquias.reliquiasanillos.AnilloNarya;
import app.reliquias.reliquiasanillos.AnilloNenya;
import app.reliquias.reliquiasanillos.AnilloUnico;
import app.reliquias.reliquiasanillos.AnilloVilya;
import app.reliquias.reliquiasfisicas.ChalecoDeMithril;
import app.reliquias.reliquiasjoyas.FrascoGaladriel;


public class JuegoLOTR {
    ArrayList<Arma> armas = chequearInventario();
    ArrayList<Personaje> personajes = listaPersonajes();
    public static ArrayList<Reliquia> reliquias = listaReliquias();
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

        AnilloNenya nenya = new AnilloNenya("Anillo Nenya", +0.03, +0.30, +40, 0);
        reliquias.add(nenya);
        AnilloNarya narya = new AnilloNarya("Anillo Narya", +0.15, +0.03, +15, 0);
        reliquias.add(narya);
        AnilloVilya vilya = new AnilloVilya("Anillo Vilya", +0.05, +0.15, +10, +0.15);
        reliquias.add(vilya);
        AnilloUnico sauron = new AnilloUnico();
        reliquias.add(sauron);
        FrascoGaladriel frascoDeGaladriel = new FrascoGaladriel();
        reliquias.add(frascoDeGaladriel);
        ChalecoDeMithril chaleco = new ChalecoDeMithril("Cota de malla de Mithril", 0, 0.50, "Tengo chaleco, viteh?!");
        reliquias.add(chaleco);

        return reliquias;
    }

    
    public static ArrayList<Arma> inventario = new ArrayList<>();
    public ArrayList<Arma> chequearInventario() {

        Anduril anduril = new Anduril("Anduril Espada Mágica", 25, 15, 25);
        inventario.add(anduril);
        ArcoYFlecha arcoYFlecha = new ArcoYFlecha("Arco y Flecha", 2, 1);
        inventario.add(arcoYFlecha);
        Baculo baculo = new Baculo("Báculo", 38, 30, 50);
        inventario.add(baculo);
        Espada espada = new Espada("Espada Común", 35, 20);
        inventario.add(espada);
        HachaDoble hachaDoble = new HachaDoble("Hacha Doble", 30, 30);
        inventario.add(hachaDoble); 
        Sting sting = new Sting("Sting Espada Mágica", 20, 20, 20);
        inventario.add(sting);
       return inventario;           

    }

    public Arma buscarInventario(String nombre){
        for (Arma a: JuegoLOTR.inventario) {

            if (inventario.equals(nombre))
                return a;
        }
        return null;

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
            System.out.println("Bienvenido al mejor juego del mundo, LORD OF THE RINGS!");
            System.out.println("Para dar comienzo a la batalla, elige un personaje:");
            System.out.println("...............................................");
            System.out.println("SELECCIONA LA MODALIDAD DE JUEGO: ");
            System.out.println("1. Para jugar contra BOT");
            System.out.println("2. Para jugar 1vs1");
            System.out.println("0. Salir");

            int respuesta = Teclado.nextInt();

            switch (respuesta) {
                case 1:

                    combateContraBot();

                    break;
                case 2:

                    combateContraPlayer();

                    break;
                case 0:
                    System.out.println("Adios! se cierra el juego...");
                    break;
                default:
                    System.out.println("Elige una opcion!");
                    menuInicializacion();
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
            System.out.println("Selecciona un personaje:");
            mostrarPersonaje();
            int respuesta = Teclado.nextInt();

            if (respuesta == 0) {
                menuInicializacion();
            } else if (respuesta > 0 || respuesta < personajes.size()) {

                player1 = personajes.get(respuesta - 1);
                System.out.println("¡Gran elección! Tu personaje es: " + player1.getNombre());
            }

            posicionRandom = random.nextInt(personajes.size()) + 0;
            cpuBot = personajes.get(posicionRandom);

            System.out.println("El cpu eligió: " + cpuBot.getNombre());

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
            System.out.println("PLAYER 1, selecciona tu personaje!");
            mostrarPersonaje();
            int respuesta = Teclado.nextInt();

            if (respuesta == 0) {
                menuInicializacion();
            } else if (respuesta > 0 || respuesta < personajes.size()) {

                player1 = personajes.get(respuesta - 1);
                System.out.println("¡Gran elección, Player 1! Tu personaje es: " + player1.getNombre());
            }

            System.out.println("PLAYER 2, selecciona tu personaje!");
            mostrarPersonaje();
            int respuesta2 = Teclado.nextInt();

            if (respuesta2 == 0) {
                menuInicializacion();
            } else if (respuesta2 > 0 || respuesta2 < personajes.size()) {

                player2 = personajes.get(respuesta2 - 1);
                System.out.println("¡Gran elección, Player 2! Tu personaje es: " + player2.getNombre());

            }

            iniciarCombate(player1, player2);
            salir = 0;

        } while (salir != 0);

    }

    public JuegoLOTR iniciarCombate(Personaje player1, Personaje player2) {
        System.out.println();
        System.out.println("Inicia el combate");
        System.out.println();
        Personaje ganadorCombate;
        String color;
        boolean turnoPlayer1 = true;

        player1.seleccionArmaPrincipal();

        player2.seleccionArmaPrincipal();        

        if (player1 instanceof ILlevaReliquia) {

            ((ILlevaReliquia) player1).seleccionReliquiaPrincipal();
        }
        if (player2 instanceof ILlevaReliquia) {

            ((ILlevaReliquia) player2).seleccionReliquiaPrincipal();
        }

        while (player1.estaVivo() && player2.estaVivo()) {

            Personaje atacante;
            Personaje atacado;

            color = turnoPlayer1 ? ANSI_PURPLE : ANSI_YELLOW;
            atacante = turnoPlayer1 ? player1 : player2;
            atacado = turnoPlayer1 ? player2 : player1;

            System.out.println(color + "Ataca: " + atacante.getNombre() + " y tiene una vida de: " + atacante.getSalud()
                    + " y una stamina de: " + atacante.getStamina() + ANSI_RESET);
                                     

            if (atacante instanceof IHaceMagia && atacante instanceof ILlevaReliquia && ((ILlevaReliquia) atacante)
                    .getReliquia() instanceof app.reliquias.reliquiasanillos.AnilloElfico) {
                // entran los Elfos y Wizard, usan magia
                eligeAtaqueConAnillo(atacado, atacante, color);               

            } else if (atacante instanceof IHaceMagia && atacante instanceof ILlevaReliquia) {
                // entran los Elfos y Wizard, usan magia
                eligeAtaqueMagico(atacado, atacante, color);               

            } else if (atacante instanceof ILlevaReliquia) {
                // entran los Humanos y los Hobbit, no usan magia
                eligeAtaqueReliquia(atacado, atacante, color);      
                
            } else if (atacante.getStamina() > atacante.getArma().getStamina()) {
                // Entran los Orcos, Goblin, Ennano, Troll                
                eligeAtaqueSencillo(atacante, atacado, color);

            } else if (atacante.getStamina() < atacante.getArma().getStamina()) {
                atacante.usarPosionStamina(atacante);
            }

            if (atacado.getSalud() < 1) {
                System.out.println("Huy! Te dejaron sin vida, quieres usar revivir?");
                System.out.println("Elige 1. para usar revivir!");
                System.out.println("Elige 0. para seguir y dar fin a la batalla!");
                int respuesta = Teclado.nextInt();

                switch (respuesta) {
                    case 1:
                        atacado.usarRevivir();
                        System.out.println();
                        break;
                
                    default:
                        break;
                }         
                      
            }
            if (atacado.getSalud() < 1) {
                System.out.println();
                System.out.println("Huy! Parece que el revivir no le fue suficiente: Regenera 5 de vida!");
            }   
            
            atacado.regeneracionVida();
            atacado.regeneracionStamina();

            if (atacado.getSalud() < 1) {
                System.out.println("Lo siento :( Perdiste!");
            } 

            turnoPlayer1 = !turnoPlayer1;
        }

        if (player1.getSalud() > 0) {
            
            ganadorCombate = player1;
        } else {
            ganadorCombate = player2;
        }
        ganadorDelCombate(ganadorCombate);
        System.out.println();
        System.out.println("Desea iniciar otra batalla?");
        System.out.println("1. Seleccionar modalidad");
        System.out.println("2. Seleccionar personaje");
        System.out.println("0. Salir");
        int respuesta = Teclado.nextInt();
        if(respuesta == 1){
            menuInicializacion();
        } else if (respuesta == 2) {
            combateContraPlayer();
        } 
        return null;
    }


    public void iniciarCombateContraCPU(Personaje player, Personaje cpuBot) {

        System.out.println("Inicia el combate contra Bot");
        int turno = 1;
        Personaje ganadorCombate;

        if (player instanceof ILlevaReliquia) {

            ((ILlevaReliquia) player).seleccionReliquiaPrincipal();

        }

        while (player.estaVivo() && cpuBot.estaVivo()) {

            if (turno == 1) {

                System.out.println();
                System.out.println("Selecciona un arma " + player.getNombre() + " para atacar:");
                System.out.println();

                Arma armaActual = inventario.get(0);
                player.setArma(armaActual);
                if (player instanceof IHaceMagia && player instanceof ILlevaReliquia) {
                    // entran los Elfos y los Wizard
                    elegirArma(player, cpuBot);
                } else if (player instanceof ILlevaReliquia) {
                    // entran los Humanos y los Hobbit
                    elegirArma(player, cpuBot);
                } else if (player.getStamina() > armaActual.getStamina()) {
                    // entran los demas personajes Enano, Troll, Orco, Goblin que tengan stamina.
                    elegirArma(player, cpuBot);
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

                Random random = new Random();
                int posicionRandom = random.nextInt(inventario.size()) + 0;                System.out.println("posicon arma: " + posicionRandom);
                cpuBot.setArma(inventario.get(posicionRandom));
                
                cpuBot.ataqueDeBot(player);
                System.out.println();
                System.out.println(ANSI_GREEN + "Ataco el Bot:" + ANSI_RESET);
                System.out.println(
                        ANSI_GREEN + "Deje a: " + player.getNombre() + " con vida: " + player.getSalud() + ANSI_RESET);
                System.out.println();
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

        System.out.println("Y el ganador es... Player " + ganadorCombate.getNombre());

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

    

    public static int seleccionarArmas() {

        int acumulador = 0;
        for (Arma a : inventario) {
            acumulador++;
            System.out.println(acumulador + ". " + a.getNombre() + " y tiene un danio de: " + a.getDanio());
        }
        int respuesta = Teclado.nextInt();

        return respuesta;
      
    }

    public static void elegirArma(Personaje atacante, Personaje atacado) {
        System.out.println("Elija un arma");
        System.out.println("1. Espada (Anduril, Sting o Espada común)");
        System.out.println("2. Arco y flecha");
        System.out.println("3. Baculo");
        System.out.println("4. Hacha doble");
        int choice = Teclado.nextInt();


        switch (choice) {
            case 1:
                System.out.println("Seleccionando Espada... loading...");
                atacante.clavarEspada(atacado, atacante);
                break;
            case 2:
                System.out.println("Seleccionando Arco y flecha... loading");
                atacante.setArma(inventario.get(1));
                atacante.dispararFlecha(atacado);
                break;
            case 3:
                System.out.println("Seleccionando Baculo... loading");
                atacante.setArma(inventario.get(2));
                atacante.usarBaculo(atacado);
                break;
            case 4:
                System.out.println("Seleccionando Hacha doble... loading");
                atacante.setArma(inventario.get(4));
                atacante.clavarHacha(atacado);
                break;
            default:
                System.out.println("Opción inválida, elija entre 1, 2, 3 o 4!");
                break;

        }

    }

    public static int elegirReliquia() {
        int acumulador = 0;
        for (Reliquia r : reliquias) {
            acumulador++;
            System.out.println(acumulador + ". " + r.getNombre() + " y tiene un factor dano de: " + r.getFactorDeAtaque());
        }
        int respuesta = Teclado.nextInt();

        return respuesta;
    }

    public void usoAtaqueEpico(Personaje atacado, Arma armaActual) {

        IHaceMagia atacanteSupremo = (IHaceMagia) this;
        IEsMagico armaPoderosa = (IEsMagico) armaActual;
        if(atacanteSupremo.getEnergiaMagica() > armaPoderosa.getEnergiaMagica()){
            atacanteSupremo.ataqueEpico(atacado, armaActual);
            int restaMagia = atacanteSupremo.getEnergiaMagica() - armaPoderosa.getEnergiaMagica();
            atacanteSupremo.setEnergiaMagica(restaMagia);
        } else System.out.println("Uyyy, no pudiste ejecutar ataque epico!! Te falta magia");
                
    }

    public void eligeAtaqueConAnillo(Personaje atacado, Personaje atacante, String color) {

        System.out.println(color);
        System.out.println("Selecciona que ataque quieres ejecutar: ");
        System.out.println();
        System.out.println("1. Deseas cambiar de arma y atacar?");
        System.out.println("2. Ataque Epico");
        System.out.println("3. Quemadura (Aumenta el dano si tienes Anillo Narya)");
        System.out.println("4. invocar a Manwe");
        System.out.println("5. invocar a Ulmo");
        System.out.println(ANSI_RESET);

        int respuesta = Teclado.nextInt();

        switch (respuesta) {
            case 1:
                elegirArma(atacante, atacado);
                break;
            case 2:
                ((IHaceMagia) atacante).ataqueEpicoPoderoso(atacado);                 
                break;
            case 3:
                // ((AnilloNarya) ((ILlevaReliquia) atacante).getReliquia()).quemadura(atacado, atacante);
                break;
            case 4:
                atacante.atacar(atacado);
                break;
            default:
                System.out.println("Elige la opcion correcta!!");
                eligeAtaqueConAnillo(atacado, atacante, color);
                break;
        }
    }

    public void eligeAtaqueMagico(Personaje atacado, Personaje atacante, String color) {

        System.out.println(color);
        System.out.println("Selecciona que ataque quieres ejecutar: ");
        System.out.println();
        System.out.println("1. Deseas cambiar de arma y atacar?");
        System.out.println("2. Ataque Epico");
        System.out.println("3. Ataque Bola Magica (tiene un 70% chance de ataque y te aumenta 5 puntos de danio del arma!)");
        System.out.println("4. Despiadado");
        System.out.println(ANSI_RESET);

        int respuesta = Teclado.nextInt();

        switch (respuesta) {
            case 1:
                elegirArma(atacante, atacado);
                break;
            case 2:
                ((IHaceMagia) atacante).ataqueEpicoPoderoso(atacado);                 
                break;
            case 3:
                atacante.atacarBolaMagica(atacado);                
                break;
            case 4:
                atacante.atacar(atacado);
                break;
            default:
                System.out.println("Elige la opcion correcta!!");
                eligeAtaqueMagico(atacado, atacante, color);
                break;
        }
    }

    public void eligeAtaqueReliquia(Personaje atacado, Personaje atacante, String color) {

        System.out.println(color);
        System.out.println("Selecciona que ataque quieres ejecutar: ");
        System.out.println();
        System.out.println("1. Deseas cambiar de arma y atacar?");
        System.out.println("2. Ataque Sencillo");
        System.out.println("3. Invocacion de Nazgul (tiene un 80% chance de ataque y te aumenta 5 puntos de danio!)");
        System.out.println(ANSI_RESET);
        int respuesta = Teclado.nextInt();

        switch (respuesta) {
            case 1:                
                elegirArma(atacante, atacado); 
                break;
            case 2:
                atacante.atacar(atacado);
                break;
            case 3:
                atacante.atacarInnovandoNazgul(atacado);   
                break;       
            default:
                System.out.println("Elige la opcion correcta!!");
                eligeAtaqueReliquia(atacado, atacante, color);
                break;
        }

    }

    public void eligeAtaqueSencillo(Personaje atacado, Personaje atacante, String color) {
        System.out.println(color);
        System.out.println("Selecciona que ataque quieres ejecutar: ");
        System.out.println();
        System.out.println("1. Deseas cambiar de arma y atacar?");
        System.out.println("2. Ataque adsorber energia");
        System.out.println("3. Ataque Bruto");
        System.out.println("4. Ataque especial");
        System.out.println(ANSI_RESET);
        int respuesta = Teclado.nextInt();

        switch (respuesta) {
            case 1:
                elegirArma(atacante, atacado);                   
                break;
            case 2:
                atacante.atacar(atacado);    
                break;
            case 3:
                atacante.atacar(atacado);   
                break;
            case 4:
                atacante.atacar(atacado);
                break;
            default:
                System.out.println("Elige la opcion correcta!!");
                eligeAtaqueSencillo(atacado, atacante, color);
                break;
        }

    }

    public void usoAtaqueEpico(Personaje atacante, Personaje atacado, Arma armaActual) {
        IHaceMagia atacanteSupremo = (IHaceMagia) atacante;
        IEsMagico armaPoderosa = (IEsMagico) armaActual;
        if(atacanteSupremo.getEnergiaMagica() > armaPoderosa.getEnergiaMagica()){
            atacanteSupremo.ataqueEpico(atacado, armaActual);
            int restaMagia = atacanteSupremo.getEnergiaMagica() - armaPoderosa.getEnergiaMagica();
            atacanteSupremo.setEnergiaMagica(restaMagia);
        } else System.out.println("Uyyy, no pudiste ejecutar ataque epico!! Te falta magia");
                
    }

}