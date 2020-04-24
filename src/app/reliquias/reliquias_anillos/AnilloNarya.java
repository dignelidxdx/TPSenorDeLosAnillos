package app.reliquias.reliquias_anillos;

import app.personajes.Personaje;

import java.util.Scanner;

import app.interfaces.IHaceMagia;
import app.interfaces.ILlevaReliquia;
import app.interfaces.ILlevaArma;
import app.personajes.criaturas.Elfo;
import app.personajes.humanos.Wizard;
import app.reliquias.Reliquia;
import app.armas.Arma;

public class AnilloNarya extends AnilloElfico {

    public AnilloNarya() {

    }

    public AnilloNarya(String nombre, double factorDeAtaque, double factorDeDefensa, int energiaMagica,
            double factorDeVelocidadDeAtaque, int danioFuego) {
        super(nombre, factorDeAtaque, factorDeDefensa, energiaMagica, factorDeVelocidadDeAtaque);
        this.setDanioFuego(danioFuego);
    }

    private int danioFuego;

    public int getDanioFuego() {
        return danioFuego;
    }

    public void setDanioFuego(int danioFuego) {
        this.danioFuego = 20;
    }

    public void quemadura(Personaje personaje, Personaje otroPersonaje, Arma arma, Reliquia reliquia, Scanner Teclado) {

        int quemadura;
        int consumo;
        String tecla = "E";

        if ((personaje instanceof ILlevaReliquia && personaje instanceof IHaceMagia && personaje instanceof ILlevaArma)
                && (personaje.estaVivo() && otroPersonaje.estaVivo())
                && ((reliquia.getNombre().equals("Anillo Narya") && (Teclado.nextLine().equals(tecla))))) {

            System.out.println(
                    "Revelas a Narya en tu mano cuya gema parece ser más bien una pequeña brasa incandescente ansiosa por encenderse e incendiar a tu enemigo, en lugar que una simple piedra. \n Te concentras e invocas a la Llama de Anor. ¡Repentinamente, lenguas de fuego envuelven tu arma y aumentan su daño!");

            quemadura = personaje.arma.getDanio() + this.getDanioFuego();

            personaje.arma.setDanio(quemadura);

            consumo = (((IHaceMagia) personaje).getEnergiaMagica() - 50);

            ((IHaceMagia) personaje).setEnergiaMagica(consumo);

        } else {
        }

    }

}