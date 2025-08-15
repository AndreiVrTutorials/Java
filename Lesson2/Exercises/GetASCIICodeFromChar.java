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
public class GetASCIICodeFromChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Introduce un caracter: ");
        char caracter=sc.next().charAt(0);
        int ascii =(int)caracter;
        System.out.println("Su valor ASCII de tu caracter es: "  + ascii); // conn int sale el valor ASCII
            
    } 
}
