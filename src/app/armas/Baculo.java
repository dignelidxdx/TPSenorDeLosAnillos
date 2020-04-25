package app.armas;

import app.interfaces.IEsMagico;

public class Baculo extends Arma implements IEsMagico{

    public Baculo(String nombre, int danio, int stamina, int energiaMagica) {
        super(nombre, danio, stamina);
        this.setNombre("Baculo");
        this.setDanio(38);
        this.setStamina(30);
        this.setEnergiaMagica(50);
    }

    @Override
    public int getEnergiaMagica() {
        return 0;
    }

    @Override
    public void setEnergiaMagica(int energiaMagica) {

    }

    @Override
    public int getConsumo() {
        
        return 0;
    }

    @Override
    public void setConsumo(int consumo) {
        

    }

   

}