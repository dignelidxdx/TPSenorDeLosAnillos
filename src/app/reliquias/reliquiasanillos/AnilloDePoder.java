package app.reliquias.reliquiasanillos;

import java.util.Scanner;

import app.armas.Arma;
import app.interfaces.IEsMagico;
import app.interfaces.ISonAnillos;
import app.personajes.Personaje;
import app.personajes.criaturas.Elfo;
import app.personajes.humanos.Wizard;
import app.reliquias.Reliquia;

public class AnilloDePoder extends Reliquia implements IEsMagico, ISonAnillos {

    // **Constructor */

    public AnilloDePoder() {

    }

    public AnilloDePoder(String nombre, double factorDeAtaque, double factorDeDefensa, int energiaMagica,
            double factorDeVelocidadDeAtaque) {
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

    @Override
    public int getQuemadura() {
        
        return 0;
    }

    @Override
    public void setQuemadura(int quemadura) {
        

    }

    @Override
    public int getDanioFuego() {
        
        return 0;
    }

    @Override
    public void setDanioFuego(int danioFuego) {
        

    }

    @Override
    public void quemadura(Personaje personaje, Personaje otroPersonaje, Wizard wizard, Elfo elfo, Arma arma,
            Reliquia reliquia, Scanner Teclado) {
        

    }

    @Override
    public int getDanioHielo() {
        
        return 0;
    }

    @Override
    public void setDanioHielo(int danioHielo) {
        

    }

    @Override
    public double getAtaqueEPICO() {
        
        return 0;
    }

    @Override
    public void setAtaqueEPICO(int ataqueEPICO) {
        

    }

    @Override
    public int getEscarcha() {
        
        return 0;
    }

    @Override
    public void setEscarcha(int escarcha) {
        

    }

    @Override
    public void invocacionUlmo(Personaje personaje, Personaje otroPersonaje, Reliquia reliquia, Wizard wizard,
            Elfo elfo, Scanner Teclado) {
        

    }

    @Override
    public double setAtaqueEPICOVilya() {
        
        return 0;
    }

    @Override
    public void getAtaqueEPICOVilya(double ataqueEPICOVilya) {
        

    }

    @Override
    public int getDanioViento() {
        
        return 0;
    }

    @Override
    public void setDanioViento(int danioViento) {
        

    }

    @Override
    public int getVendaval() {
        
        return 0;
    }

    @Override
    public void setVendaval(int vendaval) {
        

    }

    @Override
    public void invocarManwe(Personaje personaje, Personaje otroPersonaje, Reliquia reliquia, Arma arma,
            Scanner Teclado) {
        

    }

    @Override
    public int getConsumo() {
        
        return 0;
    }

    @Override
    public void setConsumo(int consumo) {
        

    }
}