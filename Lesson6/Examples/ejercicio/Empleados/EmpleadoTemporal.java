/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.Empleados;

import java.time.LocalDate;

/**
 *
 * @author Andrei
 */
public class EmpleadoTemporal extends Empleado{
    private LocalDate fechaAlta;
    private LocalDate fechaBaja;
    private final double salarioMes =1134 ;

    public EmpleadoTemporal(LocalDate fechaAlta, LocalDate fechaBaja, String DNI, String nombre, String apellido) {
        super(DNI, nombre, apellido);
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public double getSalarioMes() {
        return salarioMes;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
    
    @Override
    public String toString() {
        String s= "( " + this.getClass().getName()+ " )" + " " + super.toString() + " ";
        return s + "fechaAlta= " + fechaAlta + ", fechaBaja= " + fechaBaja;
    }
    //override
    public double calcularSalarioMensual(){
        return this.salarioMes;
    }
}
