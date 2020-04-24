package app.reliquias.reliquias_anillos;

import app.armas.Arma;
import app.interfaces.IHaceMagia;
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

    public double setAtaqueEPICOVilya() {
        return ataqueEPICOVilya;
    }

    public void getAtaqueEPICOVilya(double ataqueEPICOVilya) {
        this.ataqueEPICOVilya = ataqueEPICOVilya;
    }

    private int danioViento;

    public int getDanioViento() {
        return danioViento;
    }

    public void setDanioViento(int danioViento) {
        this.danioViento = 15;
    }

    public void invocarManwe(Personaje personaje, Personaje otroPersonaje, Reliquia reliquia, Arma arma, Scanner Teclado) {
        
        int vendaval;
        int consumo;
        String tecla = "E";

        if ((personaje instanceof ILlevaReliquia && personaje instanceof IHaceMagia && personaje instanceof ILlevaArma && otroPersonaje instanceof ILlevaArma)
            && (personaje.estaVivo() && otroPersonaje.estaVivo())
            && ((reliquia.getNombre().equals("Anillo Vilya") && (Teclado.nextLine().equals(tecla))))) {
  
                
            System.out.println("Se levanta un vendaval. Gracias a Manwë, sientes que tus ataques se vuelven rápidos como el viento. Sin embargo, tu enemigo no corre la misma suerte. El viento en contra le dificulta blandir su arma como antes y debe hacer más esfuerzo para lograrlo.")

            
            this.ataqueEPICOVilya = personaje.getDanioDeAtaque() + ((((this.getFactorDeVelocidadDeAtaque() * 3) / 2) + 1.0) * personaje.getDanioDeAtaque());

            personaje.setDanioDeAtaque((int) ataqueEPICOVilya);


            vendaval = otroPersonaje.arma.getStamina() + this.getDanioViento();

            otroPersonaje.arma.setStamina(danioViento);

            consumo = (((IHaceMagia) personaje).getEnergiaMagica() - 70);
    
            ((IHaceMagia) personaje).setEnergiaMagica(consumo);
        
        } else {}
            

    }

}
