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
public class Lavadora extends Electrodomesticos {
    
    private Double carga;

    public Lavadora(Double carga, String color, String consumo, Double precio, Double peso) {
        super(color, consumo, precio, peso);
        this.carga = carga;
    }

    public Lavadora() {
    }



    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + " " + carga + super.toString() + '}';
    }
    
    
    public Lavadora crearLavadora(){
//        • Método crearLavadora (): este método llama a crearElectrodomestico() de la
//clase padre, lo utilizamos para llenar los atributos heredados del padre y
//después llenamos el atributo propio de la lavadora.
     Lavadora lavarropas =  new Lavadora();
     this.carga = 35D;
     crearElectrodomestico();
     precioFinal();
     return lavarropas;
    }
    
    
   


    @Override
    public void precioFinal() {
        //        • Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
//si la carga es menor o igual, no se incrementará el precio. Este método debe
//llamar al método padre y añadir el código necesario. Recuerda que las
//condiciones que hemos visto en la clase Electrodoméstico también deben
//afectar al precio.
        super.precioFinal(); 
        if(this.carga>30){
            this.precio = this.precio+500;
        }
    }



    
    
    
    
    
}
