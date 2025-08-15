/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta.poo.eej1;

/**
 *
 * @author Andrei
 */
public class appEj1 {
    public static void main(String[] args) {
        Ej1 empleado=new Ej1(102, "Andrei", 2, 20);
        empleado.setApellido("Vrote");
        System.out.println(empleado + ", apellido=" + empleado.getApellido() + '}');
        System.out.println("Extras: " + empleado.comisionTotal());
        Ej1 bucle= new Ej1(0, "", 0, 0);
        //bucle
        bucle.setA(12);
        bucle.setB(2);
        System.out.println(bucle.bucle());
        //recursividad
        System.out.println(bucle.recursividad(1));
    }
}
