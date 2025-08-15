/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author vroan
 */
public class GetCharFromAsciiCode {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Introduce un valor ASCII: ");
        int num= sc.nextInt();
        char caracter = (char)num;
        System.out.println("El caracter asociiado al ASCII " + num + " es: "+ caracter);
            
    } 
}
