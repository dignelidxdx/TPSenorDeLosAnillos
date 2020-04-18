package app.reliquias.reliquias_anillos;

public class AnilloVilya extends AnilloElfico {

    public AnilloVilya(String nombre, double factorDeAtaque, double factorDeDefensa, int energiaMagica, double factorDeVelocidadDeAtaque) {
        super(nombre, factorDeAtaque, factorDeDefensa, energiaMagica);
        this.setFactorDeVelocidadDeAtaque(0.15);
        this.invocarManwe();
        this.invocarManweLeyenda();
        
        

    }

    private double factorDeVelocidadDeAtaque;

    public double getFactorDeVelocidadDeAtaque() {
        return factorDeVelocidadDeAtaque;
    }

    public void setFactorDeVelocidadDeAtaque(double factorDeVelocidadDeAtaque) {
        this.factorDeVelocidadDeAtaque = factorDeVelocidadDeAtaque;

    }

    private double ataqueEPICOVilya;
    public double setAtaqueEPICOVilya() {
        return ataqueEPICOVilya;
    }

    public void getAtaqueEPICOVilya(double ataqueEPICOVilya) {
        this.ataqueEPICOVilya = ataqueEPICOVilya;
    }

    public double invocarManwe() {

        return this.ataqueEPICOVilya = this.getFactorDeVelocidadDeAtaque() * 3;
    }

    public String invocarManweLeyenda() {
        return "Las Águilas han escuchado tu llamada de auxilio y se lanzan en picada sobre tu enemigo para asestarle múltiples heridas con sus picos y garras a gran velocidad!";
        
    }

    
    
}  
