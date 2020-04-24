package app.reliquias.reliquiasjoyas;

import app.interfaces.IEsMagico;
import app.interfaces.IHaceMagia;
import app.interfaces.ILlevaReliquia;
import app.personajes.Personaje;
import app.reliquias.Reliquia;
import java.util.Scanner;

public class FrascoGaladriel extends Reliquia implements IEsMagico {

    public FrascoGaladriel() {

    }

    public FrascoGaladriel(String nombre, double factorDeAtaque, double factorDeDefensa, int energiaMagica) {
        super(nombre, factorDeAtaque, factorDeDefensa);
        this.setFactorDeDefensa(0.08);
        this.setEnergiaMagica(energiaMagica);

    }

    private int energiaMagica;

    @Override
    public int getEnergiaMagica() {
        return energiaMagica;
    }

    @Override
    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = 20;
    }

    public void ataqueEpico(Personaje personaje, Personaje otroPersonaje, Reliquia reliquia,
            FrascoGaladriel frascoGaladriel, Scanner Teclado) {

        

        if ((personaje instanceof ILlevaReliquia && personaje instanceof IHaceMagia)
                && (personaje.estaVivo() && otroPersonaje.estaVivo())
                && ((reliquia.getNombre().equals("Frasco de Galadriel") && (Teclado.nextLine().equals(tecla))))) {

            double ataqueEPICO;

            ataqueEPICO = personaje.getDefensaBase() * (this.getFactorDeDefensa() + 1.52);

            personaje.setDefensaBase((int) ataqueEPICO);

            

       

    }

}
