/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;



/**
 *
 * programa que muestre la suma de los cuadrados de los impares entre 0 y 100
 */
public class CuadradosNumerosPares {// son impares xd
    public static void main(String[] args) {
        int cuadrado=0;
        int i=1;//genera los impares
       
        int sumaImpares=0;
         while (i<=100){
             cuadrado = cuadrado + (i*i);
             i+=2;
             
         }
         System.out.println("La suma del cuadrado de los pares es: " + cuadrado);
    }
}
