/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2Herencia;

/**
 *
 * @author alumno
 */
public class Televisor extends Electrodomesticos {

    private Double resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(Double resolucion, boolean sintonizador, String color, String consumo, Double precio, Double peso) {
        super(color, consumo, precio, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", sintonizador=" + sintonizador + " " + super.toString() + '}';
    }

//    • Método crearTelevisor(): este método llama a crearElectrodomestico() de la
//clase padre, lo utilizamos para llenar los atributos heredados del padre y
//después llenamos los atributos del televisor.
    public Televisor crearTelevisor() {
        Televisor tv = new Televisor();
        crearElectrodomestico();
        this.resolucion = 50D;
        this.sintonizador = true;
        precioFinal();
        return tv;
    }

    @Override
    public void precioFinal() {
//       • Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
//aumentará $500. Recuerda que las condiciones que hemos visto en la clase
//Electrodomestico también deben afectar al precio. 

        super.precioFinal();
        if (this.resolucion > 40) {
            this.precio = this.precio + (this.precio * 0.30);
        }
        if (this.sintonizador) {
            this.precio = this.precio + 500;
        }
    }

}

