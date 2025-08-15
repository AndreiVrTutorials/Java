/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

/**
 * factorial --> N!= N*(N-1)!
 * @author vroan
 */
public class Recursividad2 {
    
    public int factorialN(int n){
        if(n==1)return 1;
        return n *factorialN(n-1);
    }
    public static void main(String[] args) {
        Recursividad2 app= new Recursividad2();
        int numero = 5; 
        int resultado = app.factorialN(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
}
