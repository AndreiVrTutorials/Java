/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta2.Arrays;

import java.util.Scanner;

/**
 * UNIDIMENSIONAL
 * @author Andrei
 * Crea un programa que:
 * Declare un array de 5 números enteros.
 * Pida al usuario que ingrese los 5 números (usa Scanner).
 * Luego, muestra el número más grande, el más pequeño y el promedio de los números ingresados.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        //declaracion array
        int [] numeros = new int[5];
        
        for(int i =0; i< numeros.length;i++){
            System.out.println("Introduce 5 enteros " + (i+1) + " : ");
            numeros[i]= sc.nextInt();
        }
        // Inicializar las variables para encontrar el número más grande y el más pequeño
        int max = numeros[0];
        int min = numeros[0];
        int suma = 0;
        
        for(int i=0; i<numeros.length;i++){ //recorremos el array y buscamos el mas grande y pequeño
            if (numeros[i]> max){
                max= numeros[i];
            }
            if (numeros[i]<min){
                min = numeros[i];
            }
            suma +=numeros[i];
        }
        
        //promedio
        double promedio = (double)suma / (double)numeros.length;
        System.out.println("Numero mas grande: " + max);
        System.out.println("Numero mas pequeño: " + min);
        System.out.println("Promedio: " + promedio);
   }
 
}
