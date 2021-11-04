/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancias.servicios;

import java.util.Collection;
import estancias.entidades.estancia;
import estancias.entidades.familia;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class EstanciaDao extends Dao {
    public List<estancia> EjercicioE() throws Exception {

	try {

	    String sql = "SELECT * FROM estancias ";
            
	    consultarBase(sql);
	    
	    List<estancia> miEstancia = new ArrayList();
	    
	    estancia est = null;
	    
	    while (resultado.next()) {
		
		est = new estancia();
		
		est.setId_estancia(resultado.getInt(1));
                est.setId_cliente(resultado.getInt(2));
                est.setId_casa(resultado.getInt(3));
                est.setNombre_huesped(resultado.getString(4));
                est.setFecha_desde(resultado.getDate(5));
                est.setFecha_hasta(resultado.getDate(6));
                miEstancia.add(est);
		
	    }
	    desconectarBase();
	    return miEstancia;
	    
	} catch (Exception e) {
	    throw e;
	}
}
    public void EjercicioI() throws Exception {

	try {
           
          
	   conectarBase();
            sentencia = conexion.createStatement();
           
           String query ="INSERT INTO estancias (id_estancia, id_cliente,id_casa, nombre_huesped,fecha_desde, fecha_hasta) VALUES(17,6,4,'Ramiro Casas','2021-03-09','2021-04-12')";
           sentencia.executeUpdate(query);
           System.out.println("Los datos ya se han subido a la base de datos");
		
	    
	    desconectarBase();
	    
	    
	} catch (Exception e) {
            
	    throw e;
	}
}
   
}
    

