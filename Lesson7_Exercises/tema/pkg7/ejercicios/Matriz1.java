/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema.pkg7.ejercicios;

/**
 *
 * @author Andrei
 */
public class Matriz1 {

    // Método para imprimir la matriz
    public void imprimirMatriz(int[][] matriz){
        for (int i = 0; i<matriz.length;i++){
            for (int j=0; j<matriz.length;j++){
                System.out.printf("%4d",matriz[i][j]);
            }
            System.out.println();
        }
    }

    // Método para sumar todos los elementos de la matriz
    public int sumaMatriz(int[][] matriz) {
        int suma = 0;
        for (int[] fila : matriz) {
            for (int num : fila) {
                suma += num;
            }
        }
        return suma;
    }

    // Método para imprimir la diagonal principal
    public void diagonal(int[][] matriz) {
        System.out.println("Elementos de la diagonal principal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }

    // Método para llenar la matriz según las condiciones dadas
    public void llenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i % 2 == 0) { // Filas pares (múltiplos de 2)
                    matriz[i][j] = (j + 1) * 2;
                } else { // Filas impares (múltiplos de 3)
                    matriz[i][j] = (j + 1) * 3;
                }
            }
        }
    }

    public static void main(String[] args) {
        Matriz1 app = new Matriz1();
        int[][] matriz = new int[5][5];

        app.llenarMatriz(matriz);
        System.out.println("Matriz generada:");
        app.imprimirMatriz(matriz);

        System.out.println("\nSuma de todos los elementos: " + app.sumaMatriz(matriz));

        app.diagonal(matriz);
    }
}
