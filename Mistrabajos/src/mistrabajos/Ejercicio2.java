
package mistrabajos;

import java.util.Scanner;



public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int num1, num2;
        System.out.println("ingrese primer digito");
        num1=leer.nextInt();
        System.out.println("ingrese segundo digito");
        num2=leer.nextInt();
        System.out.println("la suma de ambos numeros es " + (num1 + num2));
    }
    
}
