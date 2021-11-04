/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevoextra1;

import java.time.LocalDate;

/**
 *
 * @author alumno
 */
public class Velero extends barco {
    private Integer mastiles;

    public Velero() {
    }

    public Velero(Integer mastiles, Integer matricula, Integer eslora, LocalDate fecha_fabricacion) {
        super(matricula, eslora, fecha_fabricacion);
        this.mastiles = mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "mastiles=" + mastiles + '}';
    }
    public void crearVelero(){
        crearBarco();
        System.out.println("Ingresar cantidad de mastiles");
        this.mastiles =sc.nextInt();
    }
   @Override
    public int calcularAlquiler(){
        int diff = super.calcularAlquiler();
        diff = diff + mastiles;
        return diff;        
    } 
    
}
