/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2Herencia;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Electrodomesticos {

    protected Double precio;
    protected String color;
    protected String consumo;
    protected Double peso;

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Electrodomesticos() {
    }

    public Electrodomesticos(String color, String consumo, Double precio, Double peso) {
        this.precio = precio;
        this.color = color;
        this.peso = peso;
        this.consumo = consumo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }

    private String comprobarConsumoEnergetico(String letra) {
        //    • Método comprobarConsumoEnergetico(char letra): comprueba que la letra
//es correcta, sino es correcta usara la letra F por defecto. Este método se debe
//invocar al crear el objeto y no será visible.
        if (letra.equals("A") || letra.equals("B") || letra.equals("C") || letra.equals("D") || letra.equals("E") || letra.equals("F")) {
            return letra;
        } else {
            return "F";
        }

    }

    private String comprobarColor(String color) {
        //    • Método comprobarColor(String color): comprueba que el color es correcto, y
//si no lo es, usa el color blanco por defecto. Los colores disponibles para los
//electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
//está en mayúsculas o en minúsculas. Este método se invocará al crear el
//objeto y no será visible.
        String colorFinal;

        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            colorFinal = color;
        } else {
            colorFinal = "blanco";
        }

        return colorFinal;
    }

    public void crearElectrodomestico() {
        //    • Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el
//consumo. Al precio se le da un valor base de $1000.

        System.out.println("Ingrese color");
        this.color = comprobarColor(sc.next());
        System.out.println("Ingrese el consumo");
        this.consumo = comprobarConsumoEnergetico(sc.next());
        System.out.println("Ingrese el peso");
        this.peso = sc.nextDouble();
        this.precio = 1000D;
    }

    public void precioFinal() {
//        • Método precioFinal(): según el consumo energético y su tamaño, aumentará
//el valor del precio. Esta es la lista de precios:

        switch (consumo) {
            case "A":
                this.precio = this.precio + 1000;
                break;
            case "B":
                this.precio = this.precio + 800;
                break;
            case "C":
                this.precio = this.precio + 600;
                break;
            case "D":
                this.precio = this.precio + 500;
                break;
            case "E":
                this.precio = this.precio + 300;
                break;
            case "F":
                this.precio = this.precio + 100;
                break;

        }
        
        if(peso>=1 & peso<= 19){
            this.precio = this.precio + 100;
        }else if (peso>=20 & peso<= 49){
            this.precio = this.precio +500;
        }else if (peso>=50 & peso<= 79){
            this.precio = this.precio + 800;
        }else if(peso>= 80) {
            this.precio = this.precio + 1000;
        }

    }

}
