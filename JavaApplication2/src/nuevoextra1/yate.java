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

public class yate extends barco{
    private Double potenciaCV;
    private Integer camarotes;

    public yate() {
    }

    public yate(Double potenciaCV, Integer camarotes, Integer matricula, Integer eslora, LocalDate fecha_fabricacion) {
        super(matricula, eslora, fecha_fabricacion);
        this.potenciaCV = potenciaCV;
        this.camarotes = camarotes;
    }

    public Double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public Integer getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return "yate{" + "potenciaCV=" + potenciaCV + ", camarotes=" + camarotes + '}';
    }
    public void crearYate(){
        crearBarco();
        System.out.println("Ingresar la potencia cv ");
        this.potenciaCV =sc.nextDouble();
        System.out.println("Ingresar la cantidad de camarotes ");
        this.camarotes =sc.nextInt();
    }
    @Override
    public int calcularAlquiler(){
        int diff = super.calcularAlquiler();
        int motor2 = (int)Math.round(potenciaCV);
        diff = diff + motor2 + camarotes;
        return diff;        
    }
}
