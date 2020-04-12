package app.armas;

import app.interfaces.IEsMagico;

public class Sting extends Espada implements IEsMagico{

    public Sting(String nombre, int danio, int stamina) {
        super(nombre, danio, stamina);
    }

}