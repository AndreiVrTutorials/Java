/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.Ejercicios2;

/**
 *
 * @author vroan
 */
public class Triangulo1 {
    public static void main(String[] args) {
        int filas=4;
        for(int i=1; i<=filas; i++){ //bucle para filas
            for(int j=1; j<=i; j++){ //bucle para imprimir los numeros de cada linea
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
