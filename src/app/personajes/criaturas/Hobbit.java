package app.personajes.criaturas;

import app.JuegoLOTR;
import app.armas.Arma;
import app.interfaces.ILlevaReliquia;
import app.personajes.Personaje;
import app.reliquias.Reliquia;


public class Hobbit extends Criatura implements ILlevaReliquia {

    private Reliquia reliquia;

    public Hobbit(String nombre, int salud, int stamina) {
        super(nombre, salud, stamina);
        super.setDefensaBase(6);

    }

    public Reliquia getReliquia() {
        return reliquia;
    }

    public void setReliquia(Reliquia reliquia) {
        this.reliquia = reliquia;
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

    public void atacarInnovandoNazgul(Personaje atacado) {

        int posicionRandom = random.nextInt(10) + 1;

        if (this.getStamina() > this.getArma().getStamina() && posicionRandom > 2) {

            atacado.setSalud((int) ((atacado.getSalud() + (atacado.getDefensaBase() * (((ILlevaReliquia) atacado).getReliquia().getFactorDeDefensa() + 1)))
                    - ((this.getArma().getDanio() + 5) * (this.getReliquia().getFactorDeAtaque() + 1))));

            this.setStamina(this.getStamina() - this.getArma().getStamina());
            System.out.println();
            System.out.println("Invocación de los Nazgul!!");
            System.out.println("Los Hobbit bailan para celebrar el daño a ejecutar...");
            System.out.println();
            System.out.println("El Player: " + atacado.getNombre() + " quedo con salud: " + atacado.getSalud());

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