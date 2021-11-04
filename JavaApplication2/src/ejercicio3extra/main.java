/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3extra;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class main {
    public void main(String[] args){
        Scanner sc =new Scanner(System.in).useDelimiter("/n");
        raices r = new raices();
        servicio op = new servicio();
        op.calcular(r);
        
    }
    
}
