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
@DiscriminatorValue("horas")

public class EmpHoras extends Empleados {

    private double valor_horas;
    private float horas_trabajadas;

    public EmpHoras() {
    }

    public EmpHoras(int identificador, String nombre, double valor_horas, float horas_trabajadas) {
        super(identificador, nombre);
        this.valor_horas = valor_horas;
        this.horas_trabajadas = horas_trabajadas;
    }

    /**
     * @return the valor_horas
     */
    public double getValor_horas() {
        return valor_horas;
    }

    /**
     * @param valor_horas the valor_horas to set
     */
    public void setValor_horas(double valor_horas) {
        this.valor_horas = valor_horas;
    }

    /**
     * @return the horas_trabajadas
     */
    public float getHoras_trabajadas() {
        return horas_trabajadas;
    }

    /**
     * @param horas_trabajadas the horas_trabajadas to set
     */
    public void setHoras_trabajadas(float horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

}
