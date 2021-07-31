/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

/**
 *
 * @author DANIEL FERNANDO SANCHEZ ORTIZ
 * @version 1.0
 */
@Entity
@DiscriminatorValue("asalariado")

public class EmpAsalariados extends Empleados {

    private double salario_semanal;

    public EmpAsalariados() {
    }

    /**
     * inicializa la variable de tipo EmpAsalariado
     *
     * @param salario_semanal
     * @param identificador
     * @param nombre
     */
    public EmpAsalariados(double salario_semanal, int identificador, String nombre) {
        super(identificador, nombre);
        this.salario_semanal = salario_semanal;
    }

    /**
     * @return the salario_semanal
     */
    public double getSalario_semanal() {
        return salario_semanal;
    }

    /**
     * @param salario_semanal the salario_semanal to set
     */
    public void setSalario_semanal(double salario_semanal) {
        this.salario_semanal = salario_semanal;
    }

    /**
     *
     * @return el salario del empleado.
     */
    @Override
    public double calcularSalario() {
        return salario_semanal;
    }

    @Override
    public String toString() {
        return this.getIdentificador() + " " + this.getNombre() + " " + this.getSalario_semanal();
    }
}
