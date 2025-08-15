/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta2.Herencias;

/**
 *
 * @author Andrei
 */
public class appEmpleados {
    public static void main(String[] args) {
        empleados empleado = new empleados("12345678H", 603296149, 1200);
    
        programador programador = new programador(20,100 , "12345678H", 603296149, 1200);
        System.out.println(programador);
        System.out.println(programador.extraHoras());
        System.out.println(programador.salario());
        System.out.println(programador + " su salario total de de" + programador.salario());
    
        director director = new director(3000, "12345678H", 603296149, 1200);
    
    }
}
