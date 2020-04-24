package app.reliquias.reliquias_anillos;

import app.personajes.Personaje;

public class AnilloUnico extends AnilloDePoder {

    public AnilloUnico() {

    }

    public AnilloUnico(String nombre, double factorDeAtaque, double factorDeDefensa, int energiaMagica, double factorDeVelocidadDeAtaque) {
        super(nombre, factorDeAtaque, factorDeDefensa, energiaMagica, factorDeVelocidadDeAtaque);
        this.setEnergiaMagica(+20);
        this.setFactorDeAtaque(+0.20);
        this.setFactorDeVelocidadDeAtaque(+0.07);
        this.setSalud(salud);
        this.setFactorRegeneracionSalud(factorRegeneracionSalud);
        this.setFactorRegeneracionStamina(factorRegeneracionStamina);
    }

    

    // Aumenta mucho los puntos de salud estando equipado
    // Disminuye en gran medida la regeneracion de salud
    // Aumenta en gran medida la regeneracion de estamina estando equipado
    // Aumenta en gran porcentaje el factorDeEvasion estando equipado
    // Aumenta en parte el factorDeVelocidadDeAtaque estando equipado
    // Aumenta aun mas los puntos de energiaMagica estando equipado

    // Si su contrincante tiene uno de Los Tres y lo usa, refleja el daño base de
    // ese anillo y refleja el doble del ataqueEpico hacia éste, mientras está
    // equipado.
    // El jugador recibe solo el 40% del daño original del ataqueEpico. Requiere 95%
    // de la energiaMagica total y el 10% de los puntos totales de salud. Se activa
    // con tecla.
    // Si dispone de al menos 20% de la energiaMagica total, mientras está equipado,
    // puede invocar al Nazgûl Witchking para que pelee junto a él por 3 turnos.
    // Nazgûl Witchking tiene chance propia pero muy baja de aplicar Hoja Espectral,
    // que quita puntos de estamina del contrincante y disminuye su regeneracion por
    // 3 turnos a la mitad. Se activa con tecla.
    // Si dispone de al menos 80% de energiaMagica total y de 40% de estamina total
    // y 20% de salud total, mientras está equipado,
    // puede invocar a Los Nueve para que rodeen a su contrincante y con su chillido
    // imbuyan panico en el corazon de éste,
    // para que con ello, disminuyan su factorDeEvasion, su factorDeDefensa, su
    // factorDeAtaque, su factorDeVelocidadDeAtaque y la regeneracion de stamina y
    // salud.

    // Cada vez que se asesta un golpe con el arma equipada, hay 15% de chance de
    // que el Anillo traicione a su portador deslizandose fuera de su dedo.
    // Esto deja al jugador con un 25% más de puntos totales que los que adiciona a
    // la salud total el Unico al equiparse. La salud se regenera completamente,
    // pero la estamina queda en un 40% del total con regeneracion disminuida en
    // 75%, y la energiaMagica cae a 10% del total de puntos y baja su regeneración
    // 50%.

    // Como siempre, El Unico, sirve a su verdadero amo...

    private int salud;

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = +75;
    }

    // agrego factorRegeneracionSalud.

    private double factorRegeneracionSalud;

    public double getFactorRegeneracionSalud() {
        return factorRegeneracionSalud;
    }

    public void setFactorRegeneracionSalud(double factorRegeneracionSalud) {
        this.factorRegeneracionSalud = -0.75;
    }

    // agrego factorRegeneracionStamina

    private double factorRegeneracionStamina;

    public double getFactorRegeneracionStamina() {
        return factorRegeneracionStamina;
    }

    public void setFactorRegeneracionStamina(double factorRegeneracionStamina) {
        this.factorRegeneracionStamina = +0.75;
    }


    

  
   

}