package app.reliquias.reliquias_anillos;

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
            double factorDeVelocidadDeAtaque, int danioHielo) {
        super(nombre, factorDeAtaque, factorDeDefensa, energiaMagica, factorDeVelocidadDeAtaque);
        this.setDanioHielo(danioHielo);
        this.setEnergiaMagica(+40);
        this.setFactorDeDefensa(+0.30);

    }

    private int danioHielo;

    public int getDanioHielo() {
        return danioHielo;
    }

    public void setDanioHielo(int danioHielo) {
        this.danioHielo = 50;
    }

    private double ataqueEPICO;

    public double getAtaqueEPICO() {
        return ataqueEPICO;
    }

    public void setAtaqueEPICO(int ataqueEPICO) {
        this.ataqueEPICO = ataqueEPICO;
    }

    public void invocacionUlmo(Personaje personaje, Personaje otroPersonaje, Reliquia reliquia, Wizard wizard,
            Elfo elfo, Scanner Teclado) {

        int escarcha;
        int consumo;
        String tecla = "E";

        if (((personaje instanceof ILlevaReliquia && personaje instanceof IHaceMagia
                && otroPersonaje instanceof IHaceMagia) && (personaje.estaVivo() && otroPersonaje.estaVivo())
                && (personaje.getSalud() <= personaje.getSalud() * 0.15))
                && ((reliquia.getNombre().equals("Anillo Nenya") && (Teclado.nextLine().equals(tecla))))) {

            System.out.println(
                    "Tus lágrimas de dolor han conmovido al corazón de Ulmo, quien desata su furia contra tu enemigo");

            this.ataqueEPICO = otroPersonaje.getSalud() - (otroPersonaje.getSalud() * 0.70);

            otroPersonaje.setSalud((int) ataqueEPICO);

            escarcha = ((IHaceMagia) otroPersonaje).getEnergiaMagica() - this.getDanioHielo();

            ((IHaceMagia) otroPersonaje).setEnergiaMagica(escarcha);

            consumo = (((IHaceMagia) personaje).getEnergiaMagica() - 70);

            ((IHaceMagia) personaje).setEnergiaMagica(consumo);

        } else {
        }

    }
}