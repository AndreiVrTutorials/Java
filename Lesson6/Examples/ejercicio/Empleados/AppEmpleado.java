/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.Empleados;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Andrei
 */
public class AppEmpleado {
    /*
    public static void nomina(Empleado empleado){
    System.out.println(empleado.calcularSalarioMensual());
    }
    */
    public static void main(String[] args) {
        EmpleadoFijo empf=new EmpleadoFijo(LocalDate.of(2024, Month.MARCH, 20), 1500, 600, "12345678M", "Pepe", "Rubia");
        System.out.println(empf);
        System.out.println("Sueldo: " + empf.calcularSalarioMensual()); // en este caso si es polimorfismo, pero de 2 grado no se puede hacer de forma generica
        //este polimorsimo se hace con la  ligadura estatica
        /*
        para que sea del otro tipo, ponemos el metodo en clase empleados de forma abstracto
        */
        EmpleadoTemporal empt=new EmpleadoTemporal(LocalDate.of(2025, Month.JANUARY, 1), LocalDate.now(), "12345678M", "Jose", "All");
        System.out.println(empt.toString());
        System.out.println(empt.calcularSalarioMensual());
        
        EmpleadoHoras emph = new EmpleadoHoras(100, "12345678M", "Andrei", "Vrote");
        System.out.println(emph.toString());
        System.out.println(emph.calcularSalarioMes());
        
        /* tema siguiente???
        Arraylist<Empleado> coleccionEmpleados=new Arraylist<>li;
        coleccionEmpleados.add(emplf);
        coleccionEmpleados.add(emplt);
        coleccionEmpleados.add(emplh);
        for(Empleado empleado: coleccionEmpleados(){
            nomina(empleados);
        }
        
        */
    }
}
