/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Entidad.Empleados;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.List;

/**
 * clase persistencia para la tabla empleados.
 *
 * @author DANIEL FERNANDO SANCHEZ ORTIZ
 * @version 1.0
 */
public class PersistenciaEmpleados {

    public PersistenciaEmpleados() {
    }

    /**
     * guarda el empleado en la tabla empleados de la base de datos.
     *
     * @param empleado
     */
    public void guardarEmpleado(Empleados empleado) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("jpaEmpleados");
        EntityManager gestor = fabrica.createEntityManager();
        gestor.getTransaction().begin();
        gestor.persist(empleado);
        gestor.getTransaction().commit();
        gestor.close();
    }

    /**
     * Buscar una mascota en la base de datos
     *
     * @param identificador el número que identifica al empleado
     * @return el objeto Empleado o null si no se encuentra
     */
    public Empleados consultarEmpleado(int identificador) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("jpaEmpleados");
        EntityManager gestor = fabrica.createEntityManager();
        Empleados empleado = gestor.find(Empleados.class, identificador);
        gestor.close();
        return empleado;
    }

    /**
     * Retorna la lista de todas los empleados registrados.
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public List<Empleados> buscarTodos() {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("jpaEmpleados");
        EntityManager gestor = fabrica.createEntityManager();
        Query consulta = gestor.createQuery("select m from Empleados m");
        List<Empleados> listaEmpleados = consulta.getResultList();
        gestor.close();
        return listaEmpleados;
    }
}
