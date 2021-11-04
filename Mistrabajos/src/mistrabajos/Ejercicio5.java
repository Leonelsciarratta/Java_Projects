
package mistrabajos;

import java.util.Scanner;

public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cent ;
        System.out.println("Ingrese la cantidad de grados centigrados");
        cent=leer.nextInt();
        System.out.println("El equivalente en grados Fahrenheit es " +(32 + (9*cent/5)));
        
        
    }
    
}
