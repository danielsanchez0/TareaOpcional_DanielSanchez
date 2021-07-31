/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.EmpAsalariados;
import Entidad.Empleados;
import Persistencia.PersistenciaEmpleados;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleados empleado = new EmpAsalariados(800000, 0, "daniel fernando sanchez");
        PersistenciaEmpleados persistencia = new PersistenciaEmpleados();
        
        persistencia.guardarEmpleado(empleado);
    }
    
}
