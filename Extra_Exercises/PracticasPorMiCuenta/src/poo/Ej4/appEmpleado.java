/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.Ej4;

/**
 *
 * @author Andrei
 */
public class appEmpleado {
    public static void main(String[] args) {
        Empleado emp1= new EmpleadoHoras(100, 20);
        Empleado emp2 = new EmpleadoComision(20, 120);
        emp1.mensaje();// ligadura estatica en compilacion
        emp2.mensaje();
        System.out.println("Salario empleado 1: " + emp1.calcularSalario()); // ligadura dinamica en ejecucion
        System.out.println("Salario empleado 2: " + emp2.calcularSalario());
    }
}
