/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta2.Herencias;

/**
 *
 * @author Andrei
 */
public class empleados {
    private String dni;
    private int numero;
    private double salarioBase;

    public empleados(String dni, int numero, double salarioBase) {
        this.dni = dni;
        this.numero = numero;
        this.salarioBase = salarioBase;
    }

    public String getDni() {
        return dni;
    }

    public int getNumero() {
        return numero;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    

    @Override
    public String toString() {
        return "Empleado{" + "dni=" + dni + ", numero=" + numero + ", salarioBase=" + salarioBase + '}';
    }
    
    
    
}
