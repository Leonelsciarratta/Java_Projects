/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3extra;

/**
 *
 * @author alumno
 */
public class servicio {
    public double getdiscriminante(raices r){
        double discriminante;
        discriminante = Math.pow(r.getB(),2)-4*r.getA()*r.getC();
        return discriminante;
        
    }
    public boolean tieneRaices(raices r){
        return getdiscriminante(r) >= 0.0;
    }
    public boolean tieneRaiz(raices r){
        return getdiscriminante(r) == 0.0;
    }
    public void obtenerraices(raices r){
        double x1, x2;
        x1=(-(r.getB())) + Math.sqrt((Math.pow(r.getB(),2)-4*r.getA()*r.getC())/(2*r.getA()));
        x2=(-(r.getB())) - Math.sqrt((Math.pow(r.getB(),2)-4*r.getA()*r.getC())/(2*r.getA()));
        System.out.println("el primer valor es " + x1 + "y 2l segundo valor es " + x2);
    }
    public void obtenerRaiz(raices r){
        double x1;
        x1=-(r.getB()/(2*r.getA()));
        System.out.println("La unica solucion es " + x1);
    }
    public void calcular (raices r){
        getdiscriminante(r);
        if(tieneRaices(r)){
            obtenerraices(r);
        }
        if (tieneRaiz(r)){
            obtenerRaiz(r);
        }else{
            System.out.println("No tiene Solucion");
        }
    }

    
}
