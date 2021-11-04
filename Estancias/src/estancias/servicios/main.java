/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancias.servicios;

import estancias.entidades.casas;
import estancias.entidades.estancia;
import java.sql.Connection;
import java.sql.DriverManager;
import estancias.entidades.familia;
import estancias.servicios.familiaServicio;
import java.util.List;
import estancias.servicios.FamiliaDao;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import estancias.servicios.Dao;
/**
 *
 * @author alumno
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        FamiliaDao fs = new FamiliaDao();
        System.out.println(".....EJERCICIO A.....");
        List<familia> familias = fs.EjercicioA();
        System.out.println(familias);
        CasaDao cs = new CasaDao();
        System.out.println(".....EJERCICIO B.....");
        List<casas> casitas = cs.EjercicioB();
        System.out.println(casitas);
        System.out.println(".....EJERCICIO C.....");
        List<familia> Familias_con_Y = fs.EjercicioC();
        System.out.println(Familias_con_Y);
        System.out.println(".....EJERCICIO D.....");
        List<familia> FamiliasHotmail = fs.EjercicioD();
        System.out.println(FamiliasHotmail);
        EstanciaDao es = new EstanciaDao();
        System.out.println(".....EJERCICIO E.....");
        List<estancia> miEstancia = es.EjercicioE();
        System.out.println(miEstancia);
        System.out.println(".....EJERCICIO F.....");
        cs.insertarModificarEliminar();
        System.out.println(".....EJERCICIO G.....");
        cs.EjercicioG();
        System.out.println(".....EJERCICIO H.....");
        ComentariosDao com = new ComentariosDao();
        com.EjercicioH();
       System.out.println(".....EJERCICIO I.....");
       es.EjercicioI();
        
        
        
    }
 
}

 
      