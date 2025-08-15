/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.Ej4;

/**
 *
 * @author Andrei
 */
public class EmpleadoComision extends Empleado{// suponemos que gana x comisiones por y horas
    private double comisiones;
    private double horas;
    public EmpleadoComision(double comisiones, double horas){
        this.comisiones=comisiones;
        this.horas=horas;
    }

    @Override
    double calcularSalario() {
     return comisiones * horas;   
    }
    
}
