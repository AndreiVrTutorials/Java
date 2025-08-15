/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaspormicuenta;

import java.util.Scanner;

/**
 *
 * @author Andrei
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String mensaje= saludo();
        System.out.println(mensaje);
        Ejercicio20 contar= new Ejercicio20();
        contar.contar(1);
        System.out.println(" ");
        System.out.println("Introduce un numero entero para calcular su factorial: ");
        int i = sc.nextInt();
        System.out.println(" ");
        System.out.println("Factorial de: " +i + " es " + contar.factorial(i));
        
    }
    
    public static String saludo(){
        return ("hola");
    }
    //ejemplos de recursividad (llamaere a si mismo)
    public void contar(int i){
    System.out.print(i + " ");
    if(i==99) return;// ponemos un limite porque sino es infinito
    contar(++i);
    }
    //factorial de 4
    public int factorial(int n){
    if(n==0) return 1;
    return n * factorial(n-1);
    }

}
