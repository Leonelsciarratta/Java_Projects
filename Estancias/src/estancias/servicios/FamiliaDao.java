/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancias.servicios;

/**
 *
 * @author alumno
 */


import estancias.entidades.familia;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class FamiliaDao extends Dao {

    

    public familia buscarFamiliaPorCorreoElectronico(String email) throws Exception {
        try {

            String sql = "SELECT * FROM familias "
                    + " WHERE email = '" + email + "'";

            consultarBase(sql);

            familia family = null;
            while (resultado.next()) {

                family = new familia();
                family.setId(resultado.getInt(1));
                family.setNombre(resultado.getString(2));
                family.setEmail(resultado.getString(6));

            }
            desconectarBase();
            return family;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
public List<familia> EjercicioA() throws Exception {

	try {

	    String sql = "SELECT * FROM familias "
		    + " WHERE num_hijos >=3 and  edad_maxima < 10";

	    consultarBase(sql);
	    
	    List<familia> familias = new ArrayList();
	    
	    familia family = null;
	    
	    while (resultado.next()) {
		
		family = new familia();
		
		family.setId(resultado.getInt(1));
                family.setNombre(resultado.getString(2));
                familias.add(family);
		
	    }
	    desconectarBase();
	    return familias;
	    
	} catch (Exception e) {
	    throw e;
	}
}
public List<familia> EjercicioC() throws Exception {

	try {

	    String sql = "SELECT * FROM FAMILIAS "
		    + "WHERE NOMBRE LIKE \"%Y\"";

	    consultarBase(sql);
	    
	    List<familia> Familias_con_Y = new ArrayList();
	    
	    familia family = null;
	    
	    while (resultado.next()) {
		
		family = new familia();
		
		family.setId(resultado.getInt(1));
                family.setNombre(resultado.getString(2));
                Familias_con_Y.add(family);
		
	    }
	    desconectarBase();
	    return Familias_con_Y;
	    
	} catch (Exception e) {
	    throw e;
	}
}
public List<familia> EjercicioD() throws Exception {

	try {

	    String sql = "SELECT * FROM FAMILIAS "
		    + "WHERE EMAIL LIKE \"%HOTMAIL%\"";

	    consultarBase(sql);
	    
	    List<familia> FamiliasHotmail = new ArrayList();
	    
	    familia family = null;
	    
	    while (resultado.next()) {
		
		family = new familia();
		
		family.setId(resultado.getInt(1));
                family.setNombre(resultado.getString(2));
                FamiliasHotmail.add(family);
		
	    }
	    desconectarBase();
	    return FamiliasHotmail;
	    
	} catch (Exception e) {
	    throw e;
	}
}

    void guardarFamilia(familia family) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
