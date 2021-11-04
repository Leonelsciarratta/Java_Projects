/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

/**
 *
 * @author alumno
 */
public class main {
     public static void main(String[] args) {
    servicio s = new servicio();
    persona p1=s.crearPersona();
    System.out.println("la diferencia de anios es " + s.calcularEdad(p1));
    
}
}