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
import estancias.servicios.FamiliaDao;
import java.util.Collection;
import java.util.List;

public class familiaServicio {

    private final FamiliaDao DAO;

    public familiaServicio() {
        this.DAO = new FamiliaDao();
    }

    public List<familia> listarFamilia() throws Exception {

        try {

            List<familia> familias = DAO.EjercicioA();
            //mostrar
            return familias;

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error de sistema");
        }

    }
public List<familia> Familias_con_Y() throws Exception {

        try {

            List<familia> TerminaY = DAO.EjercicioC();
            //mostrar
            return TerminaY;

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error de sistema");
        }

    }
public List<familia> FamiliasHotmail() throws Exception {

        try {

            List<familia> FamiliasHotmail = DAO.EjercicioD();
            //mostrar
            return FamiliasHotmail;

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error de sistema");
        }

    }
    public void imprimirFamilias() throws Exception {

        try {

            //Listamos los familias
            List<familia> familias = listarFamilia();

            //Imprimimos los familias
            if (familias.isEmpty()) {
                throw new Exception("No existen familias para imprimir");
            } else {
                for (familia f1 : familias) {

                    System.out.println(f1);

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error de sistema");
        }
    }

    public void crearFamilia(String nombre, String email) throws Exception {

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new Exception("Debe indicar el nombre de la familia");
        }
        if (nombre.length() < 8) {
            throw new Exception("El nombre no puede tener menos de 8 caracteres");
        }

        if (email == null || email.trim().isEmpty()) {
            throw new Exception("Debe indicar el correo electrónico");
        }
        if (email.contains("@") == false) {
            throw new Exception("El correo electrónico es incorrecto");
        }
        if (buscarFamiliaPorCorreoElectronico(email) != null) {
            throw new Exception("Ya existe una familia con el correo electrónico indicado " + email);
        }

        familia family = new familia();
        family.setNombre(nombre);
        family.setEmail(email);
        DAO.guardarFamilia(family);

    }

    public familia buscarFamiliaPorCorreoElectronico(String correoElectronico) throws Exception {

        try {

            //Validamos
            if (correoElectronico == null || correoElectronico.trim().isEmpty()) {
                throw new Exception("Debe indicar el correo electrónico");
            }

            familia family = DAO.buscarFamiliaPorCorreoElectronico(correoElectronico);

            return family;
        } catch (Exception e) {
            throw e;
        }
    }

}
