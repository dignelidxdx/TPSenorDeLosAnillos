package app.armas;

import app.interfaces.IEsMagico;

public class Anduril extends Espada implements IEsMagico {

    public Anduril(String nombre, int danio, int stamina) {
        super(nombre, danio, stamina);
        this.setNombre("Anduril Espada Magica");
        this.setDanio(650);
        this.setStamina(-300);
    }

    @Override
    public int getEnergiaMagica() {
        return 0;
    }

    @Override
    public void setEnergiaMagica(int energiaMagica) {

    }

    
    

}