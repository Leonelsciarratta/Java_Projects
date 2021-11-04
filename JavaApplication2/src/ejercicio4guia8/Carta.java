/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4guia8;

/**
 *
 * @author alumno
 */
public class Carta {
    private Integer num;
     private Palo palo;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public Carta() {
    }

    public Carta(Integer num, Palo palo) {
        this.num = num;
        this.palo = palo;
    }

    @Override
    public String toString() {
        //return "Carta{" + "num=" + num + ", palo=" + palo + '}';
        return "carta es "+ num + " de "+ palo + "\n";
    }

    Object getCarta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
     
}

    

