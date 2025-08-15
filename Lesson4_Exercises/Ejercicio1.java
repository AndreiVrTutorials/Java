/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Random;

/**
 *programa que genere 20 aleatorios entre 1 y 1000, y diga cual es el mayor numero generado
 */
public class Ejercicio1 {
    public static void main(String[] args) {
         Random r= new Random();
         int max=0;
         
         for (int i = 0; i < 20; i++) {
            int number = r.nextInt(1000) + 1; // Genera un número entre 1 y 1000
            System.out.print(number + " ");
            if (number > max) {
                max = number; // Actualiza el mayor número si el número actual es mayor
            }
        }

        System.out.println("\nEl mayor numero generado es: " + max);
         
    }
    
}
