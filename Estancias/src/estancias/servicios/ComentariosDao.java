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
public class ComentariosDao extends Dao {
    public void EjercicioH() throws Exception {

	try {
           
          
	    String sql = "select * from comentarios join casas on comentarios.id_casa = casas.id_casa where comentario like '%limpia%' and  pais ='Reino Unido'";
		    
	    consultarBase(sql);
	    
	   
		int id_comentario;
                int id_casa;
		String comentario;

while(resultado.next()){
    id_comentario = resultado.getInt("id_comentario");
    id_casa = resultado.getInt("id_casa");
    comentario =resultado.getString("comentario");
    System.out.println("Las casas que contienen la palabra limpia en sus comentarios son: " + "id_comentario:" + "" + id_comentario + "id_casa:" + "" + id_casa + "comentario:"  + "" + comentario);
}
		
	    
	    desconectarBase();
	    
	    
	} catch (Exception e) {
	    throw e;
	}
}
    
}
