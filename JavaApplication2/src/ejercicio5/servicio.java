/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class servicio {
    public cuenta nuevaCuenta(){
        Scanner sc = new Scanner(System.in);
        cuenta nuevaCuenta= new cuenta();
     System.out.println("Ingrese numero de cuenta");
     nuevaCuenta.setNumerodecuenta(sc.nextInt());
     System.out.println("Ingrese numero de DNI");
     nuevaCuenta.setDNI(sc.nextInt());
     System.out.println("Ingrese su saldo actual");
     nuevaCuenta.setSaldoactual(sc.nextInt());
     return nuevaCuenta;
    }
  public static void ingresar(cuenta nuevaCuenta){
      Scanner sc = new Scanner(System.in);
      System.out.println("Cuanto dinero desea ingresar");
      nuevaCuenta.setSaldoactual(nuevaCuenta.getSaldoactual()+ sc.nextInt());
      System.out.println("Su saldo actual es " + nuevaCuenta.getSaldoactual());
  } 
  public static void retirar(cuenta nuevaCuenta){
      Scanner sc = new Scanner(System.in);
      int dineroretiro=0;
      System.out.println("Cuanto dinero desea retirar");
      dineroretiro=(sc.nextInt());
      int retiro=(nuevaCuenta.getSaldoactual()-dineroretiro);
      if (dineroretiro>nuevaCuenta.getSaldoactual()){
      System.out.println("Saldo Insuficiente");    
      System.out.println("Se retiraron " + nuevaCuenta.getSaldoactual());
      nuevaCuenta.setSaldoactual(0);
      }else{
      nuevaCuenta.setSaldoactual(nuevaCuenta.getSaldoactual()-dineroretiro);
      System.out.println("Saldo actual: " + nuevaCuenta.getSaldoactual());
      }
      
   
  } 
     public static void extraccionRapida(cuenta nuevaCuenta){
      Scanner sc = new Scanner(System.in);
      System.out.println("cuanto dinero desea retirar ");
      int dineroretiro= sc.nextInt();
      if (dineroretiro*100/nuevaCuenta.getSaldoactual()>20){
      System.out.println("Usted solo puede retirar el 20 por ciento es un total de ");
      }
      else{   
          System.out.println("Operacion exitosa");
          nuevaCuenta.setSaldoactual(nuevaCuenta.getSaldoactual()-dineroretiro);
         
      }
      
      }
     public static void Consultasaldo(cuenta nuevaCuenta){
      Scanner sc = new Scanner(System.in);
      String pregunta="";
      System.out.println("Desea consultar su saldo?");
      pregunta=(sc.next());
      if ("si".equals(pregunta)){
      System.out.println("Su saldo actual es  " + nuevaCuenta.getSaldoactual());
      }
      
     }
      public static void Consultadatos(cuenta nuevaCuenta){
      Scanner sc = new Scanner(System.in);
      String pregunta="";
      System.out.println("Desea consultar sus datos?");
      pregunta=(sc.next());
      if ("si".equals(pregunta)){
      System.out.println("Sus datos son los siguientes " + nuevaCuenta.getSaldoactual());
      System.out.println("Su Numero de cuenta es " + nuevaCuenta.getNumerodecuenta());
      System.out.println("Su DNI es " + nuevaCuenta.getDNI());
      System.out.println("Su saldo es " + nuevaCuenta.getSaldoactual());
      }
      
     }
}
