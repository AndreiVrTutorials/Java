/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author marmuñma
 */
public class EcuacionCuadratica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Entrada por teclado de los datos
        System.out.println("Introduce el valor de a: ");
        double a = sc.nextDouble();

        System.out.println("Introduce el valor de b: ");
        double b = sc.nextDouble();

        System.out.println("Introduce el valor de c: ");
        double c = sc.nextDouble();

        //Si el numero a es distinto de 0 , se realiza el calculo y se obtienen los resultados
        if (a != 0) {
            double discrimiante = Math.pow(b, 2) - 4 * a * c;
            //prueba
            System.out.println(discrimiante);
            /////////
            if (discrimiante < 0) {
                System.err.println("Raices complejas");
            } else {
                double x1 = ((-b) + Math.sqrt(discrimiante) / (2 * a));
                double x2 = ((-b) - Math.sqrt(discrimiante) / (2 * a));
                //Se muestran los resultados formateados
                System.out.println("x1: " + x1);
                System.out.println("x2: " + x2);
            }

        } else { //Error si el valor de 'a' no es menor a 0 ni mayor o igual a 1
            System.err.println("ERROR: El valor de a no debe ser 0 ");
        }

    }
}
