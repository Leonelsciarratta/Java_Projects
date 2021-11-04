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
public class barco {
    Scanner sc = new Scanner(System.in);
    protected Integer matricula;
    protected Integer eslora;
    protected LocalDate fecha_fabricacion;

    public barco() {
    }

    public barco(Integer matricula, Integer eslora, LocalDate fecha_fabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fecha_fabricacion = fecha_fabricacion;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public LocalDate getFecha_fabricacion() {
        return fecha_fabricacion;
    }

    public void setFecha_fabricacion(LocalDate fecha_fabricacion) {
        this.fecha_fabricacion = fecha_fabricacion;
    }

    @Override
    public String toString() {
        return "barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", fecha_fabricacion=" + fecha_fabricacion + '}';
    }
    public LocalDate newfabricacion(){
        int day = (int) (Math.random()*30+1);
        int month = (int) (Math.random()*12+1);
        int age = ThreadLocalRandom.current().nextInt(1980, 2021);
        LocalDate local = LocalDate.of(age, month, day);
        return local;
    }
    
    public void crearBarco(){
        System.out.println("Ingrese la matricula del barco");
        matricula= sc.nextInt();
        System.out.println("Ingrese la eslora del barco");
        eslora= sc.nextInt();
        this.fecha_fabricacion=newfabricacion();
    }

    
    public int calcularAlquiler(){
        Alquiler alq = new Alquiler();
        alq.crearAlquiler();
        System.out.println(alq.getFecha_devolucion());
        System.out.println("devolucion "+alq.getFecha_devolucion().getDayOfMonth());
        System.out.println(alq.getFecha_alquiler());
        System.out.println("Alquiler "+alq.getFecha_alquiler().getDayOfMonth());
        int diff = (alq.getFecha_devolucion().getDayOfMonth() - alq.getFecha_alquiler().getDayOfMonth())*10*eslora;
       return diff;
    }
    
}
