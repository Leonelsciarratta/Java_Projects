/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Date;

/**
 *
 * @author alumno
 */
public class persona {
    private Integer dia;
    private Integer mes;
    private Integer anio;
    private Date fecha;
    public persona(){
    }
    public persona(Integer dia, Integer mes, Integer anio, Date fecha ){
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
        this.fecha=fecha;
        
    }

    persona(String nombre, Date fecha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "persona{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
    
}
