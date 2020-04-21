package app.armas;

import app.interfaces.IEsMagico;

public class Sting extends Espada implements IEsMagico{

    public Sting(String nombre, int danio, int stamina) {
        super(nombre, danio, stamina);
        this.setEnergiaMagica(20);
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