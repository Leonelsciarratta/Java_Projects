/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11ectra;


import java.util.Date;

/**
 *
 * @author alumno
 */
public class persona {
    private String nombre;
    private Date fechanac;
   public persona(){}  
   public persona(String nombre, Date fechanac){
       this.nombre=nombre;
       this.fechanac=fechanac;
       
   }  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", fechanac=" + fechanac + '}';
    }
    
}  