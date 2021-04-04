
package com.mycompany.granos;

import com.mycompany.enums.ComidaPlantas;
import com.mycompany.planta.Grano;


public class OtroGrano extends Grano{
    private String tipoGrano;
    private String color;

    public OtroGrano(String tipoGrano, String color, int cantidad, ComidaPlantas tipoFertilizante, int tiempoDeVida, int vida) {
        super(cantidad, tipoFertilizante, tiempoDeVida, vida);
        this.tipoGrano = tipoGrano;
        this.color = color;
    }

    public String getTipoGrano() {
        return tipoGrano;
    }

    public void setTipoGrano(String tipoGrano) {
        this.tipoGrano = tipoGrano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void alimentarse() {
        
    }
    
    

}
