/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions3;

import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author alumno
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int rand =ThreadLocalRandom.current().nextInt(1,5);
       int cont =0;
       int user;
       
       do{
           System.out.println("Ingrese un numero");
           user=errores(sc);
           if(Objects.equals(user,rand)){
               System.out.println("Acertaste");
           }else if(user>rand){
           System.out.println("el numero es menor");
           cont++;
           }else if(user<rand && user>0){
           System.out.println("el numero es mayor");
           cont++;
       }else if(user==-1){
            System.out.println("No ha ingresado un numero");
            cont++;
       }
       }while(user!=rand);
       System.out.println("el numero es " + rand);
       System.out.println("La cantidad de intentos fue" + cont);
    }
    public static int errores(Scanner sc){
        int user;
        int aux;
        try{
            aux=sc.nextInt();
            user=aux;
        }catch(Exception e){
            user=-1;
            sc.next();
        }
        return user;
    }
}
