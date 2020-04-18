package app.armas;

public class Espada extends Arma{

    public Espada(String nombre, int danio, int stamina) {
        super(nombre, danio, stamina);
        this.setNombre("Espada de tipo comun");
        this.setDanio(300);
        this.setStamina(-215);
    }

}