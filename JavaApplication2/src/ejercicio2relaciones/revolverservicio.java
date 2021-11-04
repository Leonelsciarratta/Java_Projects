/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2relaciones;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class revolverservicio {
    Scanner sc = new Scanner(System.in);
    
 revolver rev = new revolver();

    public revolverservicio() {
    }
     
     public void llenarRevolverDeAgua(){
         
         rev.setPosicion_actual(Math.floor(Math.random() * 5+1));
         rev.setPosicion_agua(Math.floor(Math.random() * 5+1));
                  System.out.println(Math.floor(rev.getPosicion_actual()));
     }
    
     public Boolean mojar(){
                  
         
         return rev.getPosicion_actual()==rev.getPosicion_agua();
     }
    
     //siguienteChorro(): cambia a la siguiente posición del tambo
     
     public void siguienteChorro(){
         rev.setPosicion_actual(rev.getPosicion_actual()+1);
         
     }
     
     public revolver devuelve(){
         
         return rev;
     }
     
     public void mostrar(){
         
         System.out.println(rev.toString());
     }
     
}
