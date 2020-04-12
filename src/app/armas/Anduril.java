package app.armas;

import app.interfaces.IEsMagico;

public class Anduril extends Espada implements IEsMagico {

    public Anduril(String nombre, int danio, int stamina) {
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