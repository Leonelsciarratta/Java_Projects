/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2relaciones;

/**
 *
 * @author alumno
 */
public class revolver {
    private double posicion_actual;
    private double posicion_agua;

    public revolver(double posicion_actual, double posicion_agua) {
        this.posicion_actual = Math.random()*10;
        this.posicion_agua = Math.random()*10;
    }

    revolver() {
        
    }

    public double getPosicion_actual() {
        return posicion_actual;
    }

    public void setPosicion_actual(double posicion_actual) {
        this.posicion_actual = posicion_actual;
    }

    public double getPosicion_agua() {
        return posicion_agua;
    }

    public void setPosicion_agua(double posicion_agua) {
        this.posicion_agua = posicion_agua;
    }

    @Override
    public String toString() {
        return "revolver{" + "posicion_actual=" + posicion_actual + ", posicion_agua=" + posicion_agua + '}';
    }

    
    
    
}
