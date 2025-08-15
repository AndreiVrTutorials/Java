/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 *Escribe un programa EstanEnOrden que lea tres enteros y diga si están ordenados de menor
a mayor, de mayor a menor o desordenados.
 */
public class EstanEnOrden {
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int a = sc.nextInt();
        System.out.println("Introduce un número: ");
        int b = sc.nextInt();
        System.out.println("Introduce un número: ");
        int c = sc.nextInt();
        
        if (a < b && b < c){
            System.out.println("Están ordenados");
        }else if(c < b && b < a) {
            System.out.println("Estan desordenados");
        }else{
            System.out.println("Estan desordenados");
        }
       }
}
