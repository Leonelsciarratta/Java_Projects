/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mistrabajos;

/**
 *
 * @author alumno
 */


    /**
     * @param args the command line arguments
     */
        import java.util.Scanner;


public class ejercicio20 {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int num1, num2, num3, num4;
        System.out.println("Ingrese 4 numeros entre 1 y 20");
        num1= sc.nextInt();
        num2= sc.nextInt();
        num3= sc.nextInt();
        num4= sc.nextInt();
        
        System.out.print(num1);
        for (int i = 0; i < num1; i++) {
            System.out.print("*");
        }
        
        System.out.println(" ");
        
        
        System.out.print(num2);
        for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }
        
        System.out.println(" ");
        
        System.out.print(num3);
        for (int i = 0; i < num3; i++) {
            System.out.print("*");
        }
        
        
        System.out.println(" ");
        
        System.out.print(num4);
        for (int i = 0; i < num4; i++) {
            System.out.print("*");
        }
      
    }
    }
    

