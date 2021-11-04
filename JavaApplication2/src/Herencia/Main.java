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
import java.util.ArrayList;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Perro p1 = new Perro("beagle", true, "Chiquito", 3, 10);
        p1.setEdad(4);
        Gato g1 = new Gato();
        Mascota m1 = new Mascota();
        
        ArrayList<Mascota> listaMascotas = new ArrayList();
        listaMascotas.add(p1);
        listaMascotas.add(g1);
        
        for (Mascota m : listaMascotas) {
            System.out.println(m);
        }
        
        g1.comer();
        
        PerroService.darDeComer(p1);
        Mascota prueba = new Perro();
        
        if (Perro.class == prueba.getClass()) {
            System.out.println("son iguales");
        }
        
        
    }

}

    
    

