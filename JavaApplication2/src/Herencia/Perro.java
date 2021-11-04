/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author alumno
 */


public class Perro extends Mascota {

    private String raza;
    private Boolean cola;

    public Perro() {
    }

    public Perro(String raza, Boolean cola, String nombre, Integer edad, Integer peso) {
        super(nombre, edad, peso);
        this.raza = raza;
        this.cola = cola;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Boolean getCola() {
        return cola;
    }

    public void setCola(Boolean cola) {
        this.cola = cola;
    }

    @Override
    public String toString() {
        String toS = "Perro: " + this.nombre + " / Raza: " + this.raza;
        return toS;
    }

}

