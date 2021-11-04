/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancias.servicios;

import estancias.entidades.casas;
import java.util.List;
import estancias.servicios.CasaDao;
import java.util.Collection;


/**
 *
 * @author alumno
 */
public class CasaServicio {
    
    private final CasaDao DAO;

    public CasaServicio() {
        this.DAO = new CasaDao();
    }

    public List<casas> listarCasas() throws Exception {

        try {

            List<casas> casitas = DAO.EjercicioB();
            //mostrar
            return casitas;

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error de sistema");
        }

    }
    
        public void modificaPrecio(int precio_habitacion) throws Exception {

        try {

            //Validamos
            if (precio_habitacion < 0) {
                throw new Exception("Debe indicar el precio");
            }

            //Buscamos
            
            
        } catch (Exception e) {
            throw e;
        }
    }
        

}
