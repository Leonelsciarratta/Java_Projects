/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class servicio {
    public cafetera nuevocafe(){
        Scanner sc = new Scanner(System.in);
        cafetera nuevocafe= new cafetera();
     System.out.println("Ingrese capacidad maxima del cafe");
     nuevocafe.setCapacidadmaxima(sc.nextInt());
     System.out.println("Ingrese capacidad actual del cafe ");
     nuevocafe.setCapacidadactual(sc.nextInt());
     return nuevocafe;
    }
  public static void llenarcafetera(cafetera nuevocafe){
      Scanner sc = new Scanner(System.in);
      if (Objects.equals(nuevocafe.getCapacidadmaxima(), nuevocafe.getCapacidadactual()))
      System.out.println("La cafetera esta llena");
  } 
  public static void servirtaza(cafetera nuevocafe){
      Scanner sc = new Scanner(System.in);
      int tamaniotaza, cuenta =0;
      System.out.println("Cual es el tamaño de su taza");
      tamaniotaza=(sc.nextInt());
      System.out.println("Le sirvo su taza");
      if (nuevocafe.getCapacidadactual()< tamaniotaza){
      cuenta=tamaniotaza-nuevocafe.getCapacidadactual();
      System.out.println("No alcanzo para llenar la taza , queda por llenar" + cuenta);
      }
      else{
         System.out.println("La taza se lleno"); 
      }
      
      } 
      public static void vaciarcafetera(cafetera nuevocafe){
      Scanner sc = new Scanner(System.in);
      if (nuevocafe.getCapacidadactual()==0)
      System.out.println("La cafetera esta vacia");
  } 
     public static void agregarcafe(cafetera nuevocafe){
      Scanner sc = new Scanner(System.in);
      int agregar, sumacafe=0;
      System.out.println("Cuanto cafe desea añadir a la cafetera");
      agregar=(sc.nextInt());
      sumacafe=nuevocafe.getCapacidadactual()+ agregar;
      System.out.println("Ahora la cafetera tiene " + sumacafe);
  } 
}
