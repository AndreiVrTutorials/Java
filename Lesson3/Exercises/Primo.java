/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.Ejercicios2;

import java.util.Scanner;

/**
 *
 * @author vroan
 */
public class Primo {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         System.out.print("Introduce un numero entero: ");
         int n = sc.nextInt();
         
         //vemos si es primo, buscando algún divisor
         //entre(1,n)
         
         int i=2; // numero a comprobar si es divisor
         boolean primo = true;
         while(i <n ){// equivalente a comparar con true
             if(n%i==0){
                 primo=false;
             }
             i++;
         }
         if(primo) System.out.println("Numero primo");
         else System.out.println("Numero NO primo");
     }
}