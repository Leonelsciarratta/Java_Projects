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

    public class Gato extends Mascota {

    private String color;

    public Gato() {
    }

    public Gato(String color, String nombre, Integer edad, Integer peso) {
        super(nombre, edad, peso);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Gato{" + "color=" + color + '}';
    }

    @Override
    public void comer() {
        System.out.println("El gato come pescado");
    }

}

    

