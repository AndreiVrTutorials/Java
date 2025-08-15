/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.Ej2;

/**
 *
 * @author Andrei
 */
public class Programador extends Empleados{
    private double horas;
    private double precioHora;

    public Programador(double horas, double precioHora, int codigoEmpleado, String nombre, String apellidos, double salarioBase, int año) {
        super(codigoEmpleado, nombre, apellidos, salarioBase, año);
        this.horas = horas;
        this.precioHora = precioHora;
    }

    public double getHoras() {
        return horas;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }
    
    @Override
    public double extras(){
        return this.horas*this.precioHora;
    }
    public double salario(){
        return super.salarioBase+super.extras()+ extras();
    }

    @Override
    public String toString() {
        String s = super.toString();
        return s + " Tipo empleado: Programador{" + "horas=" + horas + ", precioHora=" + precioHora + '}' + '}';
    }
    
}
