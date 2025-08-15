/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.Empleados;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


/**
 *
 * @author Andrei
 */
public class EmpleadoFijo extends Empleado{
    private LocalDate fechaAlta;
    private int anioAlta;
    private double salarioBase;
    private double complemento;

    public EmpleadoFijo(LocalDate fechaAlta, double salarioBase, double complemento, String DNI, String nombre, String apellido) {
        super(DNI, nombre, apellido); //primero actuan los constructores del padre luego las del hijo
        this.fechaAlta = fechaAlta;
        this.salarioBase = salarioBase;
        this.complemento = complemento;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public int getAnioAlta() {
        return anioAlta;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getComplemento() {
        return complemento;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    private void setAnioAlta(int anioAlta) {
        this.anioAlta = this.fechaAlta.getYear();
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setComplemento(double complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        String s= super.toString();
        return s + "fechaAlta= " + fechaAlta + ", anioAlta= " + anioAlta + ", salarioBase= " + salarioBase + ", complemento= " + complemento;
    }
    //override
    public double calcularSalarioMensual(){
        ///correjir
        double salario=this.salarioBase +
                (this.complemento * ChronoUnit.YEARS.between(LocalDate.now(), fechaAlta));
        return salario;
    }
    
}