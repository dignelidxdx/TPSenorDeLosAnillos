package app.armas;

import app.interfaces.IEsMagico;

public class Baculo extends Arma implements IEsMagico{

    public Baculo(String nombre, int danio, int stamina) {
        super(nombre, danio, stamina);
        this.setNombre("Baculo");
        this.setDanio(150);
        this.setStamina(-100);
    }

    @Override
    public int getEnergiaMagica() {
        return 0;
    }

    @Override
    public void setEnergiaMagica(int energiaMagica) {

    }

   

}