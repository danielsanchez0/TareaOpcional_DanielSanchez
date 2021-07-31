/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 * clase principal
 *
 * @author DANIEL FERNANDO SANCHEZ ORTIZ
 * @version 1.0
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Control control = new Control();
        
        System.out.println("total");
        System.out.println(control.calcularSalario());
    }
}
