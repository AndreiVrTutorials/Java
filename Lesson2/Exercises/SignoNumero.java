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
public class SignoNumero {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int entero = sc.nextInt();

         System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        if(numero> 0){
            System.out.println("Es positivo");
        }else if(numero < 0){
            System.out.println("Es negativo");
        }else{
            System.out.println("El numero es nulo");
        }
     }
}
