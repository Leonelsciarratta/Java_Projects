
package mistrabajos;

import java.util.Scanner;


public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num;
       System.out.println("Ingrese un numero");
       num=leer.nextInt();
        System.out.println("El doble del numero ingresado es " + (num*2));
        System.out.println("el triple del numero ingresado es" + (num*3));
        System.out.println("La raiz cuadrada del numero ingresado es " + (Math.sqrt(num)));  
    }
    
}
