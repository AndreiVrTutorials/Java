/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * programa que muestre y cuente los multiplos de 2 y 3 que hay entre 1 y 100
 */
public class Multiplos2 {
    public static void main(String[] args) {
        int multiplos2=0; // almacena el numero de multiplos de 2 que hay
        int multiplos3=0; // almacena el numero de multiplos de 3 que hay
        int i=1;
        
       System.out.println("Múltiplos de 2 entre 1 y 100: ");
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
                multiplos2++;
            }
            i++;
        }
        i=0;
        System.out.println("Múltiplos de 3 entre 1 y 100:");
        while (i <= 100) {
            if (i % 3 == 0) {
                System.out.println(i);
                multiplos3++;
            }
            i++;
        }
       
    }
    
}
