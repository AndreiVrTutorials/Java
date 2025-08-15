/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.text.NumberFormat;

/**
 *
 * sale en imagen los metodos hechos en UtilidadesVarias.java
 */
public class PruebaMetodos {
    public static void main(String[] args) {
        UtilidadesVarias app=new UtilidadesVarias();
        //Metodo que recibe un numero entero y devuelve
        //si es par o no
        if(app.par(8)) System.out.println("Es par");
        else System.out.println("Es impar");
        
        //Metodo que recibe como parametro grados Celsius
        //y devuelve grados Fahrenheit
        double gradosCelsius=25.6;
        double gradosF=app.toFahrenheit(gradosCelsius);
        NumberFormat nf=NumberFormat.getInstance(); //para limitar el número de decimales del resultado a 2
        nf.setMaximumFractionDigits(2); 
        System.out.println("Grados F: " + nf.format(gradosF));
        
        //metodo que devuelve el divisor mas grande
        //de un numero recibido como parametro
        int numero=13;        
        System.out.println("El divisor mas grande de " + numero + " es: " + app.divisor(numero));       
        
    }
 
}
