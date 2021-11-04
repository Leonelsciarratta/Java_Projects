/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class servicio {

    static Integer EsmayordeEdad() {
        throw new UnsupportedOperationException("No puede ingresar null"); //To change body of generated methods, choose Tools | Templates.
    }
     public persona nuevapersona(){
        Scanner sc = new Scanner(System.in);
        persona nuevapersona= new persona();
        return nuevapersona;
        
    }
     public static void crearpersona(persona nuevapersona){
     Scanner sc = new Scanner(System.in);
     System.out.println("Ingrese su nombre");
     nuevapersona.setNombre(sc.next());
     System.out.println("Ingrese su edad ");
     nuevapersona.setEdad(sc.nextInt());
     System.out.println("Ingrese su altura ");
     nuevapersona.setAltura(sc.nextDouble());
     System.out.println("Ingrese su peso ");
     nuevapersona.setPeso(sc.nextInt());
     System.out.println("Indique su sexo ");
     nuevapersona.setSexo(sc.next());
     switch (nuevapersona.getSexo()){
         case "H":
         System.out.println("Ha seleccionado la opcion hombre");
         break;
         case "M":
         System.out.println("Ha seleccionado la opcion mujer");
         break;
         case "O":
         System.out.println("Ha seleccionado la opcion otro");
         break;
         default:
         System.out.println("Opcion desconocida");
     }
     
     }
    public static int calcularIMC (persona nuevapersona){
           Scanner sc = new Scanner(System.in);
           double pesoTemp = nuevapersona.getPeso();
            double formula = pesoTemp/(Math.pow(nuevapersona.getAltura(),2));
         if (formula <20){
             System.out.println("Esta por debajo del peso ideal");
             return -1;
            
         }else if (formula<=25){
             System.out.println("Esta en su peso ideal");
             return 0;
         }else{
             System.out.println("Esta excedido de su peso ideal");
             return 1;}
}
    public static void EsmayordeEdad(persona nuevapersona){
       if(nuevapersona.getEdad()>=18){
           System.out.println("Es mayor de edad");
           
       } else{
            System.out.println("Es menor de edad");
       }
       
    }

  

}
        
    

