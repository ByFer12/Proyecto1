
package com.mycompany.serVivo;

public abstract class SerVivo {
    private int tiempoDeVida;
    private int vida;

    public SerVivo(int tiempoDeVida, int vida) {
        this.tiempoDeVida = tiempoDeVida;
        this.vida = vida;
    }
   

  //Metodo abstacto de como se alimenta cada se vivo
    public abstract void alimentarse();
//getters y setters de cada atributo de un ser vivo
    public int getTiempoDeVida() {
        return tiempoDeVida;
    }

    public void setTiempoDeVida(int tiempoDeVida) {
        this.tiempoDeVida = tiempoDeVida;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    

}
