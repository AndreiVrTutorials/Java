/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.Empleados;

/**
 *
 * @author Andrei
 */
public class Empleado {
    protected String DNI;
    protected String nombre;//modificador de acceso protected 
    protected String apellido;
   

    public Empleado(String DNI, String nombre, String apellido) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Empleado: " + "DNI= " + DNI + ", nombre= " + nombre + ", apellido= " + apellido;
    }
    /*
    public abstract double calcularSalarioMes (){// con esto indicamos que todos los empleados tienen que tener este metodo
        
    }
    
    */
}
