/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancias.servicios;

import estancias.entidades.estancia;
import estancias.servicios.EstanciaDao;
import java.util.List;
import java.util.Collection;

/**
 *
 * @author alumno
 */
public class EstanciaServicio {
    private final EstanciaDao DAO;

    public  EstanciaServicio() {
        this.DAO = new EstanciaDao();
    }

    public List<estancia> listarEstancias() throws Exception {

        try {

            List<estancia> miEstancia = DAO.EjercicioE();
            //mostrar
            return miEstancia;

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error de sistema");
        }

    }
    
}
