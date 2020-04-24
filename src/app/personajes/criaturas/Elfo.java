package app.personajes.criaturas;

import app.JuegoLOTR;
import app.armas.Arma;
import app.interfaces.IHaceMagia;
import app.interfaces.ILlevaReliquia;
import app.personajes.Personaje;
import app.reliquias.Reliquia;

public class Elfo extends Criatura implements IHaceMagia, ILlevaReliquia {

    private int energiaMagica;
    private Reliquia reliquia;

    public Elfo() {
        
    }

    public Elfo(String nombre, int salud, int stamina) {
        super(nombre, salud, stamina);
        super.setDefensaBase(6);
        
    }

    public Elfo(String nombre, int salud, int stamina, int energiaMagica, Reliquia reliquia) {
        super(nombre, salud, stamina);
        super.setDefensaBase(6);
        this.energiaMagica = energiaMagica;
        this.reliquia = reliquia;
    }

    public Elfo(String nombre, int salud, int stamina, int energiaMagica) {
        super(nombre, salud, stamina);
        super.setDefensaBase(6);
        this.energiaMagica = energiaMagica;
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

        if(this.getStamina() > 10 && this.getEnergiaMagica() > 20) {
            return true;
        }
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void ataqueEpico(Personaje personaje, Arma arma) {
        // TODO Auto-generated method stub

        
        this.setReliquia(JuegoLOTR.reliquias.get(0));

        if(this.getStamina() > 10 && this.getEnergiaMagica() > 20) {
         
            int vidaActual = 0;
            vidaActual = (int) (personaje.getSalud() - (arma.getDanio() * (this.getReliquia().getFactorDeAtaque() + 1))); 
            personaje.setSalud(vidaActual);

            int staminaRestante = this.getStamina() - 10;
            this.setStamina(staminaRestante);

            int magiaRestante = this.getEnergiaMagica() - 20;
            this.setEnergiaMagica(magiaRestante);

            System.out.println("Ejecute un ataque epico a: " + personaje.getNombre() + " y quedo con vida: " 
            + personaje.getSalud() + " Soy un elfo feliz");
        } else System.out.println("Uhhh no tienes energia magica o stamina para ejecutar el ataque!");
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

    public void ataqueEpicoPoderoso(Personaje personaje) {

        if(puedoEjecutarAtaqueEpico()) {        

            int vidaActual = (int) ((personaje.getSalud() + (personaje.getDefensaBase() * (((ILlevaReliquia) personaje)
                    .getReliquia().getFactorDeDefensa()
                    + 1)))
            - (this.getArma().getDanio() * (this.getReliquia().getFactorDeAtaque() + 1)));

            personaje.setSalud(vidaActual);

            this.setStamina(this.getStamina() - 10);

            this.setEnergiaMagica(this.getEnergiaMagica() - 20);
            System.out.println();
            System.out.println("Ejecute un ataque epico a: " + personaje.getNombre() + " y quedo con vida: " 
            + personaje.getSalud() + " Soy un Elfo Poderoso!");
            System.out.println();
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

    public void seleccionReliquiaPrincipal() {
        System.out.println("Selecciona tu reliquia " + this.getNombre());
        int respuesta= JuegoLOTR.elegirReliquia();
        this.setReliquia(JuegoLOTR.reliquias.get(respuesta - 1));

        System.out.println(" Tu reliquia es: " + this.getReliquia().getNombre());
    }
    
}