package app.armas;

import app.interfaces.IEsMagico;

public class Anduril extends Espada implements IEsMagico {

    public Anduril(String nombre, int danio, int stamina, int energiaMagica) {
        super(nombre, danio, stamina);
        this.setNombre("Anduril Espada Magica");
        this.setDanio(25);
        this.setStamina(15);
        this.setEnergiaMagica(25);

    }

    @Override
    public int getEnergiaMagica() {
        System.out.println("Esta arma contiene una energía mágica de 25");
        return 25;
    }

    @Override
    public void setEnergiaMagica(int energiaMagica) {

    }

    public Anduril(String nombre, int danio, int stamina) {
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