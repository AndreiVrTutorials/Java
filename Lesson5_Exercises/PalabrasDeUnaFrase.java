/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 *  programa que cuente las palabras de una frase introducida por teclado.
	-> metodo que devuelva el nº de palabras.
 */
public class PalabrasDeUnaFrase {
   public static Scanner sc= new Scanner(System.in);
   public static int contarPalabras(String frase) { //metodo que devuelve el numero de palabras
       
        String[] palabras = frase.trim().split("\\s+");
        return palabras.length;
    }
   public static void main(String[] args) {
        
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        int numPalabras = contarPalabras(frase);
        System.out.println("La frase tiene " + numPalabras + " palabra(s).");
   }
}
