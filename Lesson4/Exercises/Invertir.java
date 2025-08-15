/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 *Escribe un programa Invertir que invierta los caracteres de una cadena dada, de tal forma, 
 *que los caracteres en mayúsculas los convierta en minúsculas y viceversa.
 *Ejemplo:
 *Cadena original: Hola Macarena
 *Cadena invertida: hOLA mACARENA
 */
public class Invertir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cadena cadena: ");
        String Original = sc.nextLine();
        String invertida="";//almacena la cadena original "invertida"
        
        // Invertir la cadena y cambiar mayúsculas a minúsculas y viceversa
        for (int i = 0; i < Original.length(); i++) {
           
             char caracter=Original.charAt(i);
            // Cambiar mayúsculas a minúsculas
            if (Character.isUpperCase(caracter)) {
                
                invertida=invertida + String.valueOf(caracter).toLowerCase();
             
            // Cambiar minúsculas a mayúsculas
            }else if (Character.isLowerCase(caracter)) {
                invertida=invertida + String.valueOf(caracter).toUpperCase();
            
            // Otros caracteres quedan igual
            } else if (Character.isWhitespace(caracter)) {
              invertida += " ";
            }

        }
        
        // Mostrar la cadena invertida
        System.out.println("Cadena invertida: " + invertida);
        
    }
}
