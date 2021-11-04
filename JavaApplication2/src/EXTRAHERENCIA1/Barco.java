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
public class Barco {
    protected Integer matricula;
    protected Double eslora;
    protected Integer anio_fabricacion;

    public Barco() {
    }

    public Barco(Integer matricula, Double eslora, Integer anio_fabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio_fabricacion = anio_fabricacion;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public Integer getAnio_fabricacion() {
        return anio_fabricacion;
    }

    public void setAnio_fabricacion(Integer anio_fabricacion) {
        this.anio_fabricacion = anio_fabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anio_fabricacion=" + anio_fabricacion + '}';
    }
    
    
}
