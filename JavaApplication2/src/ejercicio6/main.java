/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author alumno
 */
public class main {
     public static void main(String[] args){
    servicio Nuevoservicio= new servicio();
    cafetera c = Nuevoservicio.nuevocafe();
    servicio.llenarcafetera(c);
    servicio.servirtaza(c);
    servicio.vaciarcafetera(c);
    servicio.agregarcafe(c);
}
}