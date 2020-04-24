package app.personajes.humanos;

import app.JuegoLOTR;
import app.armas.Arma;
import app.interfaces.IHaceMagia;
import app.personajes.Personaje;
import app.reliquias.Reliquia;

public class Wizard extends Humano implements IHaceMagia {

    private int energiaMagica;
    private Reliquia reliquia;
    
    public Wizard() {
        super.setDefensaBase(4);
        this.setSalud(70);
        this.setEnergiaMagica(25);
    }

    public Wizard(String nombre, int salud, int stamina, Reliquia reliquia, int energiaMagica) {
        super(nombre, salud, stamina, reliquia);
        super.setDefensaBase(4);
        this.setEnergiaMagica(90);
        
    }
    public Wizard(String nombre, int stamina) {
        super(nombre, stamina);
        super.setDefensaBase(4);
        super.setSalud(70);
        this.setEnergiaMagica(25);

    }
    
    public int getEnergiaMagica() {
        return energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }

    public Reliquia getReliquia() {
        return reliquia;
    }

    public void setReliquia(Reliquia reliquia) {
        this.reliquia = reliquia;
    }

    @Override
    public boolean puedoEjecutarAtaqueEpico() {
        // TODO Auto-generated method stub
        if(this.getStamina() > 10 && this.getEnergiaMagica() > 5) {
            return true;
        } else return false;      
    }

    int cont = 2;

    public void usarRevivir() {
        
        if(cont > 0) {
            int vidaxCurar = (int) (this.getSalud() + 15);
            this.setSalud(vidaxCurar);
            cont--;
        } else System.out.println("Uhh ya no tienes revivir!");
        
    }

    @Override
    public void ataqueEpico(Personaje personaje, Arma arma) {

        if(puedoEjecutarAtaqueEpico()) {        
         
            int vidaActual = 0;
            vidaActual = (int) (personaje.getSalud() 
                    - (arma.getDanio() * (this.getReliquia().getFactorDeAtaque() + 1)));

            personaje.setSalud(vidaActual);

            int staminaRestante = this.getStamina() - 10;
            this.setStamina(staminaRestante);

            int magiaRestante = this.getEnergiaMagica() - 5;
            this.setEnergiaMagica(magiaRestante);

            System.out.println("Ejecute un ataque epico a: " + personaje.getNombre() + " y quedo con vida: " 
            + personaje.getSalud() + " Soy un wizard feliz");

        } else System.out.println("Uhh no tienes magia o stamina!!");
    }


    public void ataqueEpicoPoderoso(Personaje personaje) {

        if(puedoEjecutarAtaqueEpico()) {        
         
            int vidaActual = 0;
            vidaActual = (int) ((personaje.getSalud() + (personaje.getDefensaBase() * (( this.getReliquia().getFactorDeDefensa() + 1))))
           - (this.getArma().getDanio() * (this.getReliquia().getFactorDeAtaque() + 1)));

            personaje.setSalud(vidaActual);

            this.setStamina(this.getStamina() - 10);

            this.setEnergiaMagica(this.getEnergiaMagica() - 5);

            System.out.println("Ejecute un ataque epico a: " + personaje.getNombre() + " y quedo con vida: " 
            + personaje.getSalud() + ". Soy un Wizard Poderoso!");

        } else System.out.println("Uhh no tienes magia o stamina!!");
    }
    public void atacarBolaMagica(Personaje atacado) {

        int posicionRandom = random.nextInt(10) + 1;

        if (this.getStamina() > this.getArma().getStamina() && posicionRandom > 3) {

            atacado.setSalud((int) ((atacado.getSalud() + atacado.getDefensaBase())
                    - ((this.getArma().getDanio() + 6) * (this.getReliquia().getFactorDeAtaque() + 1))));

            this.setStamina(this.getStamina() - this.getArma().getStamina());
            System.out.println();
            System.out.println(this.getNombre() + " ejecutaste ataque Bola Mágica...");
            System.out.println();
            System.out.println("El personaje: " + atacado.getNombre() + " quedo con salud: " + atacado.getSalud());
            System.out.println();
        } else if(this.getStamina() < this.getArma().getStamina()) {
            usarPosion(this);
        } else System.out.println("Uhh! Fallaste!!");

    }

    private Arma arma;
    @Override
    public Arma getArma() {
        // TODO Auto-generated method stub
        return arma;
    }

    @Override
    public void setArma(Arma arma) {

        this.arma = arma;

        // TODO Auto-generated method stub
    }

    public void seleccionReliquiaPrincipal() {
        System.out.println("Selecciona tu reliquia " + this.getNombre());
        int respuesta = JuegoLOTR.elegirReliquia();
        this.setReliquia(JuegoLOTR.reliquias.get(respuesta - 1));

        System.out.println(" Tu reliquia es: " + this.getReliquia().getNombre());
    }

    


}
