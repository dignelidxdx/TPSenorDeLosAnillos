package app.reliquias.reliquias_anillos;

public class AnilloNenya extends AnilloElfico {

    public AnilloNenya(String nombre, double factorDeAtaque, double factorDeDefensa, int energiaMagica) {
        super(nombre, factorDeAtaque, factorDeDefensa, energiaMagica);
        this.setDanioHielo(12);
        this.invocacionUlmo(ataqueEPICO);
    }

    private int danioHielo;

    public int getDanioHielo() {
        return danioHielo;
    }

    public void setDanioHielo(int danioHielo){
        this.danioHielo = danioHielo;
    }

    private double ataqueEPICO;
    public double getAtaqueEPICO() {
        return ataqueEPICO;
    }

    public void setAtaqueEPICO(int ataqueEPICO) {
        this.ataqueEPICO = ataqueEPICO;
    }

    public int escarcha(int danioHielo) {
        
        if (AnilloNenya Nenya == 1) {
            
            while (boolean estaVivo() == true) {

                for(int contadorTurno = 0; contadorTurno >= 0; contadorTurno++) {

                    return Contrincante contrincante getEstamina() = Contrincante contrincante getEstamina() - this.danioHielo;
                }

            }

        } else {}

    }

    public double invocacionUlmo(int ataqueEPICO) {

        if (AnilloNenya Nenya == 1) {

            while (estaVivo() == true) {

                if (getSalud() <= (getSalud() * 0.15) {

                    return this.ataqueEPICO = Contrincante contrincante getSalud() - (Contrincante contrincante getSalud() * 0.70);
                }
            }
        }


    }
}