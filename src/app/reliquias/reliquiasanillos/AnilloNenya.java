package app.reliquias.reliquiasanillos;

import java.util.Scanner;

import app.interfaces.IHaceMagia;
import app.interfaces.ILlevaReliquia;
import app.personajes.Personaje;
import app.personajes.criaturas.Elfo;
import app.personajes.humanos.Wizard;
import app.reliquias.Reliquia;

public class AnilloNenya extends AnilloElfico {

    public AnilloNenya() {

    }

    public AnilloNenya(String nombre, double factorDeAtaque, double factorDeDefensa, int energiaMagica,
            double factorDeVelocidadDeAtaque) {
        super(nombre, factorDeAtaque, factorDeDefensa, energiaMagica, factorDeVelocidadDeAtaque);
        this.setEnergiaMagica(+40);
        this.setFactorDeDefensa(+0.30);

    }

    private int danioHielo;
    @Override
    public int getDanioHielo() {
        return danioHielo;
    }
    @Override
    public void setDanioHielo(int danioHielo) {
        this.danioHielo = 50;
    }
    
    private double ataqueEPICO;
    @Override
    public double getAtaqueEPICO() {
        return ataqueEPICO;
    }
    @Override
    public void setAtaqueEPICO(int ataqueEPICO) {
        this.ataqueEPICO = ataqueEPICO;
    }

    private int escarcha;   
    @Override                                                                                          
    public int getEscarcha() {
        return escarcha;
    }
    @Override
    public void setEscarcha(int escarcha) {
        this.escarcha = escarcha;
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
    public void invocacionUlmo(Personaje personaje, Personaje otroPersonaje, Reliquia reliquia, Wizard wizard,
            Elfo elfo, Scanner Teclado) {
     

        if (((personaje instanceof ILlevaReliquia && personaje instanceof IHaceMagia
                && otroPersonaje instanceof IHaceMagia) && (personaje.estaVivo() && otroPersonaje.estaVivo())
                && (personaje.getSalud() <= personaje.getSalud() * 0.15))
                && ((reliquia.getNombre().equals("Anillo Nenya") && (Teclado.nextLine().equals(tecla))))) {

            System.out.println(
                    "Tus lágrimas de dolor han conmovido al corazón de Ulmo, quien desata su furia contra tu enemigo");

            this.ataqueEPICO = otroPersonaje.getSalud() - (otroPersonaje.getSalud() * 0.70);

            otroPersonaje.setSalud((int) ataqueEPICO);

            setEscarcha(((IHaceMagia) otroPersonaje).getEnergiaMagica() - this.getDanioHielo());

            ((IHaceMagia) otroPersonaje).setEnergiaMagica(getEscarcha());

            setConsumo(((IHaceMagia) personaje).getEnergiaMagica() - 70);

            ((IHaceMagia) personaje).setEnergiaMagica(getConsumo());

        } else {
        }

    }


    

    
}