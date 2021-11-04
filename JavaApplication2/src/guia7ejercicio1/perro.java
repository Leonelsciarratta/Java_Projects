/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class perro {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<String> listaRazas = new ArrayList();

    public perro() {
        this.listaRazas = new ArrayList();
    }

    public void crearListaRazas() {

        String rta;
        do {
            System.out.println("Ingrese raza a agregar a la lista de razas.");
            rta = leer.next();
            listaRazas.add(rta);
            System.out.println("Quiere agregar otra raza? si = continuar , no = salir.");
            rta = leer.next();
        } while (!(rta.equalsIgnoreCase("no")));

    }

    public void mostrarRazas() {
        System.out.println("Las razas guardadas en su lista son: ");
        for (String raza : listaRazas) {
            System.out.println(raza);
            
        }
    }

    public void buscarPerro() {
        Iterator it = listaRazas.iterator();
        System.out.println("Ingrese una raza a buscar en su lista, si está la eliminaremos sino, se lo informaremos.");
        Boolean decir = true;
        String rta = leer.next();

        while (it.hasNext()) {
            if (it.next().equals(rta)) {
                it.remove();
                System.out.println("Hemos sacado a " + rta + " de la lista.");
                break;

            }else{
                decir = false;
            }
                
        }
        if (decir == false ) {
            System.out.println("No se encontró la raza que ingresó.");
        }

        mostrarRazas();
    }
}

