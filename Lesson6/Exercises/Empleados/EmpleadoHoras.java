/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.Empleados;

/**
 *
 * @author Andrei
 */
public class EmpleadoHoras extends Empleado{
    private final double precioHoras =50;
    private double horas;

    public EmpleadoHoras(double horas, String DNI, String nombre, String apellido) {
        super(DNI, nombre, apellido);
        this.horas = horas;
    }

    public double getPrecioHoras() {
        return precioHoras;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        String s= "( " + this.getClass().getName()+ " )" + " " + super.toString() + " ";
        return s + "precioHoras= " + this.precioHoras + ", horas= " + this.horas;
    }
    //override
    public double calcularSalarioMes (){
        return this.precioHoras * this.horas;
    }
    
}
