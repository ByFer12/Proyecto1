

package com.mycompany.granos;

import com.mycompany.enums.ColorMaiz;
import com.mycompany.enums.ComidaPlantas;
import com.mycompany.planta.Grano;


public class Maiz extends Grano {
   private ColorMaiz color;

    public Maiz(ColorMaiz color, int cantidad, ComidaPlantas tipoFertilizante, int tiempoDeVida, int vida) {
        super(cantidad, tipoFertilizante, tiempoDeVida, vida);
        this.color = color;
    }
   

    public ColorMaiz getColor() {
        return color;
    }

    public void setColor(ColorMaiz color) {
        this.color = color;
    }

    @Override
    public void alimentarse() {
        
    }
    
    
    

}
