

package com.mycompany.fruta;

import com.mycompany.enums.ColorManzana;
import com.mycompany.enums.ComidaPlantas;
import com.mycompany.planta.Fruta;

public class Manzana extends Fruta {
    private ColorManzana color;

    public Manzana(ColorManzana color, int cantidad, ComidaPlantas tipoFertilizante, int tiempoDeVida, int vida) {
        super(cantidad, tipoFertilizante, tiempoDeVida, vida);
        this.color = color;
    }

    public ColorManzana getColor() {
        return color;
    }

    public void setColor(ColorManzana color) {
        this.color = color;
    }

    @Override
    public void alimentarse() {
        
    }
    
    

}
