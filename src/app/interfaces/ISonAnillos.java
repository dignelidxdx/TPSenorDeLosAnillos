package app.interfaces;

import java.util.Scanner;

import app.armas.Arma;
import app.personajes.Personaje;
import app.personajes.criaturas.Elfo;
import app.personajes.humanos.Wizard;
import app.reliquias.Reliquia;

public interface ISonAnillos {

        public int getQuemadura();
    
        public void setQuemadura(int quemadura);
        
        public int getDanioFuego();
    
        public void setDanioFuego(int danioFuego);
        
        public void quemadura(Personaje personaje, Personaje otroPersonaje, Wizard wizard, Elfo elfo, Arma arma, Reliquia reliquia, Scanner Teclado);

        public int getDanioHielo();

        public void setDanioHielo(int danioHielo);
    
        public double getAtaqueEPICO();
    
        public void setAtaqueEPICO(int ataqueEPICO);
                                                                                            
        public int getEscarcha();

        public void setEscarcha(int escarcha);
    
        public void invocacionUlmo(Personaje personaje, Personaje otroPersonaje, Reliquia reliquia, Wizard wizard, Elfo elfo, Scanner Teclado);
       
        public double setAtaqueEPICOVilya();
    
        public void getAtaqueEPICOVilya(double ataqueEPICOVilya);

        public int getDanioViento();

        public void setDanioViento(int danioViento);
                                                         
        public int getVendaval();

        public void setVendaval(int vendaval);
        
        public void invocarManwe(Personaje personaje, Personaje otroPersonaje, Reliquia reliquia, Arma arma, Scanner Teclado);
    

    
    
    

}