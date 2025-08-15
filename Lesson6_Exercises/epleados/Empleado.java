/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo.epleados;

/**
 *
 * @author Andrei
 * Modela las caracteristicas comunes de todos los empleados de la aplicacion
 */
public class Empleado {

    //atributos
    protected String nombre;
    protected String apellido;
    protected double salarioBase;
    protected final double retencion=0.02;
    protected final double smi=1080;
    
    //constructor por defecto, es el sin parametros
    
    public Empleado(){
        System.out.println("Se ha creado un empleado");
        this.nombre="";
        this.apellido="";
        
    }
    //constructor con parametros, al crear este, el pordefecto se anula
    public Empleado (String nombre, String apellido){
        System.out.println("Se ha creado un empleado");
        this.nombre=nombre;
        this.apellido=apellido;
    }
    
    
    //metodos

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public String datosPersonales(){
        return this.apellido + "," + nombre;
    }
    
    public double calcularSalarioMes(){
        return this.salarioBase - (this.retencion * this.getSalarioBase());
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", salarioBase=" + salarioBase + '}';
    }
    
    //hereda to string modificado
}
