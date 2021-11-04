/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXTRAHERENCIA1;

/**
 *
 * @author alumno
 */
public class Yate extends Barco{
    private Double potenciaCV;
    private Integer camarotes;

    public Yate() {
    }

    public Yate(Double potenciaCV, Integer camarotes, Integer matricula, Double eslora, Integer anio_fabricacion) {
        super(matricula, eslora, anio_fabricacion);
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

   
    
}
