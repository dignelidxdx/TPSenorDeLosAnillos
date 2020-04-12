package app.armas;

import app.interfaces.IEsMagico;

public class Baculo extends Arma implements IEsMagico{

    public Baculo(String nombre, int danio, int stamina) {
        super(nombre, danio, stamina);
    }

    @Override
    public int getEnergiaMagica() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setEnergiaMagica(int energiaMagica) {
        // TODO Auto-generated method stub

    }

   

}