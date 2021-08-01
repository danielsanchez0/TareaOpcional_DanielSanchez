/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Empleados;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * pruebas unitarias para la clase control.
 * @author DANIEL FERNANDO SANCHEZ ORTIZ
 * @version 1.0
 */
public class ControlIT {

    /**
     * prueba antes de insertar en la base de datos.
     */
    @Test
    public void testCalcularSalario() {
        double valorEsperado = 0;

        Control control = new Control();
        double salario = control.calcularSalario();

        assertEquals(valorEsperado, salario);
    }

    /**
     * test normal agrega un empleado asalariado a la base de datos.
     */
    @Test
    public void testAgregarAsalariado() {
        Control control = new Control();
        Empleados newEmpleado = control.agregarAsalariado(1, "DANIEL FERNANDO SANCHEZ", 500000);
        String valorEsperado = newEmpleado.toString();

        Empleados baseEmpleado = control.buscarEmpleado(1);
        String valorFinal = baseEmpleado.toString();

        assertTrue(valorEsperado.equals(valorFinal));
    }

    /**
     * test normal agrega un empleado por horas a la base de datos.
     */
    @Test
    public void testAgregarEmpHoras() {
        Control control = new Control();
        Empleados newEmpleado = control.agregarEmpHoras(2, "ADRIANA ROSALES", 20000, 10);
        String valorEsperado = newEmpleado.toString();

        Empleados baseEmpleado = control.buscarEmpleado(2);
        String valorFinal = baseEmpleado.toString();

        assertTrue(valorEsperado.equals(valorFinal));
    }

    /**
     * consulta el total de nomina de la semana.
     */
    @Test
    public void testCalcularNomina() {
        double valorEsperado = 700000.0;

        Control control = new Control();
        double valorReal = control.calcularSalario();

        System.out.println(valorEsperado);
        System.out.println(valorReal);
        assertEquals(valorEsperado, valorReal);
    }
}
