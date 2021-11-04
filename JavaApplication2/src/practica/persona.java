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
public class persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer dni;
    private perro perro;
    

    public persona(String nombre, String apellido, Integer edad, Integer dni, perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.perro = perro;
    }

    persona() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public perro getPerro() {
        return perro;
    }

    public void setPerro(perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", perro=" + perro + '}';
    }
    
        public void perroAdoptado(){
        perro p1= new perro();
        perro p2= new perro();
        Scanner leer = new Scanner(System.in);
        perro p5= new perro();
        System.out.println("Que perro desea adoptar");
        p5.setNombre(leer.next());
        if (p5==p1 ||p5== p2){
            System.out.println("El perro fue adoptado correctamente");
        }else{
            System.out.println("El perro no fue encontrado");
        }
        }
    public void perroAdoptado2(){
        perro p5= new perro();
        perro p6= new perro();
        Scanner leer = new Scanner(System.in);
        System.out.println("Que perro desea adoptar");
        p6.setNombre(leer.next());
        if (p6==p5){
            System.out.println("El perro ya fue adoptado");
        }else{
            System.out.println("El perro no existe");
       
        }
    }
    
    
}
