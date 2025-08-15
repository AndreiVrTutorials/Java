/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.util.Scanner;

/**
 *
 * Ejemplo de introducción de datos desde el teclado
 * Uso de la clase 'Scanner'
 */
public class EntradaDatos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // acceso al teclado, sc es el nobre que hemos elegido
        
        System.out.print("Introduce un numero entero: " );
        int numero= sc.nextInt(); 
        System.out.println("Has elegido el numero entero: " + numero); // sout + control + espacio
        System.out.print("Introduce tu altura (en metros): ");
        
        double altura=sc.nextDouble();
        System.out.println("Mides " + altura + " metros"); // al ejecutar y poner cumeros con decimales, poner coma, sale con punto
        
        System.out.println("Introduce tu nombre ");
        String nombre = sc.next();
        System.out.println("Te llamas " + nombre);
        
    }
    
}
