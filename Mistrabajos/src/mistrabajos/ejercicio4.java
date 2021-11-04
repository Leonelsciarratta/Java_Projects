
package mistrabajos;

import java.util.Scanner;

public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String frase;
       System.out.println("Ingrese una frase");
       frase=leer.next();
       System.out.println(frase.toUpperCase());
       System.out.println(frase.toLowerCase());
    }
    
}
