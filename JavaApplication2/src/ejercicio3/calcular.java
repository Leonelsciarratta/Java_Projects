/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class calcular {
    private Integer numero1;
    private Integer numero2;
    public calcular(){
    }
    public calcular(Integer numero1, Integer numero2){ 
      this.numero1= numero1;  
      this.numero2= numero2; 
      
    }

    public Integer getNumero1() {
        return numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

    public Integer getNumero2() {
        return numero2;
    }

    public void setNumero2(Integer numero2) {
        this.numero2 = numero2;
    }
    public void crearoperacion(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Ingrese el valor del numero 1");
    this.numero1=sc.nextInt();
    System.out.println("Ingrese el valor del numero 2");
    this.numero2=sc.nextInt();
    }
    public void suma(){
    Integer suma;
    suma= numero1+numero2;
    System.out.println("el resultado de la suma es " + suma);
    }
    public void resta(){
    Integer resta;
    resta= numero1-numero2;
    System.out.println("el resultado de la suma es " + resta);
    }
    public void multiplicacion(){
    Integer multiplicacion;
    multiplicacion= numero1*numero2;
    System.out.println("el resultado de la suma es " + multiplicacion);
    }
    public void division(){
    Integer division;
    division= numero1/numero2;
    System.out.println("el resultado de la suma es " + division);
    }

    }

