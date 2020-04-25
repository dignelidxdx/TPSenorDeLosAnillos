package app.reliquias.reliquiasanillos;

import app.armas.Arma;
import app.interfaces.IHaceMagia;
import app.interfaces.ILlevaArma;
import app.interfaces.ILlevaReliquia;
import app.personajes.Personaje;
import app.reliquias.Reliquia;
import java.util.Scanner;

public class AnilloVilya extends AnilloElfico {

    public AnilloVilya() {

    }

    public AnilloVilya(String nombre, double factorDeAtaque, double factorDeDefensa, int energiaMagica,
            double factorDeVelocidadDeAtaque) {
        super(nombre, factorDeAtaque, factorDeDefensa, energiaMagica, factorDeVelocidadDeAtaque);
        this.setFactorDeVelocidadDeAtaque(0.15);

    }

    private double ataqueEPICOVilya;

    @Override
    public double setAtaqueEPICOVilya() {
        return ataqueEPICOVilya;
    }

    @Override
    public void getAtaqueEPICOVilya(double ataqueEPICOVilya) {
        this.ataqueEPICOVilya = ataqueEPICOVilya;
    }

    private int danioViento;

    @Override
    public int getDanioViento() {
        return danioViento;
    }

    @Override
    public void setDanioViento(int danioViento) {
        this.danioViento = 15;
    }

    private int vendaval;

    @Override
    public int getVendaval() {
        return vendaval;
    }

    @Override
    public void setVendaval(int vendaval) {
        this.vendaval = vendaval;
    }

    private int consumo;

    @Override
    public int getConsumo() {
        return consumo;
    }

    @Override
    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
    
    @Override
    public void invocarManwe(Personaje personaje, Personaje otroPersonaje, Reliquia reliquia, Arma arma, Scanner Teclado) {
        
        


        if ((personaje instanceof ILlevaReliquia && personaje instanceof IHaceMagia && personaje instanceof ILlevaArma && otroPersonaje instanceof ILlevaArma)
            && (personaje.estaVivo() && otroPersonaje.estaVivo())
            && ((reliquia.getNombre().equals("Anillo Vilya") && (Teclado.nextLine().equals(tecla))))) {
  
                
            System.out.println("Se levanta un vendaval. Gracias a Manwë, sientes que tus ataques se vuelven rápidos como el viento. Sin embargo, tu enemigo no corre la misma suerte. El viento en contra le dificulta blandir su arma como antes y debe hacer más esfuerzo para lograrlo.");

            
            this.ataqueEPICOVilya = personaje.getDanioDeAtaque() + ((((this.getFactorDeVelocidadDeAtaque() * 3) / 2) + 1.0) * personaje.getDanioDeAtaque());

            personaje.setDanioDeAtaque((int) ataqueEPICOVilya);

            setVendaval(otroPersonaje.getArma().getStamina() + this.getDanioViento());

            otroPersonaje.getArma().setStamina(getVendaval());

            setConsumo(((IHaceMagia) personaje).getEnergiaMagica() - 70);       
              
            ((IHaceMagia) personaje).setEnergiaMagica(getConsumo());
        }
            
            

    }

}
