package app.reliquias.reliquias_anillos;


public class AnilloNarya extends AnilloElfico {

    public AnilloNarya() {
        this.setDanioFuego(6);
    }

    public AnilloNarya(String nombre, double factorDeAtaque, double factorDeDefensa, int energiaMagica) {
        super(nombre, factorDeAtaque, factorDeDefensa, energiaMagica);
        this.setDanioFuego(6);
    }

    private int danioFuego;

    public int getDanioFuego() {
        return danioFuego;
    }

    public void setDanioFuego(int danioFuego) {
        this.danioFuego = danioFuego;
    }

    

    public boolean quemadura(int danioFuego) {
        if (AnilloNarya Narya == 1) {
            
           atacado.getSalud() -= this.danioFuego;
                
            
        } else {}
    }

}