/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mistrabajos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, suma, resta, multiplicacion, division ;
        String operacion,confirma;
        System.out.println("Ingrese un valor");
        num1= leer.nextInt();
        System.out.println("Ingrese otro valor");
        num2= leer.nextInt();
        do {
        System.out.println("MENU"); 
        System.out.println("1.SUMAR"); 
        System.out.println("2.RESTAR");
        System.out.println("3.MULTIPLICAR");
        System.out.println("4.DIVIDIR");
        System.out.println("5.SALIR");
        System.out.println("ELIJA UNA OPCION:");
        operacion=leer.next();
        confirma="";
        switch (operacion){
            case "1":
                suma=(num1+num2);
                System.out.println("el resultado de la suma es " + suma);
                break;  
                case "2":
                resta=(num1-num2);
                System.out.println("el resultado de la resta es " + resta);
                break;  
                case "3":
                multiplicacion=(num1*num2);
                System.out.println("el resultado de la multiplicacion es " + multiplicacion);
                break;  
                case "4":
                division=(num1/num2);
                System.out.println("el resultado de la multiplicacion es " + division);
                break; 
                case "5":
                System.out.println("esta seguro que desea salir escriba s para confirmar o n para continuar");
                confirma=leer.next();break;
        }
        } while (!confirma.equals("s"));
        
    }
    
}
