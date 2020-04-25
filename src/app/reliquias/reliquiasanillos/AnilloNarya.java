package app.reliquias.reliquiasanillos;

import app.personajes.Personaje;
import app.personajes.criaturas.Elfo;
import app.personajes.humanos.Wizard;

import java.util.Scanner;

import app.interfaces.IHaceMagia;
import app.interfaces.ILlevaReliquia;
import app.interfaces.ILlevaArma;
import app.reliquias.Reliquia;
import app.armas.Arma;

public class AnilloNarya extends AnilloElfico {

    public AnilloNarya() {

    }

    public AnilloNarya(String nombre, double factorDeAtaque, double factorDeDefensa, int energiaMagica,
            double factorDeVelocidadDeAtaque) {
        super(nombre, factorDeAtaque, factorDeDefensa, energiaMagica, factorDeVelocidadDeAtaque);
       
    }

    private int danioFuego;
    @Override
    public int getDanioFuego() {
        return danioFuego;
    }
    @Override
    public void setDanioFuego(int danioFuego) {
        this.danioFuego = 20;
    }

    private int quemadura;    
    @Override                                                                                         
    public int getQuemadura() {
        return quemadura;
    }
    @Override
    public void setQuemadura(int quemadura) {
        this.quemadura = quemadura;
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
    public void quemadura(Personaje personaje, Personaje otroPersonaje, Wizard wizard, Elfo elfo, Arma arma, Reliquia reliquia, Scanner Teclado) {


        if ((personaje instanceof ILlevaReliquia && personaje instanceof IHaceMagia && personaje instanceof ILlevaArma)
                && (personaje.estaVivo() && otroPersonaje.estaVivo())
                && ((reliquia.getNombre().equals("Anillo Narya") && (Teclado.nextLine().equals(tecla))))) {

            System.out.println(
                    "Revelas a Narya en tu mano cuya gema parece ser más bien una pequeña brasa incandescente ansiosa por encenderse e incendiar a tu enemigo, en lugar que una simple piedra. \n Te concentras e invocas a la Llama de Anor. ¡Repentinamente, lenguas de fuego blanco envuelven tu arma y aumentan su daño!");

            quemadura = personaje.getArma().getDanio() + this.getDanioFuego();

            personaje.getArma().setDanio(quemadura);

            setConsumo((((IHaceMagia) personaje).getEnergiaMagica() - 50));

            ((IHaceMagia) personaje).setEnergiaMagica(getConsumo());

        } else {
        }

    }

}