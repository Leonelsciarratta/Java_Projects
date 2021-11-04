/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevoextra1;

/**
 *
 * @author alumno
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Velero vel = new Velero();
        System.out.println(vel.getClass().getSimpleName());
        vel.crearVelero();
        System.out.println("EL precio del alquiler es "+vel.calcularAlquiler());
        
        barcoMotor bm = new barcoMotor();
        System.out.println(bm.getClass().getSimpleName());
        bm.crearBarcoMotor();
        System.out.println("EL precio del alquiler es "+bm.calcularAlquiler());
        
        yate yt = new yate();
        System.out.println(yt.getClass().getSimpleName());
        yt.crearYate();
        System.out.println("EL precio del alquiler es "+yt.calcularAlquiler());
    }
    }
    

