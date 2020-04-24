package app.armas;

public class ArcoYFlecha extends Arma {

    public ArcoYFlecha(String nombre, int danio, int stamina, int flechas) {
        super(nombre, danio, stamina);
        this.setNombre("Arco y Flecha");
        this.setDanio(2);
        this.setStamina(1);
        this.setFlechas(5);
    }

    private void setFlechas(int i) {
    }

    public ArcoYFlecha() {
    }

    public ArcoYFlecha(String nombre, int danio, int stamina) {
        super(nombre, danio, stamina);
    }

}