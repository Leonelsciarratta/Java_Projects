/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXTRAHERENCIA1;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Alquiler extends Barco{
    private String nombre_cliente;
    private Integer dni_cliente;
    private Date fecha_alquiler;
    private Date fecha_devolucion;
    private Integer posicion_del_amarre;
    private Barco barco;

    public Alquiler() {
    }


    public Alquiler(String nombre_cliente, Integer dni_cliente, Date fecha_alquiler, Date fecha_devolucion, Integer posicion_del_amarre, Barco barco, Integer matricula, Double eslora, Integer anio_fabricacion) {
        super(matricula, eslora, anio_fabricacion);
        this.nombre_cliente = nombre_cliente;
        this.dni_cliente = dni_cliente;
        this.fecha_alquiler = fecha_alquiler;
        this.fecha_devolucion = fecha_devolucion;
        this.posicion_del_amarre = posicion_del_amarre;
        this.barco = barco;
    }

    
    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public Integer getDni_cliente() {
        return dni_cliente;
    }

    public void setDni_cliente(Integer dni_cliente) {
        this.dni_cliente = dni_cliente;
    }

    public Date getFecha_alquiler() {
        return fecha_alquiler;
    }

    public void setFecha_alquiler(Date fecha_alquiler) {
        this.fecha_alquiler = fecha_alquiler;
    }

    public Date getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(Date fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public Integer getPosicion_del_amarre() {
        return posicion_del_amarre;
    }

    public void setPosicion_del_amarre(Integer posicion_del_amarre) {
        this.posicion_del_amarre = posicion_del_amarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre_cliente=" + nombre_cliente + ", dni_cliente=" + dni_cliente + ", fecha_alquiler=" + fecha_alquiler + ", fecha_devolucion=" + fecha_devolucion + ", posicion_del_amarre=" + posicion_del_amarre + ", barco=" + barco + '}';
    }
    
    
}
