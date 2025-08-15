/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.util.Scanner;

/**
 *
 * @author vroan
 */
public class EjemploOperadoresAritmetico {
    public static void main(String[] args) {
        
        /*int a=12;
        int b=5;
        System.out.println("Suma: " + (a+b));
        System.out.println("Suma: " + (a-b));
        System.out.println("Suma: " + (a*b));
        System.out.println("Suma: " + ((double)a/b));
        System.out.println("Suma: " + (a%b));
        */
        // ejemplo operador interrogante
        //si la persona es mayor de edad recibe una beca de 00, sino no recive beca
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduce tu edad: ");
        int edad =sc.nextInt();
        boolean mayorDeEdad = (edad > 18); // tambien se puede con una expresión boleana
        
        double beca=(edad >=18)? 500:0;
        
        System.out.println("Tu beca es de: "+ beca + "$");
        
        //otro ejemplo de ?
        //Pido una nota y el programa dice si esta aprobado o suspenso
        
        System.out.println("Introduce nota del examen: ");
        double nota =sc.nextDouble();
        String calificacion=(nota > 5)?"Aprobado": "Suspenso";
        System.out.println("Está: " + calificacion);
    }
}
