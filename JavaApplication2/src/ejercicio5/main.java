/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author alumno
 */
public class main {
    public static void main(String[] args){
    servicio Nuevoservicio= new servicio();
    cuenta c = Nuevoservicio.nuevaCuenta();
    servicio.ingresar(c);
    servicio.retirar(c);
    servicio.extraccionRapida(c);
    servicio.Consultasaldo(c);
    servicio.Consultadatos(c);
}
    
}