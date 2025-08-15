/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema.pkg7.ejercicios;

import java.util.Random;

/**
 *
 * @author Andrei
 */
public class MatrizTraspuesta {
    public void imprimirMatriz(int[][] matriz){
        for (int i = 0; i<matriz.length;i++){
            for (int j=0; j<matriz.length;j++){
                System.out.printf("%4d",matriz[i][j]);
            }
            System.out.println();
        }
    }
    public void llenarMatriz(int [][]matriz){
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
              matriz
            }
        }
    }
    public int [][]generarTraspuesta (int[][]matriz){
        
    }
    public static void main(String[] args) {
        MatrizTraspuesta app = new MatrizTraspuesta();
        
        int[][] matriz = new int[4][5];
        app.llenarMatriz(matriz);
        app.imprimirMatriz(matriz);
        int [][] traspuesta = app.matrizTraspuesta;
        
    }
}
