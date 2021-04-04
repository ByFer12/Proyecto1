

package com.mycompany.planta;

import com.mycompany.enums.ComidaPlantas;


public abstract class Grano extends Planta {
    private int cantidad;

    public Grano(int cantidad, ComidaPlantas tipoFertilizante, int tiempoDeVida, int vida) {
        super(tipoFertilizante, tiempoDeVida, vida);
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    

}
