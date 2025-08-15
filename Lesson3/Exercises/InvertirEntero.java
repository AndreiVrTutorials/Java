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
public class InvertirEntero {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero que darle la vuelta: ");
        String num = sc.next();
        char num1;
        String resultado=""; //resultado, almacena la cadena original dada la vuelta
        for (int i =  num.length()-1;i>=0; i--) {
           num1 = num.charAt(i);
           resultado += String.valueOf(num1);
        }
        System.out.println(resultado);
    }
}
