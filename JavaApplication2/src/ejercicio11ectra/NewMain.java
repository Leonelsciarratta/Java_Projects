/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11ectra;



/**
 *
 * @author alumno
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        servicio s = new servicio();
        persona p1 = s.crearPersona();
        System.out.println("la edad de " + p1.getNombre()+ "es " + s.calcularEdad(p1));
        System.out.println("los meses de " + p1.getNombre()+ "es " + s.calcularmeses(p1));
        System.out.println("los dias de " + p1.getNombre()+ "es " + s.calculardias(p1));
        
        
      
    }
    }
    

