package app.armas;

import app.interfaces.IEsMagico;

public class Sting extends Espada implements IEsMagico{

    public Sting(String nombre, int danio, int stamina) {
        super(nombre, danio, stamina);
        this.setNombre("Sting Espada Magica");
        this.setDanio(350);
        this.setStamina(-250);
    }

    @Override
    public int getEnergiaMagica() {
        return 0;
    }

    @Override
    public void setEnergiaMagica(int energiaMagica) {

    }

}