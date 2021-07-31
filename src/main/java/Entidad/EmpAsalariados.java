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
 * @author usuario
 */
@Entity
@DiscriminatorValue("asalariado")

public class EmpAsalariados extends Empleados {

    private double salario_semanal;

    public EmpAsalariados() {
    }

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

}
