/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta2.Arrays;

import java.util.Scanner;

/**
 * BIDIMENSIONAL // MATRICES
 * Crea un programa que declare una matriz 3x3 de enteros.
 * Pide al usuario que ingrese los valores para cada posición de la matriz.
 * Luego, muestra la matriz en formato de tabla (como una cuadrícula).
 * Calcula la suma de todos los elementos de la matriz y muestra el resultado.
 * @author Andrei
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creacion matriz
        int[][] numeros= new int[3][3];
        //pedimos los valores
        for (int i=0; i<numeros.length;i++){
            for(int j=0; j<numeros[i].length;j++){
                System.out.println("Valor posicion" + i + j );
                numeros[i][j] = sc.nextInt();
            }
        }
        // visualizamos
       for (int i=0; i<numeros.length;i++){
            for(int j=0; j<numeros[i].length;j++){
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }
       //suma
       int suma=0;
       for (int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                suma +=numeros[i][j];
            }
       }
        System.out.println("Suma: " + suma);
    }
}
