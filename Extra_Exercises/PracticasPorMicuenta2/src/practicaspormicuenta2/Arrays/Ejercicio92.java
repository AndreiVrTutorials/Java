/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta2.Arrays;

import java.util.Arrays;

/**
 * EJERCICIO DE EXAMEN
 * @author Andrei
 */
public class Ejercicio92 {
    public static void main(String[] args) { 
        //creacion de arrays
        int[] array1 = {30, 5, 41, 12, 40, 15, 37}; 
        int[] array2 = {7, 1, 18, 33, 25, 38, 34, 16};
        
        //ordenar, metodo uno (short)
        System.out.println("Usando Arrays.sort() para el primer array:");
        
        System.out.println("Array 1 desordenado: " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Array1 ordenado: "+ Arrays.toString(array1));
        System.out.println("Mediana: " + calcularMediana(array1));
        
        //ordenar, metodo dos, (burbuja)
        System.out.println("Usando metodo burbuja para segundo array");
        System.out.println("Array desordenado: " + Arrays.toString(array2));
        ordenarBurbuja(array2);
        System.out.println("Array ordenado: " + Arrays.toString(array2));
        System.out.println("");
        
    }
    public static double calcularMediana(int[] array){
        int n = array.length;
        if (n % 2 == 1) { // Si es impar, tomamos el valor central
            return array[n / 2];
        } else { // Si es par, hacemos el promedio de los dos valores centrales
            return (array[n / 2 - 1] + array[n / 2]) / 2.0; // si pongo 2 descarta la parte decimal
        }
    }
    public static void ordenarBurbuja (int[]array){
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j-1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            
        }   
    }
}
