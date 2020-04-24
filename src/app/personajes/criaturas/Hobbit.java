package app.personajes.criaturas;

import app.JuegoLOTR;
import app.armas.Arma;
import app.interfaces.ILlevaReliquia;
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

 
    public void seleccionReliquiaPrincipal() {
        System.out.println("Selecciona tu reliquia " + this.getNombre());
        int respuesta = JuegoLOTR.elegirReliquia();
        this.setReliquia(JuegoLOTR.reliquias.get(respuesta - 1));
        System.out.println(" Tu reliquia es: " + this.getReliquia().getNombre());
    }
    

}