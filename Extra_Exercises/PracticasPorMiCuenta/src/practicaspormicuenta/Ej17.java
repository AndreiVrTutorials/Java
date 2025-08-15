/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta;

import java.util.Random;

/** Random random = new Random();
 *
 * Escribe un programa llamado OperacionesAritmeticas que genere dos números enteros
 * aleatorios A y B entre 0 y 10 (ambos inclusive) y muestre las 5 operaciones aritméticas básicas
 * +, -, *, / y % que pueden hacerse entre ellos en el sentido A op B. Utiliza para generar los
 * números aleatorios el método random() de la clase Math.
 */
public class Ej17 {
    public static void main(String[] args) {
    int A = (int)(11*Math.random());
    int B = (int)(11*Math.random());
    ///operaciones
    //suma
    int resultado1 = A+B;
    System.out.println("Suma de " +A + " y " + B + " es: " + resultado1);
    
    //resta
    int resultado2 = A-B;
    System.out.println("Resta de " +A + " y " + B + " es: " + resultado2);
    
    //multiplicacion
    int resultado3= A*B;
    System.out.println("Multiplicacion de " +A + " y " + B + " es: " + resultado3);
    
    if (B==0){
        System.err.println("Resultado infinito en la division.");
    }else{
        //division
        int resultado4=A/B;
        System.out.println("Division de " +A + " y " + B + " es: " + resultado4);

        //%
        int resultado5=A%B;
        System.out.println("% de " +A + " y " + B + " es: " + resultado5);
    }
    
    }
    
}
