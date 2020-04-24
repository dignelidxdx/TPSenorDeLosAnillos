package app.reliquias.reliquias_anillos;

import app.interfaces.IEsMagico;
import app.reliquias.Reliquia;

public class AnilloDePoder extends Reliquia implements IEsMagico {

    //**Constructor */

    public AnilloDePoder() {
        
    }

    public AnilloDePoder(String nombre, double factorDeAtaque, double factorDeDefensa, int energiaMagica, double factorDeVelocidadDeAtaque) {
        super(nombre, factorDeAtaque, factorDeDefensa);
        
        this.setFactorDeVelocidadDeAtaque(factorDeVelocidadDeAtaque);
        
    }

    public AnilloDePoder(String nombre, double factorDeAtaque, double factorDeDefensa, int energiaMagica) {
        super(nombre, factorDeAtaque, factorDeDefensa);
        this.setEnergiaMagica(energiaMagica);
       
        
    }
    
    private int energiaMagica;
    @Override
    public int getEnergiaMagica() {
        return energiaMagica;
    }
    @Override
    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = 10;
    }
    

    private double factorDeVelocidadDeAtaque;
    public double getFactorDeVelocidadDeAtaque() {
        return factorDeVelocidadDeAtaque;
    }

    public void setFactorDeVelocidadDeAtaque(double factorDeVelocidadDeAtaque) {
        this.factorDeVelocidadDeAtaque = factorDeVelocidadDeAtaque;

    }
}