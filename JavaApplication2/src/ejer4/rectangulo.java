/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class rectangulo {
    private Integer base;
    private Integer altura;
    public void crearRectangulo(Integer base, Integer altura){
       this.base=base;  
       this.altura= altura;      
       
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }
    public void crearoperacion(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Ingrese el valor de la base");
    this.base=sc.nextInt();
    System.out.println("Ingrese el valor de la altura");
    this.altura=sc.nextInt();
    }
 public void Superficie(){
      Integer Superficie;
      Superficie=base * altura;
      System.out.println("La superficie del rectangulo es " + Superficie);
      
      }
    public void Perimetro(){
      Integer Perimetro;
      Perimetro=(base * altura)*2;
      System.out.println("El perimetro del rectangulo es "+ Perimetro);
    }
    public void Dibujo(){
        Integer Dibujo;
         int i = 0;
       int j = 0;
         while(i<base) {
   while(j<altura) {
    System.out.print("*");
    j++;
   }
   System.out.println();
   j=0;
   i++;
    }
     
  }
      }    
    

