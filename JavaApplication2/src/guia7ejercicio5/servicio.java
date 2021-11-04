/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio5;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author alumno
 */
public class servicio {
   
    private TreeSet<String> pais = new TreeSet();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public servicio() {
        this.pais = new TreeSet();
        
    }

    public TreeSet<String> getPais() {
        return pais;
    }

    public void setPais(TreeSet<String> pais) {
        this.pais = pais;
    }
    
    public void crearPais(){
        String res;
        do{
            System.out.println("Ingrese un pais");
            String p = leer.next();
            pais.add(p);
            System.out.println("Desea ingresar otro pais");
            res = leer.next();
            
        }while(res.equals("si"));
        
        for (String aux : pais){
            System.out.println(aux);
        }
    }
    
    public void buscarPais(){
        System.out.println("");
        System.out.println("Ingrese un pais que desea eliminar");
        String elim = leer.next();
        boolean check = false;
        
        Iterator it = pais.iterator();
        
        while (it.hasNext()) {
            if (it.next().equals(elim)){
                check = true;
                it.remove();
            }
        }
        
        if(check){
            System.out.println("Se ha eliminado el pais");
            for (String aux : pais){
                System.out.println(aux);
            }
        }else{
            System.out.println("No se puso encontrar");
        }
        
    }
}
