/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mistrabajos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
//tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
//con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
//carácter tiene que ser X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la
//secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
//secuencia distinta de FDE, que no respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
//correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
//se utilizan las siguientes funciones de Java Substring(), Length(), equals().
Scanner leer = new Scanner(System.in);
String frase;
int correcta, incorrecta;
correcta=0;
incorrecta=-1;
        do {
            System.out.println("Ingrese una frase de 5 caracteres");
            frase=leer.next();
            if (frase.length()<=5 && frase.substring(0,1).equals("x")||frase.substring(0,1).equals("X") && frase.substring((frase.length()-1),frase.length()).equals("O")||frase.substring((frase.length()-1),frase.length()).equals("o")){
                correcta=correcta+1;
    } else{ incorrecta=incorrecta+1;
            }  
        } while (!frase.equals("&&&&&"));
        System.out.println("La cantidad de ingresos correctos fueron " + correcta);
          System.out.println("la cantidad de ingresos incorrectos fueron " + incorrecta);
    }
    
}




