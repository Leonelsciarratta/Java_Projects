/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4herencia;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class rectangulo implements calculosFormas {
    private Double altura;
    private Double base;

    public rectangulo() {
    }

    public rectangulo(Double altura, Double base) {
        this.altura = altura;
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    

    @Override
    public void calcularArea() {
        Double areaRectangulo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base");
        base=sc.nextDouble();
        System.out.println("Ingrese la altura");
        altura=sc.nextDouble();
         areaRectangulo=base*altura;
         System.out.println(" el area del rectangulo es" + areaRectangulo);
    }

    @Override
    public void calcularPerimetro() {
        Double perimetroRectangulo;
        perimetroRectangulo=(base+altura)*2;
        System.out.println(" el perimetro del rectangulo es" + perimetroRectangulo);
    }
    
    
}
