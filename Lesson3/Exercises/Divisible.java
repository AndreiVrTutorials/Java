/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author vroan
 */
public class Divisible {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
         System.out.println("Introduce un número ");
          int num1 = sc.nextInt();
         System.out.println("Introduzca otro número");
          int num2 = sc.nextInt();
         if ((num1%num2) == 0){
             System.out.println("Son divisibles");
         }else{
             System.out.println("No son divisibles");
         }
     }
}
