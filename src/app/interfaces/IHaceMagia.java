package app.interfaces;

import app.armas.Arma;
import app.personajes.Personaje;

public interface IHaceMagia {

    public int getEnergiaMagica();

    public void setEnergiaMagica(int energiaMagica);

    public boolean puedoEjecutarAtaqueEpico();

    public void ataqueEpico(Personaje personaje, Arma arma);

    public void ataqueEpicoPoderoso(Personaje personaje);
    
} 