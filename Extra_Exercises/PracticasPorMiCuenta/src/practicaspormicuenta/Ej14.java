/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta;

import java.util.Scanner;

/**
 *
 * Concatenación de cadenas. Escribe un programa que pida al usuario cadenas de texto 
 * repetidamente y las concatene. A la pregunta, ¿cuantas cadenas tiene que meter? 
 * Las que quiera, hasta que no meta nada. Momento en el que se mostrarán todas las 
 * cadenas introducidas concatenadas.
 */
public class Ej14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String palabra;
        String resultado="";
        System.out.println("Introduzca una palabra");
        palabra=sc.nextLine();
        
        while(palabra.length() !=0){
            resultado+=palabra + " "; //suma de palabras y un espacio entre ambas
            System.out.println("Introduzca una palabra");
            palabra=sc.nextLine();
        }
        System.out.println("La concatenacion es: " +resultado);
    }
    
}
