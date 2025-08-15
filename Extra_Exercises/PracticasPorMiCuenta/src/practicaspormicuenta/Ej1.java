/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * 1. que pida la nota y diga si es aprobado o no. Uno con bucle y otro con ?
 */
public class Ej1 {
    public static void main(String[] args) {
        ///apartado a///
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduzca su nota: ");
        double nota=sc.nextDouble();
        String calificacion =(nota>=5)? "aprobado":"suspenso";
        System.out.println("Usted ha: " + calificacion);
        
        ///apartado b////
        System.out.println("Introduzca otra nota: ");
        double nota2=sc.nextDouble();
        if(nota2>=5){
            System.out.println("Usted ha aprobado, enorabuena");
        }else{
            System.out.println("Usted ha suspendido. Estudia más la próxima vez");
        }
        
        /////EJERCICIO2//// Al apartado a, añade un error en caso de que no se introduzca un numero  entre
        // 0 y 10 y en caso de que introduzca una letra
        
        System.out.println("Introduzca su nota: ");
        try {
            double nota3 = sc.nextDouble(); // Intentamos leer el número
            if (nota3 >= 0 && nota3 <= 10) {
                String calificacion2 = (nota3 >= 5) ? "aprobó" : "suspendió";
                System.out.println("Usted: " + calificacion2);
            } else {
                System.err.println("Error. Debes introducir la nota entre 0 y 10.");
            }
        } catch (InputMismatchException ex) { //para cuando se introduce una letra en vez de un numero, en vez de salir la excepcion, sale un error
            System.err.println("Error. Introduzca un dato numérico comprendido entre 0 y 10.");
        }
    }
}