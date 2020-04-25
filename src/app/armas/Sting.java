package app.armas;

import app.interfaces.IEsMagico;

public class Sting extends Espada implements IEsMagico{

    public Sting(String nombre, int danio, int stamina, int energiaMagica) {
        super(nombre, danio, stamina);
        this.setNombre("Sting Espada mágica");
        this.setDanio(20);
        this.setStamina(20);
        this.setEnergiaMagica(20);
    }

    @Override
    public int getEnergiaMagica() {
        return 0;
    }

    @Override
    public void setEnergiaMagica(int energiaMagica) {

    }

    public Sting(String nombre, int danio, int stamina) {
        super(nombre, danio, stamina);
    }

    @Override
    public int getConsumo() {
        
        return 0;
    }

    @Override
    public void setConsumo(int consumo) {
       

    }

}