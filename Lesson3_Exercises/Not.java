/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.Ejercicios2;

import java.util.Scanner;

/**
 *
 * @author vroan
 */
public class Not {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String entrada = "";
        boolean repetir;
        
        do {
            repetir = false; // valor inicial de la bandera
            System.out.println("Introduce un número binario de 8 bits: ");
            entrada = sc.next();
            
            // Comprobación de casos no válidos
            if (entrada.length() != 8) { // Verifica que tenga exactamente 8 bits
                System.out.println("Error. Debes introducir 8 bits.");
                repetir = true;
            } else { // Si tiene tamaño 8, verificamos que solo contenga '0' y '1'
                boolean seguir=true;
                for (int i = 0; i < 8 && seguir==true; i++) {
                    if (entrada.charAt(i) != '0' && entrada.charAt(i) != '1') {
                        System.out.println("Error. Debes introducir solo bits (0 o 1).");
                        repetir = false; // no continuo viendo el resto de bits
                        seguir =true;
                        
                    }
                }
            }
        } while (repetir==true);
        
        // En este punto estamos seguros de que el número binario es de 8 bits
        
        // Algoritmo de NOT binario
        int decimal = 0; // Almacena el valor decimal del NOT
        String not = "";  // Contendrá NOT(entrada) en forma binaria
             
        for (int i = 0; i < entrada.length(); i++) { // Iteramos sobre todos los bits
            char bit = entrada.charAt(i);
            if (bit == '0') {
                not = not + '1'; // Cambiamos 0 a 1
                decimal = decimal + (int)(Math.pow(2, entrada.length() - 1 - i)); // Calcula el valor decimal
            } else if (bit == '1') {
                not = not + '0'; // Cambiamos 1 a 0
            }
        }
        
        // Imprimimos los resultados
        System.out.println("NOT(" + entrada + "): " + not);
        System.out.println("NOT(" + entrada + ") en decimal: " + decimal);
    }
}