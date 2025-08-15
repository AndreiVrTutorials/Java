/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * Programa que muestre al usuario el siguiente menu de opciones
 * a. Opción A
 * b. Opción B
 * c. Opción C
 * d. Opción D
 * q. Salir
 * Introduce opción
 * Cuando el usuario seleccione una opción aparecerá un mensaje de la opción elejida.
 * Si es una opción no contemplada, mostrará un mensaje de error.
 * El proceso se repetirá continuamente hasta que el usuario seleccione 'q', entoces acabará el programa
 */
import java.util.Scanner;

public class OpcionesMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        char opcion=0;//selección del usuario,  ponerlo fuera de los otros para que lo pueda reconocer otros bucles
        while (opcion != 'q')  {
            //mostrar opciones
            System.out.println("Elija una: ");
            System.out.println("a, Opción A");
            
            System.out.println("b, Opción B");
           
            System.out.println("c, Opción C");
          
            System.out.println("d, Opción D");
            
            System.out.println("q, Salir q");
            
            System.out.print("Introduce opción: ");
            opcion=sc.next().toLowerCase().charAt(0);

            switch (opcion) {
                case 'a':
                    System.out.println("Has elegido la Opcion A.");
                    break;
                case 'b':
                    System.out.println("Has elegido la Opcion B.");
                    break;
                case 'c':
                    System.out.println("Has elegido la Opcion C.");
                    break;
                case 'd':
                    System.out.println("Has elegido la Opcion D.");
                    break;
                case 'q':
                    break;
                default:
                    System.err.println("Error. Opcion no valida.");
                    break;
            }
        }
            
    
    }
}
