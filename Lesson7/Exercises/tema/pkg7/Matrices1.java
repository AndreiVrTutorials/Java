/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema.pkg7;

import java.util.Arrays;

/**
 *
 * @author Andrei
 */
public class Matrices1 {
    public void mostrarTabla(int[][]matriz){
        int fila =matriz.length;
        int columna=matriz[0].length;
                
        for(int i = 0;i<fila;i++){
            for(int j=0;j<columna;j++){
                System.out.print(matriz[i][j] + " ");//primera i, segunda j
                
            }
            System.out.println();
        }
    }
    public void mostrarTabla_2(int[][]matriz){
        for (int[] vector : matriz) {// tras hacer el bucle, le damos a la bombilla y sale de esta forma
            // i marca por donde me lleva
            System.out.println(Arrays.toString(vector)); // visualizamos el vector
        }
        for(int i =0;i<matriz.length;i++){
            System.out.println(Arrays.toString(matriz[i]));
        }

    }
    
    public static void main(String[] args) {
        Matrices1 app = new Matrices1();
        //declaracion matriz enteros
        int[][] tabla; //filas y columnas  ---> 2 dimensiones
        
        //creacion de la matriz 5x3
        tabla = new int[5][3];//5 filas, 3 columnas
        app.mostrarTabla(tabla);
        System.out.println();
        app.mostrarTabla_2(tabla);//otra forma de representar
    }
}
