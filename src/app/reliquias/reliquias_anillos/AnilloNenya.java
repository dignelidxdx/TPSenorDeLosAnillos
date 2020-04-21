package app.reliquias.reliquias_anillos;

public class AnilloNenya extends AnilloElfico {

    public AnilloNenya(String nombre, double factorDeAtaque, double factorDeDefensa, int energiaMagica) {
        super(nombre, factorDeAtaque, factorDeDefensa, energiaMagica);
        this.setDanioHielo(12);
        // this.invocacionUlmo(ataqueEPICO);
    }

    private int danioHielo;

    public int getDanioHielo() {
        return danioHielo;
    }

    public void setDanioHielo(int danioHielo){
        this.danioHielo = danioHielo;
    }

    private int ataqueEPICO;
    public int getAtaqueEPICO() {
        return ataqueEPICO;
    }

    public void setAtaqueEPICO(int ataqueEPICO) {
        this.ataqueEPICO = ataqueEPICO;
    }

    // public boolean escarcha(int danioHielo) {
        
    //     if (AnilloNenya Nenya == 1) {
            
    //         while (boolean estaVivo() == true) {

    //             for(int contadorTurno = 0; contadorTurno >= 0; contadorTurno++) {

    //                 Contrincante contrincante getEstamina() = Contrincante contrincante getEstamina() - this.danioHielo;
    //             }

    //         }

    //     } else {}

    // }

    // public boolean invocacionUlmo(int ataqueEPICO) {

    //     if (AnilloNenya Nenya == 1) {

    //         while (boolean estaVivo() == true) {

    //             if (getSalud() <= (getSalud() * 0.15) {

    //                 System.out.println("Tus lágrimas de dolor y desesperanza conmueven el corazón de Ulmo,\n quien desata un raudo alud que arrastra a tu vil enemigo, lo ahoga con lodo y \n lo magulla con los detritos que acarrea; provocandole un daño masivo");

    //                 this.ataqueEPICO = Contrincante contrincante getSalud() - (Contrincante contrincante getSalud() * 0.70);
    //             }
    //         }
    //     }


    // }
}