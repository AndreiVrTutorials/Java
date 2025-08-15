/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.epleados;

/**
 *
 * @author Andrei
 */
public class AppEmpleados {
    public static void main(String[] args) {
        Empleado empl = new Empleado(); //objeto empl
        empl.setNombre("Juan");
        empl.setApellido("Perez");
        empl.setSalarioBase(2000);
        System.out.println(empl.datosPersonales());//los que son propios salen en negrita
        System.out.println(empl.calcularSalarioMes());
        System.out.println(empl.toString());
        
        Programador programador = new Programador ();//objeto programador
        programador.setNombre("Andrei");
        programador.setApellido("Vrote");
        programador.setSalarioBase(1500);
        programador.setHoras(100);
        programador.setPrecioHora(50);
        System.out.println(programador.datosPersonales());
        System.out.println(programador.calcularSalarioMes());
        System.out.println(programador.toString());
        
        Empleado empl2 = new Empleado("Paula", "Iz");
        Programador programador2 = new Programador("Manuel", "P", 25, 30);
    }
}
