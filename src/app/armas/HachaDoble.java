package app.armas;

public class HachaDoble extends Arma{

    public HachaDoble(String nombre, int danio, int stamina) {
        super(nombre, danio, stamina);
        this.setNombre("Hacha Doble");
        this.setDanio(150);
        this.setStamina(-100);
    }

}