package app.armas;


public class Arma {

    public Arma(String nombre, int danio, int stamina) {

        this.nombre = nombre;
        this.danio = danio;
        this.stamina = stamina;

    }



    /*

    //no estoy segura de si esto deberia ir acá o llamando al constructor Arma en las diferentes clases

      Arma anduril = new Arma(); 
      anduril.setNombre("Espada Anduril Magica");
      anduril.setDanio(550); anduril.setStamina(-480);
      
     Arma arcoFlecha = new Arma(); arcoFlecha.setNombre("Arco y flecha");
      arcoFlecha.setDanio(140); arcoFlecha.setStamina(-89);
      
      Arma espada = new Arma(); espada.setNombre("Espada Comun");
      espada.setDanio(200); espada.setStamina(-180);
      
      Arma baculo = new Arma(); baculo.setNombre("Baculo Magico");
      baculo.setDanio(680); baculo.setStamina(-500);
      
      Arma hachaDoble = new Arma(); hachaDoble.setNombre("Hacha doble");
     hachaDoble.setDanio(220); hachaDoble.setStamina(-190);
     
     */
     

    public void clavarEspada() { // 1. metodos que sugerí, a debate si los dejamos o borramos :D
        System.out.println("¡Te mataré! *Clavando " + tipoDeEspada);

    }

    public void dispararFlecha() { //2.
        System.out.println("¡Justo en el blanco!");

    }

    public void clavarHacha() { //3.
        System.out.println("¡Cortado en pedacitos!");

    }

    public void usarBaculo() { //4.

    }

    public boolean aunTieneFlechas() { //5.
        if (flechas > 0)
            ;
        return true;

    }

    //public int chequearInventario(){ //6. la logica de este queda a debate!
        /*if(inventario < 0){
            System.out.println("Inventario vacío");
        else (inventario > 0) {
            return inventario;
        }
        }
        */
    //}

    //atributos con getters and setters

    private String nombre; //primer atributo

    public void setNombre(String nombre) { //setter
        this.nombre = nombre;
    }

    public String getNombre() { //getter
        return nombre;
    }

    private int danio; //segundo atributo

    public void setDanio(int danio) { //setter
        this.danio = danio;
    }

    public int getDanio() { //getter
        return danio;
    }

    private int stamina; //tercer atributo

    public void setStamina(int stamina) { //setter
        this.stamina = stamina;
    }

    public int getStamina() { //getter
        return stamina;
    }

    private int inventario; //cuarto atributo: a debate si lo dejamos int o lo hacemos una lista :D

    public void setInventario(int inventario) { //setter
        this.inventario = inventario;
    }

    public int getInventario() { //getter
        return inventario;
    }

    private String tipoDeEspada; //quinto atributo, a debate si lo dejamos o lo borramos

    public void setTipoDeEspada(String tipoDeEspada) { //setter
        this.tipoDeEspada = tipoDeEspada;
    }

    public String getTipoDeEspada() { //getter
        return tipoDeEspada;
    }

    private int flechas; //sexto atributo, a debate si lo dejamos o borramos 

    public void setFlechas(int flechas) { //setter
        this.flechas = flechas;
    }

    public int getFlechas() { //getter
        return flechas;
    }
}