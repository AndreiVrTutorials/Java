/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.Ej2;

/**
 *
 * @author Andrei
 */
public class Empleados {
    protected int codigoEmpleado;
    protected String nombre;
    protected String apellidos;
    protected double salarioBase;
    protected final double bonoAño=200;
    protected int año;
    
    //constructor

    public Empleados(int codigoEmpleado, String nombre, String apellidos, double salarioBase, int año) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salarioBase = salarioBase;
        this.año = año;
    }
    
    //getter
    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getAño() {
        return año;
    }
    
    //setter
    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public double extras(){
        return this.año*this.bonoAño;
    }

    @Override
    public String toString() {
        return "Empleados{" + "codigoEmpleado=" + codigoEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salarioBase=" + salarioBase + ", bonoAnio=" + bonoAño + ", anio=" + año;
    }
    
    
}
