/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJER2;

/**
 *
 * @author alumno
 */
public class circun {
    private Double Radio;
    public circun(){ 
        
    }
   public circun(Double Radio){ 
      this.Radio = Radio;  
    }
    public Double getRadio() {
        return Radio;
    }

    public void setRadio(Double Radio) {
        this.Radio = Radio;
    }
public void area(Double Radio){
double area;
area= 3.14*(Radio*Radio);
System.out.println("el area es " + area);
}
public void perimetro(Double Radio){
double perimetro;
perimetro=2*3.14*Radio;
System.out.println("el perimetro es " + perimetro);
    }
}

