/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
       public static void main(String[] args) {
        Perro perro = new Perro("Tobby", "carne", 7,  "caniche");
        Gato gato = new Gato("Tom", "pescado", 4, "siamés");
        Caballo caballo = new Caballo("Rocinante", "hierba", 8, "español");
        perro.alimentarse();
        gato.alimentarse();
        caballo.alimentarse();
    }
    
}
