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
 *
 * @author usuario
 */
public class PersistenciaEmpleados {

    public PersistenciaEmpleados() {
    }
    
    public void guardarEmpleado(Empleados empleado) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("jpaEmpleados");
        EntityManager gestor = fabrica.createEntityManager();
        gestor.getTransaction().begin();
        gestor.persist(empleado);
        gestor.getTransaction().commit();
        gestor.close();
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
        Query consulta = gestor.createQuery("select (*) from Empleados");
        List<Empleados> listaEmpleados = consulta.getResultList();
        gestor.close();
        return listaEmpleados;
    }
}
