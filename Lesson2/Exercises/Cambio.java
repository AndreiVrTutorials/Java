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
public class Cambio {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final double CAMBIO = 1.12; //tipo de cambio del dolar
        
        System.out.print("Introduce una cantidad en euros: ");
        double euros = sc.nextDouble();
        
        double dolares = euros + CAMBIO;
        System.out.printf("%s %.2f %n","Cambio adolares: ", dolares );
    }
}
