/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class exception1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      Integer num =0;
      
      System.out.println("Ingrese un numero");
      num=errores(sc);
      if (num>18){
          System.out.println("Usted es mayor de edad");
      }else if(num<18 && num>0) {
          System.out.println("Usted es menor de edad");
      }
      else if (num<-1){
          System.out.println("Usted no escribio un numero valido");
      }
      
        
    }
         
  public static int errores(Scanner sc){
        int num;
       
        try{
            num=sc.nextInt();
            
        }catch(Exception e){
            num=-1;
            sc.next();
            System.out.println("El programa no acepta letras");
        }
        return num;
    }
} 
    
    
    

