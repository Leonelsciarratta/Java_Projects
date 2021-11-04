
package mistrabajos;

import java.util.Scanner;

public class ejercicio1 {

    
    public static void main(String[] args) {
      //se crea variable scanner para guardar los datos ingresados por el usuario
      Scanner leer= new Scanner(System.in);
      String nombre;
      System.out.println("ingresa tu nombre");
      nombre=leer.next();
      System.out.println("Hola mundo soy" + nombre + "estoy programando java");
    
    }
    
}
