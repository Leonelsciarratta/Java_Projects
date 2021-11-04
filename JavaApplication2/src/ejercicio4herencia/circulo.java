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
public class circulo implements calculosFormas {
    private Double radio;
    private Double diametro;

    public circulo() {
    }

    public circulo(Double radio, Double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }
    

    @Override
    public void calcularArea() {
        Double areaCirculo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio");
         radio=sc.nextDouble();
         areaCirculo=constante * Math.pow(radio,2);
         System.out.println(" el area del circulo es" + areaCirculo);
        
    }

    @Override
    public void calcularPerimetro() {
        Double perimetroCirculo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el Diametro");
        diametro=sc.nextDouble();
        perimetroCirculo=constante*diametro;
         System.out.println(" el perimetro del circulo es" + perimetroCirculo);
    }
        
    
}
