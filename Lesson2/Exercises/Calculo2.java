/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 *Escribe un programa Calculo que acepte por teclado dos números y una operación aritmética
y muestre el resultado por pantalla.
Las posibles operaciones a realizar serán la suma, resta, multiplicación, división y resto sobre
números reales. 
* resuelto con if-else
 */
public class Calculo2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    System.out.print("Introduce primer numero: " );
    double numero1= sc.nextDouble();
    System.out.print("Introduce un segundo numero: " );
    double numero2= sc.nextDouble();
    System.out.print("Elije una operacion (+,-,x,/,%): " );
    char operacion= sc.next().charAt(0);
    
    //vemos lo que contiene la variable operacion
    //para realizar la operación correspondiente
        if(operacion == '+'){ // si condicion cierta
        // hacemos la suma
        System.out.println("la suma es: " + (numero1 + numero2));
          }else if(operacion == '-'){ // si condicion cierta
         
         System.out.println("la resta es: " + (numero1 - numero2));

           }else if(operacion == 'x'|| operacion == 'X'){ // si condicion cierta, || es el or lógico
        
         System.out.println("la multiplicacion es: " + (numero1 * numero2));

         }else if(operacion == '/'){ // si condicion cierta
        
         System.out.println("la división es: " + (numero1 / numero2));
         }else if(operacion == '%'){ 
         System.out.println("la operación es: " + (numero1 % numero2));

         }else {
             System.err.println("Error. Operacion no valida.\nIntentalo de nuevo.");
         }
      }
}
