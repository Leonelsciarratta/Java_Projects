/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Arrays;

/**
 *
 * @author piriv
 */
public class solu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double[] reales50 = new double[50];
       double[] reales20 = new double[20];
       
       
       
       System.out.println(Arrays.toString(reales50));
       Arrays.sort(reales50);
       Arrays.fill(reales20, 0.5);
        //reales20 = Arrays.copyOfRange(reales50, 0, 9);
        System.arraycopy(reales50, 0, reales20, 0, 9);
       //reales20 = Arrays.copyOfRange(reales50, 0, 9);
       System.out.println(Arrays.toString(reales50));
       System.out.println(Arrays.toString(reales20));
       
    }
    
    public static double rand(){
        return Math.random()*10;
    }
    
    
    
}
