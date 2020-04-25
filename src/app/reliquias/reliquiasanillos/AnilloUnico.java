package app.reliquias.reliquiasanillos;

import java.util.Scanner;

import app.armas.Arma;
import app.interfaces.IHaceMagia;
import app.interfaces.ILlevaArma;
import app.interfaces.ILlevaReliquia;
import app.personajes.Personaje;
import app.personajes.criaturas.Elfo;
import app.personajes.humanos.Wizard;
import app.reliquias.Reliquia;


public class AnilloUnico extends AnilloDePoder {

    public AnilloUnico() {
        this.setNombre("Anillo Unico");
        this.setFactorDeAtaque(+0.20);
        this.setFactorDeDefensa(+0.01);
        this.setEnergiaMagica(+60);
        this.setFactorDeVelocidadDeAtaque(+0.07);
        this.setSalud(salud);
        this.setFactorRegeneracionSalud(factorRegeneracionSalud);
        this.setFactorRegeneracionStamina(factorRegeneracionStamina);
    }

    public AnilloUnico(String nombre, double factorDeAtaque, double factorDeDefensa, int energiaMagica,
            double factorDeVelocidadDeAtaque, int salud, double factorRegeneracionSalud, double getFactorRegeneracionStamina) {
        super(nombre, factorDeAtaque, factorDeDefensa, energiaMagica, factorDeVelocidadDeAtaque);
        this.setEnergiaMagica(+60);
        this.setFactorDeAtaque(+0.20);
        this.setFactorDeVelocidadDeAtaque(+0.07);
        this.setSalud(salud);
        this.setFactorRegeneracionSalud(factorRegeneracionSalud);
        this.setFactorRegeneracionStamina(factorRegeneracionStamina);

    }

    // Aumenta mucho los puntos de salud estando equipado
    // Disminuye en gran medida la regeneracion de salud
    // Aumenta en gran medida la regeneracion de estamina estando equipado
    // Aumenta en gran porcentaje el factorDeEvasion estando equipado
    // Aumenta en parte el factorDeVelocidadDeAtaque estando equipado
    // Aumenta aun mas los puntos de energiaMagica estando equipado

    // Si su contrincante tiene uno de Los Tres y lo usa, refleja el daño base de
    // ese anillo y refleja el doble del ataqueEpico hacia éste, mientras está
    // equipado.
    // El jugador recibe solo el 40% del daño original del ataqueEpico. Requiere 95%
    // de la energiaMagica total y el 10% de los puntos totales de salud. Se activa
    // con tecla.
    // Si dispone de al menos 20% de la energiaMagica total, mientras está equipado,
    // puede invocar al Nazgûl Witchking para que pelee junto a él por 3 turnos.
    // Nazgûl Witchking tiene chance propia pero muy baja de aplicar Hoja Espectral,
    // que quita puntos de estamina del contrincante y disminuye su regeneracion por
    // 3 turnos a la mitad. Se activa con tecla.
    // Si dispone de al menos 80% de energiaMagica total y de 40% de estamina total
    // y 20% de salud total, mientras está equipado,
    // puede invocar a Los Nueve para que rodeen a su contrincante y con su chillido
    // imbuyan panico en el corazon de éste,
    // para que con ello, disminuyan su factorDeEvasion, su factorDeDefensa, su
    // factorDeAtaque, su factorDeVelocidadDeAtaque y la regeneracion de stamina y
    // salud.

    // Cada vez que se asesta un golpe con el arma equipada, hay 15% de chance de
    // que el Anillo traicione a su portador deslizandose fuera de su dedo.
    // Esto deja al jugador con un 25% más de puntos totales que los que adiciona a
    // la salud total el Unico al equiparse. La salud se regenera completamente,
    // pero la estamina queda en un 40% del total con regeneracion disminuida en
    // 75%, y la energiaMagica cae a 10% del total de puntos y baja su regeneración
    // 50%.

    // Como siempre, El Unico, sirve a su verdadero amo...

    private int salud;

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = +75;
    }

    // agrego factorRegeneracionSalud.

    private double factorRegeneracionSalud;

    public double getFactorRegeneracionSalud() {
        return factorRegeneracionSalud;
    }

    public void setFactorRegeneracionSalud(double factorRegeneracionSalud) {
        this.factorRegeneracionSalud = -0.75;
    }

    // agrego factorRegeneracionStamina

    private double factorRegeneracionStamina;

    public double getFactorRegeneracionStamina() {
        return factorRegeneracionStamina;
    }

    public void setFactorRegeneracionStamina(double factorRegeneracionStamina) {
        this.factorRegeneracionStamina = +0.75;
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

    @Override
    public void invocacionUlmo(Personaje personaje, Personaje otroPersonaje, Reliquia reliquia, Wizard wizard,
            Elfo elfo, Scanner Teclado) {

        while ((personaje.estaVivo() && otroPersonaje.estaVivo()) && (((IHaceMagia)personaje).getEnergiaMagica() >= 50)) {
            if ((personaje instanceof ILlevaArma)
                    && ((ILlevaReliquia) personaje).getReliquia().getNombre().equals("Anillo Unico")
                    && (((ILlevaReliquia) otroPersonaje).getReliquia().getNombre().equals("Anillo Nenya"))
                    && (Teclado.nextLine().equals(tecla))) {

                ataqueEPICO = otroPersonaje.getSalud() - (otroPersonaje.getSalud() * 0.70);

                otroPersonaje.setSalud((int) ataqueEPICO);

                setEscarcha(((IHaceMagia) otroPersonaje).getEnergiaMagica() - this.getDanioHielo());

                ((IHaceMagia) otroPersonaje).setEnergiaMagica(getEscarcha());

                setConsumo(((IHaceMagia) personaje).getEnergiaMagica() - 70);

                ((IHaceMagia) personaje).setEnergiaMagica(getConsumo());
            }

        }

    }

    @Override
    public void quemadura(Personaje personaje, Personaje otroPersonaje, Wizard wizard, Elfo elfo, Arma arma,
            Reliquia reliquia, Scanner Teclado) {

        while ((personaje.estaVivo() && otroPersonaje.estaVivo()) && (((IHaceMagia)personaje).getEnergiaMagica() >= 50)) {
            if ((personaje instanceof ILlevaArma)
                    && ((ILlevaReliquia) personaje).getReliquia().getNombre().equals("Anillo Unico")
                    && (((ILlevaReliquia) otroPersonaje).getReliquia().getNombre().equals("Anillo Narya"))
                    && (Teclado.nextLine().equals(tecla))) {

                quemadura = personaje.getArma().getDanio() + this.getDanioFuego();

                personaje.getArma().setDanio(quemadura);

                setConsumo((((IHaceMagia) personaje).getEnergiaMagica() - 50));

                ((IHaceMagia) personaje).setEnergiaMagica(getConsumo());
            }
        }

    }

    @Override
    public void invocarManwe(Personaje personaje, Personaje otroPersonaje, Reliquia reliquia, Arma arma,
            Scanner Teclado) {

        while ((personaje.estaVivo() && otroPersonaje.estaVivo()) && (((IHaceMagia)personaje).getEnergiaMagica() >= 50)) {

            if ((personaje instanceof ILlevaArma)
                    && ((ILlevaReliquia) personaje).getReliquia().getNombre().equals("Anillo Unico")
                    && (((ILlevaReliquia) otroPersonaje).getReliquia().getNombre().equals("Anillo Vilya"))
                    && (Teclado.nextLine().equals(tecla))) {

                ataqueEPICOVilya = personaje.getDanioDeAtaque()
                        + ((((this.getFactorDeVelocidadDeAtaque() * 3) / 2) + 1.0) * personaje.getDanioDeAtaque());

                personaje.setDanioDeAtaque((int) ataqueEPICOVilya);

                setVendaval(otroPersonaje.getArma().getStamina() + this.getDanioViento());

                otroPersonaje.getArma().setStamina(getVendaval());

                setConsumo(((IHaceMagia) personaje).getEnergiaMagica() - 70);

                ((IHaceMagia) personaje).setEnergiaMagica(getConsumo());
            }
        }

    }
}
