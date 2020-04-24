package app.reliquias;


public class Reliquia {

    /** Constructores */

    public Reliquia() {

    }

    public Reliquia(String nombre, double factorDeAtaque, double factorDeDefensa) {
        
        this.nombre = nombre;
        this.factorDeAtaque = factorDeAtaque;
        this.factorDeDefensa = factorDeDefensa;
       
        
    }

    

    //atributos con getters y setters

    private String nombre;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    private double factorDeAtaque;
    public double getFactorDeAtaque() {
        return factorDeAtaque;
    }

    public void setFactorDeAtaque(double factorDeAtaque) {
        this.factorDeAtaque = factorDeAtaque;
    }

    private double factorDeDefensa;
    public double getFactorDeDefensa() {
        return factorDeDefensa;
    }

    public void setFactorDeDefensa(double factorDeDefensa) {
        this.factorDeDefensa = factorDeDefensa;
    }

    

}