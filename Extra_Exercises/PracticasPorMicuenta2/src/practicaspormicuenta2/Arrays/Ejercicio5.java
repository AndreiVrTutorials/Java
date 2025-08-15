/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta2.Arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Andrei
 * Crear una matriz 3x10 de letras aleatorias.
 * Mostrar la matriz en formato de tabla, como una cuadrícula, de manera clara.
 * Realizar algunas operaciones:
 * Muestra cuantas veces sale la 'A'
 * 
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Random letras = new Random();
        
        //creamos el array
        char[][] matriz = new char[3][10];
        
        //rellenamos el array
        for(int i=0; i< matriz.length;i++){
            for(int j = 0; j< matriz[i].length; j++){
                matriz[i][j] = (char)('A' + letras.nextInt(26));
            }
            
        }
        
        //enseñamos el array
        //System.out.println(Arrays.deepToString(matriz));
        System.out.println("Matriz: ");
        for(int i = 0; i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        
        char letraBuscar ='A';
        int contador=0;
        //bucle para buscarla
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j < matriz[i].length;j++){
                if (matriz[i][j] ==letraBuscar){
                    contador++;
                }
            }
        }
        System.out.println("La letra: " + letraBuscar + " ,aparece " + contador);
    }
}
