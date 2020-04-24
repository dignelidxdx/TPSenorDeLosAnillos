package app.personajes.humanos;

import app.JuegoLOTR;
import app.armas.Arma;
import app.interfaces.ILlevaReliquia;
import app.personajes.Personaje;
import app.reliquias.Reliquia;

public class Humano extends Personaje implements ILlevaReliquia {

    private Reliquia reliquia;

    public Humano() {
    }

    public Humano(String nombre, int salud, int stamina, Reliquia reliquia) {
        super(nombre, salud, stamina);
        this.reliquia = reliquia;
    }

    public Humano(String nombre, int salud, int stamina) {
        super(nombre, salud, stamina);
        super.setDefensaBase(7);
    }

    public Humano(String nombre, int stamina) {
        super(nombre, stamina);
        super.setDefensaBase(7);
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

    public void setReliquia(Reliquia reliquia) {
        this.reliquia = reliquia;
    }

    public void regeneracionVida(Humano personaje) {
        int regVida = personaje.getSalud() + 8; 
        personaje.setSalud(regVida);
    }

    public void usarRevivir() {
        
    }

    @Override
    public Reliquia getReliquia() {
        // TODO Auto-generated method stub
        return reliquia;
    }

    public void atacarInnovandoNazgul(Personaje atacado) {

        int posicionRandom = random.nextInt(10) + 1;

    if (this.getStamina() > this.getArma().getStamina() && posicionRandom > 2) {

        atacado.setSalud((int) ((atacado.getSalud() + (atacado.getDefensaBase() * (((ILlevaReliquia) atacado).getReliquia().getFactorDeDefensa() + 1)))
                - ((this.getArma().getDanio() + 5) * (this.getReliquia().getFactorDeAtaque() + 1))));

        this.setStamina(this.getStamina() - this.getArma().getStamina());
        System.out.println();
        System.out.println("Invocaste a los Nazgul!! El ambiente se puso tenso en el territorio...");
        System.out.println();
        System.out.println("Los Humanos aumentan su confianza!!");
        System.out.println("El personaje: " + atacado.getNombre() + " quedo con salud: " + atacado.getSalud());

    } else if(this.getStamina() < this.getArma().getStamina()) {
        usarPosion(this);
    } else System.out.println("Uhh! Fallaste!!");
}

    public void seleccionReliquiaPrincipal() {
        System.out.println("Selecciona tu reliquia " + this.getNombre());
        int respuesta = JuegoLOTR.elegirReliquia();
        this.setReliquia(JuegoLOTR.reliquias.get(respuesta - 1));

        System.out.println(" Tu reliquia es: " + this.getReliquia().getNombre());
    }
    
}