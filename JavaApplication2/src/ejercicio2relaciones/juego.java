/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2relaciones;

/**
 *
 * @author alumno
 */
public class juego {
    private revolver revolver;
    private jugador jugador;

    public juego(revolver revolver, jugador jugador) {
        this.revolver = revolver;
        this.jugador = jugador;
        
    }

    public revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(revolver revolver) {
        this.revolver = revolver;
    }

    public jugador getJugador() {
        return jugador;
    }

    public void setJugador(jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        return "juego{" + "revolver=" + revolver + ", jugador=" + jugador + '}';
    }
    
    
}
