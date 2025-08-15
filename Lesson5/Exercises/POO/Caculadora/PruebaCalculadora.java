/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.poo.ejercicios.Caculadora;

/**
 *
 * @author Andrei
 */
public class PruebaCalculadora {
    public static void main(String[] args) {
        System.out.println(new Calculadora());
        
        double suma = Calculadora.sumar(10, 5);
        double resta = Calculadora.restar(10, 5);
        double multiplicacion = Calculadora.multiplicar(10, 5);
        //double division = Calculadora.dividir(10, 5);
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
       // System.out.println("Division: " + division);
    }
}
