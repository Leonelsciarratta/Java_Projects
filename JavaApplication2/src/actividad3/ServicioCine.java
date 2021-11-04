/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ServicioCine {
    Scanner write = new Scanner(System.in).useDelimiter("\n");
  Pelicula peli = new Pelicula();
    public Cine newCine() {
        Cine cine = new Cine();
        Espectadores espert = new Espectadores();
        System.out.println("Carga de cine");
        cine.setPeli(new Pelicula());
        cine.setEspert(espert.cargaEspectadore());
        System.out.println("Ponele precio");
        cine.setPrecio(write.nextInt());
        return cine;
    }

    public void start() {
        Cine cine = newCine();
        int fill = 8;
        int coll = 6;
        String[][] aux = cine.getSala();
        System.out.println(cine.getEspert().toString());
        
        int cont = 0;
        for (Espectadores espectadores : cine.getEspert()) {
            boolean flag = false;
            do {
                int fil = (int) (Math.random() * 8 );
                int col = (int) (Math.random() * 6 );
                if ((aux[fil][col]) == null){
                    
                   if(espectadores.getDinero() >= cine.getPrecio()&& cine.getPeli().getEdad() <= espectadores.getEdad()) {
                    aux[fil][col] = "X";
                    flag = true;
                    cont++;
                  }else{
                       flag = true;
                   }
                }
           } while (!flag);

        }
        System.out.println(cont);
        cine.setSala(aux);
        mostrar(cine,fill,coll);
    }
    
    public void mostrar(Cine cine,int fil,int col){
        String[][] mostrar = cine.getSala();
        System.out.println(fil);
        System.out.println(col);
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                if (mostrar[i][j] != null) {
                    System.out.print("F"+i+" C"+j+" "+mostrar[i][j]+"|"); 
                }else{
                    System.out.print("F"+i+" C"+j+"  "+"|"); 
                }
                
            }
            System.out.println("");
        }
    }

}

