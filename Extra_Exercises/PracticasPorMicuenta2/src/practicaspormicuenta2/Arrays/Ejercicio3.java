/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta2.Arrays;

import java.util.Scanner;

/**
 * UNIDIMENSIONAL
 * @author Andrei
 * Ejercicio:
 * Crea un programa que declare un array de 6 números enteros.
 * Pida al usuario que ingrese esos 6 números.
 * Luego, muestra el número mayor, el menor y el promedio de esos números.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declaracion de array
        int[] numeros = new int[6];
        
        for(int i =0; i< numeros.length;i++){
            System.out.println("Introduce 6 numeros");
            numeros[i] = sc.nextInt();
        }
        
        //iniciamos las siguientes variables
        
        int max = numeros[0];
        int min = numeros[0];
        int suma= 0;
        
        //recorremos el array para determian maximo y minimo
        
        for (int i= 0; i<numeros.length; i++){
            if(numeros[i] >max){
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
