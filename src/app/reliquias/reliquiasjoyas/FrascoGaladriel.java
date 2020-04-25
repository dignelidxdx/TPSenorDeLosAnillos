package app.reliquias.reliquiasjoyas;

import app.interfaces.IEsMagico;
import app.interfaces.IHaceMagia;
import app.interfaces.ILlevaReliquia;
import app.personajes.Personaje;
import app.reliquias.Reliquia;
import java.util.Scanner;

public class FrascoGaladriel extends Reliquia implements IEsMagico {

    public FrascoGaladriel() {
        this.setNombre("Frasco de Galadriel");
        this.setFactorDeAtaque(-0.10);
        this.setFactorDeDefensa(0.20);
        this.setEnergiaMagica(energiaMagica);
    }

    public FrascoGaladriel(String nombre, double factorDeAtaque, double factorDeDefensa, int energiaMagica) {
        super(nombre, factorDeAtaque, factorDeDefensa);
        

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

    @Override
    public int getConsumo() {
        
        return 0;
    }

    @Override
    public void setConsumo(int consumo) {
       

    }


    public void ataqueEpico(Personaje personaje, Personaje otroPersonaje, Reliquia reliquia,
            FrascoGaladriel frascoGaladriel, Scanner Teclado) {


        if ((personaje instanceof ILlevaReliquia && personaje instanceof IHaceMagia)
                && (personaje.estaVivo() && otroPersonaje.estaVivo())
                && ((reliquia.getNombre().equals("Frasco de Galadriel") && (Teclado.nextLine().equals(tecla))))) {
            
            System.out.println("O Elbereth! Gilthoniel!");       
            
            double ataqueEPICO;

            ataqueEPICO = personaje.getDefensaBase() * (this.getFactorDeDefensa() + 1.52);

            personaje.setDefensaBase((int) ataqueEPICO);

            

            setConsumo((int) (((IHaceMagia) personaje).getEnergiaMagica() - (this.getEnergiaMagica() * 0.25)));

            ((IHaceMagia) personaje).setEnergiaMagica(getConsumo());

        } else {
        }

    }

    
}
