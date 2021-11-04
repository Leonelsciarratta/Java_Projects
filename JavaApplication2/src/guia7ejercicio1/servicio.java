/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class servicio {
    Scanner sc = new Scanner(System.in).useDelimiter("n");
    private final ArrayList<String> raza = new ArrayList();

    public void creaRazas(){
      
        System.out.println("Ingrese la raza del perro ");
        String ArrayList = sc.next();
        raza.add(ArrayList);
        for (int i=0;i<raza.size();i++) {
        System.out.println(raza.get(i));
        raza.add(ArrayList);
    }
        
       
      
    }
         
        
    }

