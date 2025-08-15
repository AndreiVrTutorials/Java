/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta;

import java.util.Scanner;

/**
 *
 * programa en el que se introduzcan dos frases,
 * y diga cual es la mas larga
 */
public class Ej5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String frase1,frase2;
        do{
        System.out.println("Introduzca una frase: ");
        frase1= sc.nextLine();
        System.out.println("Introduzca una segunda frase: ");
        frase2= sc.nextLine();
        
        if(frase1.length()>frase2.length()){
            System.out.println("La frase " + frase1 + " es la mas larga.");
        }else if (frase1.length()<frase2.length()){
            System.out.println("La frase " + frase2 + " es la mas larga.");
        }else{
            System.out.println("Tienen la misma longitud");
        }
        }while(!frase1.isEmpty() && !frase2.isEmpty());
    }
}
