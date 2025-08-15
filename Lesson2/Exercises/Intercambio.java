/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author vroan
 */
public class Intercambio {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        System.out.println("variable a = "+ a);
        System.out.println("variable b = "+ b);
        
        int c = a;
        a = b;
        b = c;
        
        System.out.println("variable a = "+ a);
        System.out.println("variable b = "+ b);
        
    }
    
}
