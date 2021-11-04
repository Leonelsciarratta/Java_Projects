
package ejercicio9;

import java.util.Scanner;

public class ServiciosMatematicas {    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public Matematicas operaciones(){
        Matematicas operaciones= new Matematicas();
        System.out.println("Ingrese un numero");
        operaciones.setNum1(sc.nextDouble());
        System.out.println("Ingrese otro numero");
        operaciones.setNum2(sc.nextDouble());
       return operaciones;
    }        
    public static double devolverMayor(Matematicas operaciones){
        System.out.println("el numero mayor es" + Math.max(operaciones.getNum1() , operaciones.getNum2()));
        return Math.max(operaciones.getNum1() , operaciones.getNum2());
        
    }
    public static float calcularPotencia(Matematicas operaciones){ 
        System.out.println ("la potencia es" + Math.round(Math.pow(Math.max(operaciones.getNum1(),operaciones.getNum2()), Math.min(operaciones.getNum1(),operaciones.getNum2()))));
        return Math.round(Math.pow(Math.max(operaciones.getNum1(),operaciones.getNum2()), Math.min(operaciones.getNum1(),operaciones.getNum2())));
    }
    
    public static double calcularRaiz(Matematicas operaciones){
        System.out.println("la raiz es " + Math.sqrt(Math.abs(Math.min(operaciones.getNum1(),operaciones.getNum2()))));
        return Math.sqrt(Math.abs(Math.min(operaciones.getNum1(),operaciones.getNum2())));
    } 
}
