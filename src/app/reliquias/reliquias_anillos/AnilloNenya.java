package app.reliquias.reliquias_anillos;

import app.interfaces.ILlevaReliquia;
import app.personajes.Personaje;

public class AnilloNenya extends AnilloElfico {

    public AnilloNenya() {
        
    }

    public AnilloNenya(String nombre, double factorDeAtaque, double factorDeDefensa, int energiaMagica) {
        super(nombre, factorDeAtaque, factorDeDefensa, energiaMagica);
        this.setDanioHielo(danioHielo);
        
    }

    private int danioHielo;

    public int getDanioHielo() {
        return danioHielo;
    }

    public void setDanioHielo(int danioHielo){
        this.danioHielo = 8;
    }

    private double ataqueEPICO;
    public double getAtaqueEPICO() {
        return ataqueEPICO;
    }

    public void setAtaqueEPICO(int ataqueEPICO) {
        this.ataqueEPICO = ataqueEPICO;
    }

    public void escarcha(Personaje atacado) {

        int danioStamima = atacado.getStamina() - this.getDanioHielo();

        atacado.setStamina(danioStamima);


    }


    public void invocacionUlmo(Personaje atacado, Personaje atacante) {

        if (atacante instanceof ILlevaReliquia && atacante.reliquia.nombre.equals("Anillo Nenya")) {

            if ((atacante.estaVivo() && atacado.estaVivo()) && (atacante.getSalud() <= atacante.getSalud() * 0.15)) {

               
                ataqueEPICO = atacado.getSalud() - (atacado.getSalud() * 0.70);

                atacado.setSalud((int)ataqueEPICO);
            
            }
        }


    }
}