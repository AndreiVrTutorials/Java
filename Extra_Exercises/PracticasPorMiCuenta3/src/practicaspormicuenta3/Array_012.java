/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta3;

import java.util.Scanner;

/**
 * Crea un programa que declare una matriz 3x3 de enteros.
 * Pide al usuario que ingrese los valores para cada posición de la matriz.
 * Luego, muestra la matriz en formato de tabla (como una cuadrícula).
 * Calcula la suma de todos los elementos de la matriz y muestra el resultado.
 */
public class Array_012 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [][] matriz = new int[3][3];
        
        //bucle para completar la matriz
        for (int i =0; i <matriz.length; i++){
            for(int j = 0; j < matriz.length; j++ ){
                System.out.println("Escriba un numero para: " + i + j);
                matriz[i][j]= sc.nextInt();
            }
        }
        
        //bucle para visualizar la matriz
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        
        //bucle suma elementos
        int suma = 0;
        for(int i =0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                suma += matriz[i][j];
            }
        }
        System.out.println("Suma elementos: " + suma);
    }
    
}
