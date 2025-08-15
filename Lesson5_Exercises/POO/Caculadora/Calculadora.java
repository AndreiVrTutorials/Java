/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.poo.ejercicios.Caculadora;

/**
 *
 * @author Andrei
 */
public class Calculadora {
    
    static public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    static public double restar(double num1, double num2) {
        return num1 - num2;
    }

    static public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    
    static public double dividir(double num1, double num2) throws Exception {
        if (num2 == 0) {
            throw new Exception("No se puede dividir entre cero.");
        }
        return num1 / num2;
    }
    static public double resto(double num1, double num2) throws Exception {
        if (num2 == 0) {
            throw new Exception("No se puede calcular el resto con divisor igual a cero.");
        }
        return num1 % num2;
    }

    @Override
    public String toString() {
        return "Calculadora:";
    }

  
}
