package app.armas;

public class ArcoYFlecha extends Arma {

    public ArcoYFlecha(String nombre, int danio, int stamina) {
        super(nombre, danio, stamina);
        this.setNombre("Arco y Flecha");
        this.setDanio(100);
        this.setStamina(-50);
    }

}