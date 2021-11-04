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


public class PerroService {
   public static void darDeComer(Perro p){
       System.out.println("Se le da de comer al perro " + p.getNombre());
       p.comer();
   }
}

