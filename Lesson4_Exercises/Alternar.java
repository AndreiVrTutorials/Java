/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;



/**
 * Escribe un programa Alternar que imprima las letras de una frase introducida por teclado de 
 * una forma alternativa, es decir, una de la parte inicial y la siguiente de la final hasta recorrer 
 * todos los caracteres de la misma.
 * Ejemplo:
 * Introduce cadena: Abrigo 
 * Resultado: Aobgri
 * 
 */
import java.util.Scanner;

public class Alternar {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que introduzca una cadena
        System.out.print("Introduce cadena: ");
        String cadena = scanner.nextLine();
        
        // Variables para controlar el índice inicial y el índice final
        int inicio = 0;
        int fin = cadena.length() - 1;
        
        StringBuilder resultado = new StringBuilder();

        // Alternar caracteres desde el principio y el final
        while (inicio <= fin) {
            // Añadir el carácter del inicio
            resultado.append(cadena.charAt(inicio));
            inicio++;
            
            // Añadir el carácter del final si el inicio no lo ha alcanzado
            if (inicio <= fin) {
                resultado.append(cadena.charAt(fin));
                fin--;
            }
        }

        // Mostrar el resultado
        System.out.println("Resultado: " + resultado.toString());
    }
}

