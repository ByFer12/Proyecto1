/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.fruta;

import com.mycompany.enums.ComidaPlantas;
import com.mycompany.planta.Fruta;


public class OtraFruta extends Fruta {
    private String tipo;
    private String color;

    public OtraFruta(String tipo, String color, int cantidad, ComidaPlantas tipoFertilizante, int tiempoDeVida, int vida) {
        super(cantidad, tipoFertilizante, tiempoDeVida, vida);
        this.tipo = tipo;
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
