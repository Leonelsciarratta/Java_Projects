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
public class barcos_motor extends Barco {
    private Double potenciaCV;

    public barcos_motor() {
    }

    public barcos_motor(Double potenciaCV, Integer matricula, Double eslora, Integer anio_fabricacion) {
        super(matricula, eslora, anio_fabricacion);
        this.potenciaCV = potenciaCV;
    }

    public Double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
}
