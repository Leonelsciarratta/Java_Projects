/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancias.servicios;

import estancias.entidades.casas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

/**
 *
 * @author alumno
 */
public class CasaDao extends Dao {
    public List<casas> EjercicioB() throws Exception {

	try {

	    String sql = "SELECT * FROM casas "
		    + " WHERE fecha_desde between '2020-08-01' AND '2020-08-31' and pais='Reino Unido'";
            
	    consultarBase(sql);
	    
	    List<casas> casitas = new ArrayList();
	    
	    casas cason = null;
	    
	    while (resultado.next()) {
		
		cason = new casas();
		
		cason.setId(resultado.getInt(1));
                cason.setCalle(resultado.getString(2));
                cason.setNumero(resultado.getInt(3));
                cason.setCodigo_postal(resultado.getString(4));
                cason.setCiudad(resultado.getString(5));
                cason.setPais(resultado.getString(6));
                cason.setFecha_desde(resultado.getDate(7));
                cason.setFecha_hasta(resultado.getDate(8));
                cason.setTiempo_minimo(resultado.getInt(9));
                cason.setTiempo_maximo(resultado.getInt(10));
                cason.setPrecio_habitacion(resultado.getDouble(11));
                cason.setTipo_vivienda(resultado.getString(12));
                casitas.add(cason);
		
	    }
	    desconectarBase();
	    return casitas;
	    
	} catch (Exception e) {
	    throw e;
	}
}
   

public void EjercicioG() throws Exception {

	try {
           
          
	    String sql = "select concat (pais, count( pais) ) as pais from  casas group by pais";
		    
	    consultarBase(sql);
	    
	   
		
		String pais;

while(resultado.next()){
    pais = resultado.getString("pais");
    System.out.println("Cantidad de casas en " + pais);
}
		
	    
	    desconectarBase();
	    
	    
	} catch (Exception e) {
	    throw e;
	}
}

public void contar_num_personajes() throws SQLException, Exception{ 
     String n= "";
     conectarBase();
     String sql = "select pais,count( pais) from  casas group by pais";
     consultarBase(sql);
     
     // almaceno resultado de consulta en ResultSet
     ResultSet rs  = sentencia.executeQuery("select pais,count( pais) from  casas group by pais");
     // chequeo que el result set no sea vacío, moviendo el cursor a la 
     // primer fila. (El cursor inicia antes de la primer fila)
     if(rs.next()) {
       //Si hay resultados obtengo el valor. 
        n= rs.getString(1);
     }
     // libero recursos
     desconectarBase();
     
}

    private String count(String pais) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    void modificarPrecio(List<casas> casitas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void insertarModificarEliminar ()throws Exception {
        try {
           
            conectarBase();
            sentencia = conexion.createStatement();
           
           String query ="update casas set precio_habitacion= (precio_habitacion+(precio_habitacion*0.05))";
           sentencia.executeUpdate(query);
           System.out.println("se actualizaron los datos");
        } catch (SQLException ex) {
             conexion.rollback();
            /*
                Descomentar la linea anterior si desean tener en cuenta el rollback.
                Correr el siguiente script en Workbench
            
                SET autocommit=1;
                COMMIT;
            
                **Sin rollback igual anda
             */
            throw ex;
        } finally {
            desconectarBase();
        }
    }
}
