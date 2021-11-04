/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevoextra1;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author alumno
 */
public class Alquiler extends barco {
    Scanner sc = new Scanner(System.in);
    private String nombre;
    private Integer dni;
    private LocalDate fecha_alquiler;
    private LocalDate fecha_devolucion;
    private Integer amarre;
    private barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer dni, LocalDate fecha_alquiler, LocalDate fecha_devolucion, Integer amarre, barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fecha_alquiler = fecha_alquiler;
        this.fecha_devolucion = fecha_devolucion;
        this.amarre = amarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public LocalDate getFecha_alquiler() {
        return fecha_alquiler;
    }

    public void setFecha_alquiler(LocalDate fecha_alquiler) {
        this.fecha_alquiler = fecha_alquiler;
    }

    public LocalDate getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(LocalDate fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public Integer getAmarre() {
        return amarre;
    }

    public void setAmarre(Integer amarre) {
        this.amarre = amarre;
    }

    public barco getBarco() {
        return barco;
    }

    public void setBarco(barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", dni=" + dni + ", fecha_alquiler=" + fecha_alquiler + ", fecha_devolucion=" + fecha_devolucion + ", amarre=" + amarre + ", barco=" + barco + '}';
    }
    
   
   public LocalDate fecha_actual(){
        int day = (int) (Math.random()*30+1);
        int month = (int) (Math.random()*12+1);
        int age = ThreadLocalRandom.current().nextInt(2020, 2021);
        LocalDate local = LocalDate.of(2021, 8, 1);
        return local;
    }

    

    

    void crearAlquiler() {
        System.out.println("Ingrese su nombre");
       nombre=sc.next();
       System.out.println("Ingrese su dni");
       dni=sc.nextInt();
       System.out.println("La fecha de alquiler es ");
       fecha_alquiler= fecha_actual();
       System.out.println("La fecha de devolucion es ");
       fecha_devolucion=LocalDate.now();
       System.out.println("Su posicion de amarre es ");
       amarre=(int)(Math.random()*100+1);
    }
}
