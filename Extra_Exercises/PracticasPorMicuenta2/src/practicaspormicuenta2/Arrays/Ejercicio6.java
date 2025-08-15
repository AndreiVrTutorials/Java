/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta2.Arrays;

/**
 * del examen año pasado, el 2
 * @author Andrei
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        //instanciamos la matriz
        int[][] matriz = new int[10][10];
        
        //llenamos la matriz
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                matriz[i][j]= (i+1) * (j+1);
            }
        }
        
        //fila de arriba
        System.out.println("   ");
        for (int j=1;j<matriz.length;j++){//para que empiece desde 1 y no desde 0
            System.out.printf("%3d ", j);
        }
        System.out.println("\n--------------------------------------");
              
        //bucle para ver la matriz
        for(int i=0;i<matriz.length;i++){
            System.out.printf("%2d |", i +1);//numero columna
            for(int j = 0; j< matriz.length;j++){
               System.out.printf("%4d", matriz[i][j]);
            }
             System.out.println();
        }
       
    }
}
