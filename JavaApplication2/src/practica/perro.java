/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class perro {
    private String nombre;
    private String raza;
    private Integer edad;
    private Double tamanio;
    public perro(){}

    public perro(String nombre, String raza, Integer edad, Double tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getTamanio() {
        return tamanio;
    }

    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + '}';
    }
    
   public void perroAdoptado(){
        perro p1= new perro();
        perro p2= new perro();
        Scanner leer = new Scanner(System.in);
        perro p5= new perro();
        System.out.println("Que perro desea adoptar");
        p5.setNombre(leer.next());
        if (p5.getNombre().equals(p1.getNombre()) ||p5.getNombre().equals(p2.getNombre())){
            System.out.println("El perro fue adoptado correctamente");
        }else{
            System.out.println("El perro no fue encontrado");
        }
        }
    public  void perroAdoptado2(){
        perro p5= new perro();
        perro p6= new perro();
        Scanner leer = new Scanner(System.in);
        System.out.println("Que perro desea adoptar");
        p6.setNombre(leer.next());
        if (p6.getNombre().equals(p5.getNombre())){
            System.out.println("El perro ya fue adoptado");
        }else{
            System.out.println("El perro no existe");
       
        }
    }
     
}
