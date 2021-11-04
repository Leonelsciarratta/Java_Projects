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
public class jugadorservicio {
    public class JugadorServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    jugador jug = new jugador();

    revolverservicio revolver2;
    
     public JugadorServicio(revolverservicio r) {
         this.revolver2=r;
    }
    
    
    
    public void disparo() {
        revolver2.mojar();
        revolver2.siguienteChorro();

    }

}

    
}
