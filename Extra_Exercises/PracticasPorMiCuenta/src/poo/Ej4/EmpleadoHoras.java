/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.Ej4;

/**
 *
 * @author Andrei
 */
public class EmpleadoHoras extends Empleado{
    private double horas;
    private double precioHoras;
    
    public EmpleadoHoras(double horas, double precioHoras){
        this.horas=horas;
        this.precioHoras=precioHoras;
    }

    @Override
    double calcularSalario() {
        return horas * precioHoras;
    }
    
}
