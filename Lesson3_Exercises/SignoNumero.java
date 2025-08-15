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
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número: ");
        double num = sc.nextDouble();
        if (num > 0){
            System.out.println("El numero " + num + " es positivo");
        }if (num == 0){
            System.out.println("El numero " + num + " es cero");
        }if (num < 0){
            System.out.println("El numero " + num + " es negativo");
        }
    }
    
}
