/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

/**
 *
 * @author alumno
 */
public class main {
    public static void main(String[] args) {
    sae nuevoservicio = new sae();
        cadena frase = nuevoservicio.crearcadena();
        System.out.println(frase);
        nuevoservicio.contarVocales(frase);
        nuevoservicio.invertirFrase(frase);
        nuevoservicio.vacesRepetidos(frase);
        nuevoservicio.compararLongitud(frase);
        nuevoservicio.unirFrase(frase);
        nuevoservicio.reemplazar(frase);
        nuevoservicio.contiene(frase);
        
        
        
}
}