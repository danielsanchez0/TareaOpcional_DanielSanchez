/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.EmpAsalariados;
import Entidad.EmpHoras;
import Entidad.Empleados;
import Persistencia.PersistenciaEmpleados;
import java.util.List;

/**
 * controla las operaciones hechas a la base de datos.
 *
 * @author DANIEL FERNANDO SANCHEZ ORTIZ
 * @version 1.0
 */
public class Control {

    private PersistenciaEmpleados persistencia;

    public Control() {
        this.persistencia = new PersistenciaEmpleados();
    }

    /**
     * agrega un empleado de tipo asalariado.
     *
     * @param id, identificador del empleado
     * @param nombre, nombre del empleado
     * @param salarioSemanal, salario del empleado
     * @return el empleado agregadoa la base de datos.
     */
    public Empleados agregarAsalariado(int id, String nombre, double salarioSemanal) {
        Empleados empleado = new EmpAsalariados(salarioSemanal, id, nombre);
        persistencia.guardarEmpleado(empleado);
        return empleado;
    }

    /**
     * agrega un empleado por horas a la base de datos
     *
     * @param id, identificador del empleado
     * @param nombre , nombre del empleado
     * @param valorHora , valor por cada hora trabajada para el empleado
     * @param horas_trabajadas, numero de horas que ha trabajado
     * @return retorna el empleado que agregamos.
     */
    public Empleados agregarEmpHoras(int id, String nombre, double valorHora, float horas_trabajadas) {
        Empleados empleado = new EmpHoras(id, nombre, valorHora, horas_trabajadas);
        persistencia.guardarEmpleado(empleado);
        return empleado;
    }

    /**
     *
     * @return la nomina de la semana segun los datos de la base de datos
     */
    public double calcularSalario() {
        double salary_all_employees = 0;
        List<Empleados> empleados = this.persistencia.buscarTodos();

        for (Empleados empleado : empleados) {
            salary_all_employees = salary_all_employees + empleado.calcularSalario();
        }

        return salary_all_employees;
    }

    /**
     *
     * @param identificador
     * @return el empleado que coincida con el mismo codigo
     */
    public Empleados buscarEmpleado(int identificador) {
        Empleados empleado = persistencia.consultarEmpleado(identificador);
        return empleado;
    }
}
