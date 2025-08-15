/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.Ej2;

/**
 *
 * @author Andrei
 */
public class appEmpleados {
    public static void main(String[] args) {
        Programador programador= new Programador(100, 50, 4240, "Sandra", "De Cruz", 2000, 2);
        System.out.println(programador);
        System.out.println("Sueldo total con todos los extras: " + programador.salario() + " euros.");
    }
}
