
package com.mycompany.planta;

import com.mycompany.enums.ComidaPlantas;
import com.mycompany.serVivo.SerVivo;

public abstract class Planta extends SerVivo {
    private ComidaPlantas tipoFertilizante;
    //precio de los fertilizantes
    private static final int CRECIMIENTO =3;
    private static final int EN_CANTIDAD =3;
    private static final int TAMAÑO_GRANDE =3;
    private int precioSemilla;

    public Planta(ComidaPlantas tipoFertilizante, int tiempoDeVida, int vida) {
        super(tiempoDeVida, vida);
        this.tipoFertilizante = tipoFertilizante;
        
    }

    public ComidaPlantas getTipoFertilizante() {
        return tipoFertilizante;
    }

    public void setTipoFertilizante(ComidaPlantas tipoFertilizante) {
        this.tipoFertilizante = tipoFertilizante;
    }
  
      
    
}
