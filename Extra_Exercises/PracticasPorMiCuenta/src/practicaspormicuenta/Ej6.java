/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta;

import java.util.Scanner;

/**
 *
 * Escribe un programa Binario que lea tres números, en tres entradas independientes desde el
 * teclado (del bit más significativo al menos significativo). Estos números deberán ser o 0 o 1,
 * de modo que si el usuario introduce otro número distinto a 0 o 1 el programa finalizará
 * mostrando al usuario un mensaje de error. El programa debe tratar estos números como si
 * se tratasen de un número binario de tres bits y mostrar su valor en decimal. 
 */
public class Ej6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double decimal;
        System.out.println("Introduzca un bit(2): ");
        int b2=sc.nextInt();
        System.out.println("Introduzca un bit (1): ");
        int b1=sc.nextInt();
        System.out.println("Introduzca un bit (0): ");
        int b0= sc.nextInt();
        if(b2!=0 &&b2!=1 || b1!=0 && b1!=1 || b0!=0 && b0!=1 ){
            System.err.println("Error. Introduzca datos válidos.");
        }else{
            decimal = b2*Math.pow(2,2) + b1*Math.pow(2, 1) + b0*Math.pow(2, 0);
            System.out.println("En decimal es: " + decimal);
        }
    }
}
