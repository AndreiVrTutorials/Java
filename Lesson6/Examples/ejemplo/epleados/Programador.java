/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.epleados;

/**
 *
 * @author Andrei
 * Modela las caracteristicas especificas de los empleados tipo programador
 */
public class Programador extends Empleado{
    private double precioHora;
    private double horas;

    //constructor por defecto, sin parametros
    public Programador(){
        System.out.println("Se ha creado un programador");
        
        this.horas=0;
        this.precioHora=0;
    }
    //al ser heredado, primero llama al constructor del padre (empleado), y luego la especifica del hijo 
    
    //cònstructor con parametros
    public Programador( String nombre, String apellido, double horas, double precioHoras){
        super(nombre,apellido);
        System.out.println("Se ha creado un programador");
        this.horas=horas;
        this.precioHora=precioHora;

    }
    
    public double getPrecioHora() {
        return precioHora;
    }

    public double getHoras() {
        return horas;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
    
    //redefinimos el metodo eredado calcularSalarioMes
    @Override
     public double calcularSalarioMes(){
      return super.calcularSalarioMes() + (this.horas * this.precioHora);
     }

    @Override
    public String toString() {
        return super.toString() + "Programador{" + "precioHora=" + precioHora + ", horas=" + horas + '}';
    }
    
}
