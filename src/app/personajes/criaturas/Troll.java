package app.personajes.criaturas;

import app.armas.Arma;

public class Troll extends Criatura {

    public void Trol() {
        
    }


    public Troll(String nombre, int salud, int stamina) {
        super(nombre, salud, stamina);
        super.setDefensaBase(10);        
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