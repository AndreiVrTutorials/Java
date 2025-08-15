/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.Ej4;

/** POLIMORFISMO
 * BASE 
 * @author Andrei
 */
public abstract class Empleado {
    abstract double calcularSalario();//ligadura dinamica en ejecucion
    public void mensaje (){//para la ligadura estatica en compilacion
        System.out.println("Saludos");
    }
        
}
