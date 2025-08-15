/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta;

import java.util.Scanner;

/**
 *
 * programa en el que se pide al usuario una palabra y te diga cuantas vocales tiene
 */
public class Ej9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca una palabra: ");
        String palabra=sc.next().toLowerCase();
        int conteo=0;
        for(int i=0;i<palabra.length();i++){
            char  vocal=palabra.charAt(i);   
            if(vocal=='a'||vocal=='e'||vocal=='i'||vocal=='o'||vocal=='u'){
                conteo++;
            }
        }
        
        System.out.println("Hay " + conteo +" vocales.");
        
    }
}
