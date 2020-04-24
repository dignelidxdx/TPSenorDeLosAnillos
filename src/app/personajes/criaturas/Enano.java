package app.personajes.criaturas;

import app.armas.Arma;

public class Enano extends Criatura {

    public Enano() {
        
    }

    public Enano(String nombre, int salud, int stamina) {
        super(nombre, salud, stamina);
        super.setDefensaBase(8);
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


}