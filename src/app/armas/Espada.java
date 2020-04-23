package app.armas;

public class Espada extends Arma{

    public Espada(String nombre, int danio, int stamina) {
        super(nombre, danio, stamina);
        this.setNombre("Espada");
        this.setDanio(35);
        this.setStamina(20);
    }

}