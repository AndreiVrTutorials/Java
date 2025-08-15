/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author vroan
 */
public class Ticket{
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        
        System.out.println("Total compra con IVA: ");
        double totalConIVA = teclado.nextDouble();
        
        System.out.println("Porcentaje IVA: ");
        double iva = teclado.nextDouble();
        
        // Calculamos el total sin IVA y el monto del IVA
        double totalSinIVA = totalConIVA / (1 + (iva / 100));
        double montoIVA = totalConIVA - totalSinIVA;

        // Mostramos los resultados
        System.out.println("Total compra sin IVA: " + totalSinIVA);
        System.out.println("Total IVA: " + montoIVA);
    }
    
}