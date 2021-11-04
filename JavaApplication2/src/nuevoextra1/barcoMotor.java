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
public class barcoMotor extends barco {
    private Double potenciaCV;

    public barcoMotor() {
    }

    public barcoMotor(Double potenciaCV, Integer matricula, Integer eslora, LocalDate fecha_fabricacion) {
        super(matricula, eslora, fecha_fabricacion);
        this.potenciaCV = potenciaCV;
    }

    public Double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return "barcoMotor{" + "potenciaCV=" + potenciaCV + '}';
    }
    public void crearBarcoMotor(){
        crearBarco();
        System.out.println("Ingresar la potencia cv ");
        this.potenciaCV =sc.nextDouble();
    }
    @Override
    public int calcularAlquiler(){
        int diff = super.calcularAlquiler();
        int motor2 = (int)Math.round(potenciaCV);
        diff = diff + motor2;
        return diff;        
    }
}
    

