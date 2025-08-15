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
public class Vocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadena original: ");
        String original = sc.nextLine().toLowerCase(); //COJE HASTA QUE ACABA, SOLO NEXT, HASTA QUE ENCUENTRFA UN ESPACIO
        int conteo = 0;//contador de vocales
        for (int i = 0; i < original.length(); i++) {
            char caracter = original.charAt(i);

            if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                conteo++;
            }
            

        }
        System.out.println("Hay " + conteo + " vocales");
    }
}
